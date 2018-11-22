package com.brunet.aurelia.detectiveandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextTitleMain;
    private ImageView mImgHourglass;
    private ImageView splash = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextTitleMain = findViewById(R.id.textTitleMain);
        mImgHourglass = findViewById(R.id.hourglass);

        animHourglass();

        stopTime();
        //splash.setAnimation(null);
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
        }, 6000);

    }

    private void animHourglass(){

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                final RotateAnimation anim = new RotateAnimation(0.0f, 360.0f,
                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                anim.setInterpolator(new LinearInterpolator());
                anim.setDuration(1500);
                // Start animating the image
                splash = mImgHourglass;
                splash.startAnimation(anim);

            }
        }, 800);



    }



}
