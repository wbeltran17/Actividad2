package com.example.proyecto006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ImageButton extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        tv2 = (TextView) findViewById(R.id.tv2);
    }

    public void llamar(View view) {
        tv2.setText(R.string.calling);
    }
}