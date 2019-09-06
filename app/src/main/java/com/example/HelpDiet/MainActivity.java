package com.example.HelpDiet;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chartButton = (Button) findViewById(R.id.chartButton);

        chartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                ComponentName name = new ComponentName("com.example.HelpDiet", "com.example.HelpDiet.ChartActivity");

                intent.setComponent(name);
                startActivity(intent);
            }
        });
    }
}