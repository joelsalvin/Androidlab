package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View v){
        EditText uname= findViewById(R.id.username);
        EditText pass= findViewById(R.id.password);
        if (uname.getText().toString().equals("Joel") && pass.getText().toString().equals("123abc")) {
            Toast.makeText(this, "Sucess login", Toast.LENGTH_SHORT).show();
        }
      else
     {
         Toast.makeText(this,"invalid input",Toast.LENGTH_LONG).show();
     }
    }
}