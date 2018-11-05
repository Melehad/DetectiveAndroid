package com.brunet.aurelia.detectiveandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mtextTitleMain;
    private TextView mtextTeaser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextTitleMain = findViewById(R.id.activity_main_textTitleMain);
        mtextTeaser = findViewById(R.id.activity_main_textTeaser);

        //methods
        stopTime();
    }

    private void stopTime(){

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivityIntent);
            }
        }, 4000);

    }



}
