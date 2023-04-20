package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ball = findViewById(R.id.ball);
        MotionLayout motionLayout = findViewById(R.id.motion);
ball.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v) {
        motionLayout.transitionToEnd();

    }
});
    }
}