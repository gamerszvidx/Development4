package io.github.gamerszvidx.development3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.net.ContentHandler;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by gamerszvidx on 17-6-2015.
 */
public class Score extends Activity {
    int score;
    int sps = 0;
    TextView scoretext;
    TextView spstext;
    Timer timer = new Timer();
    Context context;


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
        }, 1000, 1000);
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

}
