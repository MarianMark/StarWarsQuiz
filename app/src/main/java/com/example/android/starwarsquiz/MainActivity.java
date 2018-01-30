package com.example.android.starwarsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;



public class MainActivity extends AppCompatActivity {

    RadioButton q1a2;
    RadioButton q2a3;
    RadioButton q3a1;
    RadioButton q4a1;
    RadioButton q5a3;
    RadioButton q6a3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void submit(View view) {

        Intent myIntent = new Intent(MainActivity.this, submitWindow.class);
        int totalPoints = countPoints();
        myIntent.putExtra("totalPoints", totalPoints);
        startActivity(myIntent);
    }




    public int countPoints() {
        int result = 0;



        q1a2 = findViewById(R.id.oneb);
        q2a3 = findViewById(R.id.twoc);
        q3a1 = findViewById(R.id.threea);
        q4a1 = findViewById(R.id.foura);
        q5a3 = findViewById(R.id.fivec);
        q6a3 = findViewById(R.id.sixc);



        if (q1a2.isChecked()) {
            result += 1;
        }
        if (q2a3.isChecked()) {
            result += 1;
        }
        if (q3a1.isChecked()) {
            result += 1;
        }
        if (q4a1.isChecked()) {
            result += 1;
        }
        if (q5a3.isChecked()) {
            result += 1;
        }
        if (q6a3.isChecked()) {
            result += 1;
        }
        return result;

    }



}
