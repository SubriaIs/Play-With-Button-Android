package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonColor((Button) findViewById(R.id.button));
        setButtonColor((Button) findViewById(R.id.button2));
        setButtonColor((Button) findViewById(R.id.button4));
        setButtonColor((Button) findViewById(R.id.button5));
    }

    private void setButtonColor(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}