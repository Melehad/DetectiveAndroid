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

        mtextTitleMain = findViewById(R.id.textTitleMain);
        mtextTeaser = findViewById(R.id.textTeaser);

        stopTime();

    }



    private void stopTime() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gameActivityIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(gameActivityIntent);
                finish();
            }
        }, 4000);

    }



}
