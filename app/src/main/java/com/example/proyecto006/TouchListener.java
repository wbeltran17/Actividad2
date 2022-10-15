package com.example.proyecto006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class TouchListener extends AppCompatActivity implements View.OnTouchListener {

    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_listener);

        tv3=(TextView)findViewById(R.id.tv3);
        tv3.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_DOWN) {
            tv3.setText(R.string.touch1);
        }
        if (event.getAction()==MotionEvent.ACTION_MOVE) {
            tv3.setText(R.string.touch2);
        }
        if (event.getAction()==MotionEvent.ACTION_UP) {
            tv3.setText(R.string.touch3);
        }
        return true;
    }
}