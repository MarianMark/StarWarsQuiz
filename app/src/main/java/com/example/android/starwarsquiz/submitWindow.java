package com.example.android.starwarsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class submitWindow extends AppCompatActivity {

    String message;
    String message2 = "Your score is: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_submit_window);

        int result = getIntent().getIntExtra("totalPoints", 0);


        if (result <= 2) {
            message = "Watch some more!";
        } else if (result <= 4) {
            message = "Nice";
        } else if (result <= 6) {
            message = "Congratulations! You really are a Star Wars fan!";
        }

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .6), (int) (height * .4));

        displayScore( message2, message, result);
    }


    public void displayScore(String message, String message2, int result) {

        TextView orderSummaryView2 = findViewById(R.id.tv1);
        orderSummaryView2.setText(message2);
        TextView orderSummaryView3 = findViewById(R.id.tv2);
        orderSummaryView3.setText(String.valueOf(message)+result+"/6");

    }
}
