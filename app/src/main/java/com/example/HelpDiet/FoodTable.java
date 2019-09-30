package com.example.HelpDiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.HelpDiet.DataManager;
import com.example.HelpDiet.R;

import java.util.Set;

public class FoodTable extends AppCompatActivity {

    private TextView KcalView;
    private LinearLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_table);

        KcalView = findViewById(R.id.KcalView);
        table = findViewById(R.id.table);

        KcalView.setText(String.valueOf("kcal : " + DataManager.getInstance().kcalSum));
        KcalView.setGravity(View.TEXT_ALIGNMENT_CENTER);

        Set<String> keys = DataManager.getInstance().end.keySet();

        for(String key : keys) {
            TextView text = new TextView(this);
            text.setTextSize(30);
            text.setText(key);
            table.addView(text);
        }


    }
}
