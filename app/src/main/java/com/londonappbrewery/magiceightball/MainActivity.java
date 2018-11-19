package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = findViewById(R.id.button);

        final ImageView ball = findViewById(R.id.ball);

        final int[] array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Random generatedRandom = new Random();

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int number = generatedRandom.nextInt(5);

                 ball.setImageResource(array[number]);
            }
        });
    }
}
