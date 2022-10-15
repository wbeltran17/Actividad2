package com.example.proyecto006;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent populationCountry =new Intent(MainActivity.this, PopulationCountry.class);
                populationCountry.setAction(Intent.ACTION_SEND);
                startActivity(populationCountry);
            }
        });

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imageButton =new Intent(MainActivity.this, ImageButton.class);
                imageButton.setAction(Intent.ACTION_SEND);
                startActivity(imageButton);
            }
        });

        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent touchListenerIntent =new Intent(MainActivity.this, TouchListener.class);
                touchListenerIntent.setAction(Intent.ACTION_SEND);
                startActivity(touchListenerIntent);
            }
        });

    }

}