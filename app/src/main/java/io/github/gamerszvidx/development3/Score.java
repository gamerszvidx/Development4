package io.github.gamerszvidx.development3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ContentHandler;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by gamerszvidx on 17-6-2015.
 */
public class Score extends Activity {
    String fileName = "SaveData";
    int score;
    int sps = 0;
    TextView scoretext;
    TextView spstext;
    Timer timer = new Timer();
    Context context;
    MainActivity main;

    public Score(final Context context, final MainActivity main){
        this.context = context;
         scoretext = (TextView) ((Activity)context).findViewById(R.id.Score);
         spstext = (TextView) ((Activity)context).findViewById(R.id.sps);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                main.runOnUiThread(new Runnable() //run on ui threa
                {
                    public void run() {

                        if (sps <= 999999999) {
                            addscore(sps);
                        } else {
                            timer.cancel();
                        }
                    }
                });
            }
        },1000,1000);
    }



    public void addscore(int scoretoadd){
        score+=scoretoadd;
        scoretext.setText("score: " + score);

    }

    public void addsps(int spstoadd){
        sps+=spstoadd;
        spstext.setText("score per second: " + sps);
    }

    public void subtractscore(int scoretoremove){
        score-=scoretoremove;
        scoretext.setText("score: " + score);
    }
    public void save() throws IOException {
        FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE);
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(this);
        os.close();
        fos.close();
    }
    public void load() throws IOException, ClassNotFoundException{
        FileInputStream fis = context.openFileInput(fileName);
        ObjectInputStream is = new ObjectInputStream(fis);
        Score Score = (Score) is.readObject();
        is.close();
        fis.close();
    }
}
