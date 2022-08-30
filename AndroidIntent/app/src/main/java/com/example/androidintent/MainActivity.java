package com.example.androidintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapint = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.985017, 76.724802"));
                startActivity(mapint);



            }

        }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           Intent intent = new Intent(Intent.ACTION_SENDTO);
                                           intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                                           intent.putExtra(Intent.EXTRA_EMAIL, "joelsalvin@gmail.com");
                                           intent.putExtra(Intent.EXTRA_SUBJECT, "Test mail");
                                           startActivity(intent);

                                       }
                                   }
        );
    }
}