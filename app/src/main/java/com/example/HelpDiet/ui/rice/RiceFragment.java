package com.example.HelpDiet.ui.rice;

import android.content.Intent;
import android.os.Bundle;
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

public class RiceFragment extends Fragment {

    private com.example.HelpDiet.ui.rice.RiceViewModel homeViewModel;
    private static float kcalSum = 0;
    private CheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4, CheckBox5, CheckBox6, CheckBox7;
    private TextView kcalView;
    private Button endbtn;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_rice, container, false);

        endbtn = root.findViewById(R.id.endbtn);
        kcalView = (TextView) root.findViewById(R.id.KcalView);
        CheckBox1 = (CheckBox) root.findViewById(R.id.CheckBox1);
        CheckBox2 = (CheckBox) root.findViewById(R.id.CheckBox2);
        CheckBox3 = (CheckBox) root.findViewById(R.id.CheckBox3);
        CheckBox4 = (CheckBox) root.findViewById(R.id.CheckBox4);
        CheckBox5 = (CheckBox) root.findViewById(R.id.CheckBox5);
        CheckBox6 = (CheckBox) root.findViewById(R.id.CheckBox6);
        CheckBox7 = (CheckBox) root.findViewById(R.id.CheckBox7);

        kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
        CheckBox1.setChecked(DataManager.getInstance().one_checkButton1);
        CheckBox2.setChecked(DataManager.getInstance().one_checkButton2);
        CheckBox3.setChecked(DataManager.getInstance().one_checkButton3);
        CheckBox4.setChecked(DataManager.getInstance().one_checkButton4);
        CheckBox5.setChecked(DataManager.getInstance().one_checkButton5);
        CheckBox6.setChecked(DataManager.getInstance().one_checkButton6);

        CheckBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox1.isChecked()) {
                    DataManager.getInstance().kcalSum += 310;
                    DataManager.getInstance().end.put("쌀밥", "riceOne");
                    if (!CheckKcal(CheckBox1, 310, "쌀밥")) { DataManager.getInstance().one_checkButton1 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 310;
                    DataManager.getInstance().end.remove("쌀밥");
                    DataManager.getInstance().one_checkButton1 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });

        CheckBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox2.isChecked()) {
                    DataManager.getInstance().kcalSum += 340;
                    DataManager.getInstance().end.put("잡곡밥", "riceTwo");
                    if (!CheckKcal(CheckBox2, 340, "잡곡밥")) { DataManager.getInstance().one_checkButton2 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 340;
                    DataManager.getInstance().end.remove("잡곡밥");
                    DataManager.getInstance().one_checkButton2 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });

        CheckBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox3.isChecked()) {
                    DataManager.getInstance().kcalSum += 321;
                    DataManager.getInstance().end.put("현미밥", "riceThree");
                    if (!CheckKcal(CheckBox3, 321, "현미밥")) { DataManager.getInstance().one_checkButton3 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 321;
                    DataManager.getInstance().end.remove("현미밥");
                    DataManager.getInstance().one_checkButton3 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox4.isChecked()) {
                    DataManager.getInstance().kcalSum += 88;
                    DataManager.getInstance().end.put("두부", "riceFour");
                    if (!CheckKcal(CheckBox4, 88, "두부")) { DataManager.getInstance().one_checkButton4 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 88;
                    DataManager.getInstance().end.remove("두부");
                    DataManager.getInstance().one_checkButton4 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox5.isChecked()) {
                    DataManager.getInstance().kcalSum += 293;
                    DataManager.getInstance().end.put("흑미밥", "riceFive");
                    if (!CheckKcal(CheckBox5, 293, "흑미밥")) { DataManager.getInstance().one_checkButton5 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 293;
                    DataManager.getInstance().end.remove("흑미밥");
                    DataManager.getInstance().one_checkButton5 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox6.isChecked()) {
                    DataManager.getInstance().kcalSum += 280;
                    DataManager.getInstance().end.put("떡볶이", "riceSix");
                    if (!CheckKcal(CheckBox6, 280, "떡볶이")) { DataManager.getInstance().one_checkButton6 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 280;
                    DataManager.getInstance().end.remove("떡볶이");
                    DataManager.getInstance().one_checkButton6 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox7.isChecked()) {
                    DataManager.getInstance().kcalSum += 318;
                    DataManager.getInstance().end.put("김밥", "riceSeven");
                    if (!CheckKcal(CheckBox7, 318, "김밥")) { DataManager.getInstance().one_checkButton7 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 318;
                    DataManager.getInstance().end.remove("김밥");
                    DataManager.getInstance().one_checkButton7 = false;
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