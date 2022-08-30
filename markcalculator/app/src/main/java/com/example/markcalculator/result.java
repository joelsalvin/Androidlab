package com.example.markcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView status = findViewById(R.id.status);
        TextView percentage = findViewById(R.id.percentage);
        TextView markView = findViewById(R.id.mark);

        if (getIntent() != null) {
            int mark = getIntent().getIntExtra("marks", -1);
            String name = getIntent().getStringExtra("name");
            if (mark > -1) {
                int p = mark * 100 / 300;

                percentage.setText("Percentage: " + p + "%");
                markView.setText("Mark: " + mark);

                if (p > 50)
                    status.setText(name + " you are passed");

                else
                    status.setText("Better luck next time " + name);
            }
        }
    }
}