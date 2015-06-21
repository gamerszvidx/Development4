package io.github.gamerszvidx.development3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ObjectOutputStream out;
    ObjectInputStream in;
    Score score;
    SharedPreferences prefs;
    Long k = Long.valueOf(1000);
    Long m = Long.valueOf(1000000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Code clicker");
        score = new Score(this, this);
        getData();
        createShop();
        setOnClickListeners();

    }

    public void getData() {
        prefs = this.getSharedPreferences(
                "io.github.gamerszvidx.development3.app", Context.MODE_PRIVATE);

        score.score = prefs.getLong("PlayerScore", 0);
        score.sps = prefs.getLong("PlayerSps", 0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Long scorevalue = score.getScore();
        Long spsvalue = score.getSps();
        prefs.edit().putLong("PlayerScore", scorevalue).apply();
        prefs.edit().putLong("PlayerSps", spsvalue).apply();
    }

    public void clicked(View view) {
        score.addscore((long) 1);

    }


    public void createShop() {
        TabHost tabHost = (TabHost) this.findViewById(R.id.tabhost);
        tabHost.setup();
        int tab = 0;

        TabHost.TabSpec tabSpecPoor = tabHost
                .newTabSpec("poor")
                .setIndicator("poor")
                .setContent(R.id.cell1);

        TabHost.TabSpec tabSpecRicher = tabHost
                .newTabSpec("richer")
                .setIndicator("richer")
                .setContent(R.id.cell2);

        TabHost.TabSpec tabSpecEvenRicher = tabHost
                .newTabSpec("even richer")
                .setIndicator("even richer")
                .setContent(R.id.cell3);

        TabHost.TabSpec tabSpecTooRich = tabHost
                .newTabSpec("too rich")
                .setIndicator("too rich")
                .setContent(R.id.cell4);

        // add all tabs
        tabHost.addTab(tabSpecPoor);
        tabHost.addTab(tabSpecRicher);
        tabHost.addTab(tabSpecEvenRicher);
        tabHost.addTab(tabSpecTooRich);

        if (10000 <= score.score && score.score<750*k){
            tab = 1;
        } else if (750 * k <= score.score && score.score<20*m){
            tab = 2;
        } else if (score.score >= 20*m){
            tab = 3;
        } else{tab = 0;}

        tabHost.setCurrentTab(tab);
    }

    public void setOnClickListeners() {
        Button mClickButton1 = (Button) findViewById(R.id.addsps1);
        mClickButton1.setOnClickListener(this);
        Button mClickButton2 = (Button) findViewById(R.id.addsps2);
        mClickButton2.setOnClickListener(this);
        Button mClickButton3 = (Button) findViewById(R.id.addsps3);
        mClickButton3.setOnClickListener(this);
        Button mClickButton4 = (Button) findViewById(R.id.addsps4);
        mClickButton4.setOnClickListener(this);
        Button mClickButton5 = (Button) findViewById(R.id.addsps5);
        mClickButton5.setOnClickListener(this);
        Button mClickButton6 = (Button) findViewById(R.id.addsps6);
        mClickButton6.setOnClickListener(this);
        Button mClickButton7 = (Button) findViewById(R.id.addsps7);
        mClickButton7.setOnClickListener(this);
        Button mClickButton8 = (Button) findViewById(R.id.addsps8);
        mClickButton8.setOnClickListener(this);
        Button mClickButton9 = (Button) findViewById(R.id.addsps9);
        mClickButton9.setOnClickListener(this);
        Button mClickButton10 = (Button) findViewById(R.id.addsps10);
        mClickButton10.setOnClickListener(this);
        Button mClickButton11 = (Button) findViewById(R.id.addsps11);
        mClickButton11.setOnClickListener(this);
        Button mClickButton12 = (Button) findViewById(R.id.addsps12);
        mClickButton12.setOnClickListener(this);
        Button mClickButton13 = (Button) findViewById(R.id.addsps13);
        mClickButton13.setOnClickListener(this);
        Button mClickButton14 = (Button) findViewById(R.id.addsps14);
        mClickButton14.setOnClickListener(this);
        Button mClickButton15 = (Button) findViewById(R.id.addsps15);
        mClickButton15.setOnClickListener(this);
        Button mClickButton16 = (Button) findViewById(R.id.addsps16);
        mClickButton16.setOnClickListener(this);
        Button mClickButton17 = (Button) findViewById(R.id.addsps17);
        mClickButton17.setOnClickListener(this);
        Button mClickButton18 = (Button) findViewById(R.id.addsps18);
        mClickButton18.setOnClickListener(this);
        Button mClickButton19 = (Button) findViewById(R.id.addsps19);
        mClickButton19.setOnClickListener(this);
        Button mClickButton20 = (Button) findViewById(R.id.addsps20);
        mClickButton20.setOnClickListener(this);
        Button mClickButton21 = (Button) findViewById(R.id.addsps21);
        mClickButton21.setOnClickListener(this);
        Button mClickButton22 = (Button) findViewById(R.id.addsps22);
        mClickButton22.setOnClickListener(this);
        Button mClickButton23 = (Button) findViewById(R.id.addsps23);
        mClickButton23.setOnClickListener(this);
        Button mClickButton24 = (Button) findViewById(R.id.addsps24);
        mClickButton24.setOnClickListener(this);
        Button mClickButton25 = (Button) findViewById(R.id.addsps25);
        mClickButton25.setOnClickListener(this);
        Button mClickButton26 = (Button) findViewById(R.id.addsps26);
        mClickButton26.setOnClickListener(this);
        Button mClickButton27 = (Button) findViewById(R.id.addsps27);
        mClickButton27.setOnClickListener(this);
        Button mClickButton28 = (Button) findViewById(R.id.addsps28);
        mClickButton28.setOnClickListener(this);
        Button mClickButton29 = (Button) findViewById(R.id.addsps29);
        mClickButton29.setOnClickListener(this);
        Button mClickButton30 = (Button) findViewById(R.id.addsps30);
        mClickButton30.setOnClickListener(this);
        Button mClickButton31 = (Button) findViewById(R.id.addsps31);
        mClickButton31.setOnClickListener(this);
        Button mClickButton32 = (Button) findViewById(R.id.addsps32);
        mClickButton32.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addsps1: {
                if (score.score >= 50) {
                    score.subtractscore((long) 50);
                    score.addsps((long) 1);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps2: {
                if (score.score >= 200) {
                    score.subtractscore((long) 200);
                    score.addsps((long) 4);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps3: {
                if (score.score >= 300) {
                    score.subtractscore((long) 300);
                    score.addsps((long) 6);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps4: {
                if (score.score >= 500) {
                    score.subtractscore((long) 500);
                    score.addsps((long) 10);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps5: {
                if (score.score >= 1000) {
                    score.subtractscore((long) 1000);
                    score.addsps((long) 20);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps6: {
                if (score.score >= 5000) {
                    score.subtractscore((long) 5000);
                    score.addsps((long) 100);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps7: {
                if (score.score >= 7500) {
                    score.subtractscore((long) 7500);
                    score.addsps((long) 150);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps8: {
                if (score.score >= 10000) {
                    score.subtractscore((long) 10000);
                    score.addsps((long) 200);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps9: {
                if (score.score >= 50000) {
                    score.subtractscore((long) 50000);
                    score.addsps((long) 1000);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps10: {
                if (score.score >= 75000) {
                    score.subtractscore((long) 75000);
                    score.addsps((long) 1500);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps11: {
                if (score.score >= 100000) {
                    score.subtractscore((long) 100000);
                    score.addsps((long) 2000);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps12: {
                if (score.score >= 150000) {
                    score.subtractscore((long) 150000);
                    score.addsps((long) 3000);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps13: {
                if (score.score >= 200000) {
                    score.subtractscore((long) 200000);
                    score.addsps((long) 4000);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps14: {
                if (score.score >= 250000) {
                    score.subtractscore((long) 250000);
                    score.addsps((long) 5000);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps15: {
                if (score.score >= 500000) {
                    score.subtractscore((long) 500000);
                    score.addsps((long) 10000);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps16: {
                if (score.score >= 750000) {
                    score.subtractscore((long) 750000);
                    score.addsps((long) 15000);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps17: {
                if (score.score >= m) {
                    score.subtractscore(m);
                    score.addsps(20 * k);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps18: {
                if (score.score >= 1.5 * m) {
                    score.subtractscore((long) (1.5 * m));
                    score.addsps(30 * k);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps19: {
                if (score.score >= 2.5 * m) {
                    score.subtractscore((long) (2.5 * m));
                    score.addsps(50 * k);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps20: {
                if (score.score >= 5 * m) {
                    score.subtractscore(5 * m);
                    score.addsps(100 * k);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps21: {
                if (score.score >= 7.5 * m) {
                    score.subtractscore((long) (7.5 * m));
                    score.addsps(150 * k);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps22: {
                if (score.score >= 10 * m) {
                    score.subtractscore(10 * m);
                    score.addsps(200 * k);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps23: {
                if (score.score >= 15 * m) {
                    score.subtractscore(15 * m);
                    score.addsps(300 * k);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps24: {
                if (score.score >= 20 * m) {
                    score.subtractscore(20 * m);
                    score.addsps(400 * k);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps25: {
                if (score.score >= 50 * m) {
                    score.subtractscore(50 * m);
                    score.addsps(m);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps26: {
                if (score.score >= 100 * m) {
                    score.subtractscore(100 * m);
                    score.addsps(2 * m);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps27: {
                if (score.score >= 150 * m) {
                    score.subtractscore(150 * m);
                    score.addsps(3 * m);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps28: {
                if (score.score >= 200 * m) {
                    score.subtractscore(200 * m);
                    score.addsps(4 * m);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps29: {
                if (score.score >= 500 * m) {
                    score.subtractscore(500 * m);
                    score.addsps(10 * m);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps30: {
                if (score.score >= 1000 * m) {
                    score.subtractscore(1000 * m);
                    score.addsps(20 * m);
                } else {
                    broke();
                }
                break;
            }
            case R.id.addsps31: {
                if (score.score >= 1500 * m) {
                    score.subtractscore(1500 * m);
                    score.addsps(30 * m);
                } else {
                    broke();
                }
                break;
            }

            case R.id.addsps32: {
                if (score.score >= 2000 * m) {
                    score.subtractscore(2000 * m);
                    score.addsps(40 * m);
                } else {
                    broke();
                }
                break;
            }
        }
    }

    public void broke() {
        Toast.makeText(this, "not enough score", Toast.LENGTH_SHORT).show();
    }

    public void about(View view) {
        Intent about = new Intent(this, AboutPage.class);
        startActivity(about);
    }
}
