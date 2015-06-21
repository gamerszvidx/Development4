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
import java.io.Serializable;
import java.net.ContentHandler;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by gamerszvidx on 17-6-2015.
 */
public class Score implements Serializable {
    String fileName = "SaveData";
    Long score;
    Long sps;
    Long k = (long) 1000;
    Long m = (long) 1000000;
    Long b = (long) 1000000000;
    TextView scoretext;
    TextView spstext;
    Timer timer = new Timer();
    Context context;
    MainActivity main;

    public Score(final Context context, final MainActivity main) {
        this.context = context;
        scoretext = (TextView) ((Activity) context).findViewById(R.id.Score);
        spstext = (TextView) ((Activity) context).findViewById(R.id.sps);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                main.runOnUiThread(new Runnable() //run on ui threa
                {
                    public void run() {

                        if (sps <= Long.MAX_VALUE) {
                            addscore(sps);
                        } else {
                            timer.cancel();
                        }
                    }
                });
            }
        }, 1000, 1000);
    }


    public void addscore(Long scoretoadd) {
        score += scoretoadd;
        if (100 * k <= score && score < m) {
            scoretext.setText("score: " + score / k + "K");
        } else if (m <= score && score < 100 * m) {
            scoretext.setText("score: " + score / k + "K");
        } else if (100 * m <= score && score < b) {
            scoretext.setText("score: " + score / m + "M");
        } else if (b <= score) {
            scoretext.setText("score: " + score / b + "B");
        } else if (b <= score && score < 100*b) {
            scoretext.setText("score: " + score / m + "M");
        } else if (100 * b <= score) {
            scoretext.setText("score: " + score / b + "B");
        }else {
            scoretext.setText("score: " + score);
        }


    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getSps() {
        return sps;
    }

    public void setSps(Long sps) {
        this.sps = sps;
    }

    public void addsps(Long spstoadd) {
        sps += spstoadd;
        if (100 * k <= sps && sps < m) {
            spstext.setText("score per second: " + sps / k + "K");
        } else if (m <= sps && sps < 100 * m) {
            spstext.setText("score per second: " + sps / k + "K");
        } else if (100 * m <= sps && sps < b) {
            spstext.setText("score per second: " + sps / m + "M");
        } else if (b <= sps && sps < 100*b) {
            spstext.setText("score per second: " + sps / m + "M");
        } else if (100 * b <= sps) {
            spstext.setText("score per second: " + sps / b + "B");
        }else {
            spstext.setText("score per second: " + sps);
        }
    }

    public void subtractscore(Long scoretoremove) {
        score -= scoretoremove;
        if (100 * k <= score && score < m) {
            scoretext.setText("score: " + score / k + "K");
        } else if (m <= score && score < 100 * m) {
            scoretext.setText("score: " + score / k + "K");
        } else if (100 * m <= score && score < b) {
            scoretext.setText("score: " + score / m + "M");
        } else if (b <= score) {
            scoretext.setText("score: " + score / b + "B");
        } else if (b <= score && score < 100*b) {
            scoretext.setText("score: " + score / m + "M");
        } else if (100 * b <= score) {
            scoretext.setText("score: " + score / b + "B");
        }else {
            scoretext.setText("score: " + score);
        }
    }
}
