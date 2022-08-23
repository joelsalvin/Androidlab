package com.example.lifecycle;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "Created", Toast.LENGTH_SHORT);
        toast.show();

    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "Started", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "Resumed", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "Stoped", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        Toast toast = Toast.makeText(getApplicationContext(), "Destroyed", Toast.LENGTH_SHORT);
        toast.show();
        super.onDestroy();

    }

}