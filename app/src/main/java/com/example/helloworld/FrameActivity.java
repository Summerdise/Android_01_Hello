package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        Button frameBackBtn = findViewById(R.id.frameBtn1);
        frameBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        View frameTitle = findViewById(R.id.frameTitle);
        frameTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}