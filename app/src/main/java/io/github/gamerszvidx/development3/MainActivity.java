package io.github.gamerszvidx.development3;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;


public class MainActivity extends Activity  {


Score score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = new Score(this,this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    public void clicked(View view){
        score.addscore(1);

    }
    public void addsps1(View view){
        if(score.score>=100) {
            score.subtractscore(100);
            score.addsps(5);
        }else{
            Toast.makeText(this,"not enough score",Toast.LENGTH_SHORT).show();}

    }
    public void addsps2(View view){
        if(score.score>=200) {
            score.subtractscore(200);
            score.addsps(10);
        }else{
            Toast.makeText(this,"not enough score",Toast.LENGTH_SHORT).show();}

    }
    public void addsps3(View view){
        if(score.score>=300) {
            score.subtractscore(300);
            score.addsps(15);
        }else{
            Toast.makeText(this,"not enough score",Toast.LENGTH_SHORT).show();}

    }
    public void addsps4(View view){
        if(score.score>=500) {
            score.subtractscore(500);
            score.addsps(25);
        }else{
            Toast.makeText(this,"not enough score",Toast.LENGTH_SHORT).show();}

    }
    public void win(View view){
        if(score.score>=1000000000) {
            score.subtractscore(1000000000);
            Toast.makeText(this,"u won, for now",Toast.LENGTH_LONG).show();
            finish();
            System.exit(0);
        }else{
            Toast.makeText(this,"if you need to ask the price, you can't afford it",Toast.LENGTH_SHORT).show();}

    }
    public void done(View view){
        Toast.makeText(this,"thanks for playing my game",Toast.LENGTH_SHORT).show();
        finish();
        System.exit(0);

    }

}
