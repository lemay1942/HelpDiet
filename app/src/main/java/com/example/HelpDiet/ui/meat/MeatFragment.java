package com.example.HelpDiet.ui.meat;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.HelpDiet.DataManager;
import com.example.HelpDiet.FoodTable;
import com.example.HelpDiet.R;

public class MeatFragment extends Fragment {

    private com.example.HelpDiet.ui.meat.MeatViewModel dashboardViewModel;
    private static float kcalSum = 0;
    private CheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4, CheckBox5, CheckBox6;
    private TextView kcalView;
    private Button endbtn;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_meat, container, false);

        endbtn = root.findViewById(R.id.endbtn);
        kcalView = (TextView) root.findViewById(R.id.KcalView);
        CheckBox1 = (CheckBox) root.findViewById(R.id.CheckBox1);
        CheckBox2 = (CheckBox) root.findViewById(R.id.CheckBox2);
        CheckBox3 = (CheckBox) root.findViewById(R.id.CheckBox3);
        CheckBox4 = (CheckBox) root.findViewById(R.id.CheckBox4);
        CheckBox5 = (CheckBox) root.findViewById(R.id.CheckBox5);
        CheckBox6 = (CheckBox) root.findViewById(R.id.CheckBox6);

        kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);


        CheckBox1.setChecked(DataManager.getInstance().two_checkButton1);
        CheckBox2.setChecked(DataManager.getInstance().two_checkButton2);
        CheckBox3.setChecked(DataManager.getInstance().two_checkButton3);
        CheckBox4.setChecked(DataManager.getInstance().two_checkButton4);
        CheckBox5.setChecked(DataManager.getInstance().two_checkButton5);
        CheckBox6.setChecked(DataManager.getInstance().two_checkButton6);




        CheckBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox1.isChecked()) {
                    DataManager.getInstance().kcalSum += 80;
                    DataManager.getInstance().end.put("삶은 달걀", "meatOne");
                    if (!CheckKcal(CheckBox1, 80, "삶은 달걀")) { DataManager.getInstance().two_checkButton1 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 80;
                    DataManager.getInstance().end.remove("삶은 달걀");
                    DataManager.getInstance().two_checkButton1 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });


        CheckBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox2.isChecked()) {
                    DataManager.getInstance().kcalSum += 89;
                    DataManager.getInstance().end.put("계란프라이", "meatTwo");
                    if (!CheckKcal(CheckBox2, 89, "계란프라이")) { DataManager.getInstance().two_checkButton2 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 89;
                    DataManager.getInstance().end.remove("계란프라이");
                    DataManager.getInstance().two_checkButton2 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });

        CheckBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox3.isChecked()) {
                    DataManager.getInstance().kcalSum += 109;
                    DataManager.getInstance().end.put("닭가슴살", "meatThree");
                    if (!CheckKcal(CheckBox3, 109, "닭가슴살")) { DataManager.getInstance().two_checkButton3 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 109;
                    DataManager.getInstance().end.remove("닭가슴살");
                    DataManager.getInstance().two_checkButton3 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox4.isChecked()) {
                    DataManager.getInstance().kcalSum += 73;
                    DataManager.getInstance().end.put("구운 계란", "meatFour");
                    if (!CheckKcal(CheckBox4, 73, "구운 계란")) { DataManager.getInstance().two_checkButton4 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 73;
                    DataManager.getInstance().end.remove("구운 계란");
                    DataManager.getInstance().two_checkButton4 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox5.isChecked()) {
                    DataManager.getInstance().kcalSum += 30;
                    DataManager.getInstance().end.put("동그랑땡", "meatFive");
                    if (!CheckKcal(CheckBox5, 30, "동그랑땡")) { DataManager.getInstance().two_checkButton5 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 30;
                    DataManager.getInstance().end.remove("동그랑땡");
                    DataManager.getInstance().two_checkButton5 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox6.isChecked()) {
                    DataManager.getInstance().kcalSum += 489;
                    DataManager.getInstance().end.put("소불고기", "meatSix");
                    if (!CheckKcal(CheckBox6, 489, "소불고기")) { DataManager.getInstance().two_checkButton6 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 489;
                    DataManager.getInstance().end.remove("소불고기");
                    DataManager.getInstance().two_checkButton6 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });

        endbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FoodTable.class);
                startActivity(intent);

            }
        });

        return root;
    }

    private boolean CheckKcal(CheckBox checkbox, int kcal, String foodname)
    {
        if(DataManager.getInstance().kcalSum >= 1200f){
            Toast.makeText(getContext(), "1200Kcal를 초과할 수는 없습니다", Toast.LENGTH_LONG).show();
            DataManager.getInstance().kcalSum -= kcal;
            DataManager.getInstance().end.remove(foodname);
            checkbox.setChecked(false);
            return true;
        }
        return false;
    }
}