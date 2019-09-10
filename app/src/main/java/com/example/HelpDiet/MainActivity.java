package com.example.HelpDiet;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    class BtnOnClickListner implements Button.OnClickListener {
        @Override
        public void onClick(View view){
            Intent intent;
            switch (view.getId()) {
                case R.id.chartButton:
                    intent = new Intent(getApplicationContext(), ChartActivity.class);
                    startActivity(intent);
                    break;
                case R.id.calendarButton:
                    intent = new Intent(getApplicationContext(), CalendarActivity.class);
                    startActivity(intent);
                    break;
                case R.id.foodButton:
                    intent = new Intent(getApplicationContext(), FoodActivity.class);
                    startActivity(intent);
                    break;
                case R.id.machineButton:
                    intent = new Intent(getApplicationContext(), MachineActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnOnClickListner onClickListner = new BtnOnClickListner();

        Button chartBtn = (Button) findViewById(R.id.chartButton);
        Button machineBtn = (Button) findViewById(R.id.machineButton);
        Button calendarBtn = (Button) findViewById(R.id.calendarButton);
        Button foodBtn = (Button) findViewById(R.id.foodButton);

        foodBtn.setOnClickListener(onClickListner);
        machineBtn.setOnClickListener(onClickListner);
        calendarBtn.setOnClickListener(onClickListner);
        chartBtn.setOnClickListener(onClickListner);
    }
}