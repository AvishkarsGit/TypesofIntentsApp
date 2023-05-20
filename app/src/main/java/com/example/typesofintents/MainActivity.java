package com.example.typesofintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.expIntent);
        b2 = findViewById(R.id.impIntent);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(Intent.ACTION_VIEW);
                String uri = "https://www.flipkart.com";
                i.setData(Uri.parse(uri));
                Toast.makeText(MainActivity.this, "Implicit Intent Called", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });


    }
}