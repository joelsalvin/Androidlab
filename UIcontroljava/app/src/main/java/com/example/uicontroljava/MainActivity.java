package com.example.uicontroljava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ll = new LinearLayout(this);
        TextView textView = new TextView(this);
        Button but = new Button(this);

        textView.setText("Hello world");
        but.setText("Button");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = 10;
        but.setLayoutParams(params);

        ll.addView(textView);
        ll.addView(but);

        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setGravity(Gravity.CENTER);

        setContentView(ll);
    }
}