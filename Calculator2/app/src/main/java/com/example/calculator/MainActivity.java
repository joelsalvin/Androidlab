package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button add, sub, mult, div;
    EditText n1,n2;
    TextView operator,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mult = findViewById(R.id.multiply);
        div = findViewById(R.id.division);
        n1 = findViewById(R.id.editTextNumber);
        n2 = findViewById(R.id.editTextNumber2);
        operator =  findViewById(R.id.op);
        result = findViewById(R.id.result);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int number1 = Integer.parseInt(n1.getText().toString());
        int number2 = Integer.parseInt(n2.getText().toString());

        Button b = (Button) view;

        if(view.getId() == R.id.add){
            operator.setText(b.getText());
            result.setText(number1+number2+"");
        }
        else if(view.getId() == R.id.sub){
            operator.setText(b.getText());
            result.setText(number1-number2+"");
        }
        else if(view.getId() == R.id.multiply){
            operator.setText(b.getText());
            result.setText(number1*number2+"");
        }
        else if(view.getId() == R.id.division){
            operator.setText(b.getText());
            result.setText(number1/number2+"");
        }
    }
}