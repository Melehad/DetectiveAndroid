package com.brunet.aurelia.detectiveandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Aurelia Brunet on 05/11/2018.
 */
public class HomeActivity extends AppCompatActivity {

    private Button mNewGame = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        mNewGame = findViewById(R.id.textNewGame);



        mNewGame.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent newGameActivityIntent = new Intent(HomeActivity.this, GameActivity.class);
                startActivity(newGameActivityIntent);

            }
        });


    }
}
