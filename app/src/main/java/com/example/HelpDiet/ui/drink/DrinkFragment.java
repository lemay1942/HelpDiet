package com.example.HelpDiet.ui.drink;

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
import com.example.HelpDiet.ui.rice.RiceViewModel;

public class DrinkFragment extends Fragment {

    private RiceViewModel homeViewModel;
    private static float kcalSum = 0;
    private CheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4, CheckBox5, CheckBox6, CheckBox7, CheckBox8, CheckBox9, CheckBox10, CheckBox11, CheckBox12, CheckBox13, CheckBox14, CheckBox15, CheckBox16, CheckBox17;
    private TextView kcalView;
    private Button endbtn;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_drink, container, false);

        endbtn = root.findViewById(R.id.endbtn);
        kcalView = (TextView) root.findViewById(R.id.KcalView);
        CheckBox1 = (CheckBox) root.findViewById(R.id.CheckBox1);
        CheckBox2 = (CheckBox) root.findViewById(R.id.CheckBox2);
        CheckBox3 = (CheckBox) root.findViewById(R.id.CheckBox3);
        CheckBox4 = (CheckBox) root.findViewById(R.id.CheckBox4);
        CheckBox5 = (CheckBox) root.findViewById(R.id.CheckBox5);
        CheckBox6 = (CheckBox) root.findViewById(R.id.CheckBox6);
        CheckBox7 = (CheckBox) root.findViewById(R.id.CheckBox7);
        CheckBox8 = (CheckBox) root.findViewById(R.id.CheckBox8);
        CheckBox9 = (CheckBox) root.findViewById(R.id.CheckBox9);
        CheckBox10 = (CheckBox) root.findViewById(R.id.CheckBox10);
        CheckBox11 = (CheckBox) root.findViewById(R.id.CheckBox11);
        CheckBox12 = (CheckBox) root.findViewById(R.id.CheckBox12);
        CheckBox13 = (CheckBox) root.findViewById(R.id.CheckBox13);
        CheckBox14 = (CheckBox) root.findViewById(R.id.CheckBox14);
        CheckBox15 = (CheckBox) root.findViewById(R.id.CheckBox15);
        CheckBox16 = (CheckBox) root.findViewById(R.id.CheckBox16);
        CheckBox17 = (CheckBox) root.findViewById(R.id.CheckBox17);

        kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
        CheckBox1.setChecked(DataManager.getInstance().three_checkButton1);
        CheckBox2.setChecked(DataManager.getInstance().three_checkButton2);
        CheckBox3.setChecked(DataManager.getInstance().three_checkButton3);
        CheckBox4.setChecked(DataManager.getInstance().three_checkButton4);
        CheckBox5.setChecked(DataManager.getInstance().three_checkButton5);
        CheckBox6.setChecked(DataManager.getInstance().three_checkButton6);
        CheckBox7.setChecked(DataManager.getInstance().three_checkButton7);
        CheckBox8.setChecked(DataManager.getInstance().three_checkButton8);
        CheckBox9.setChecked(DataManager.getInstance().three_checkButton9);
        CheckBox10.setChecked(DataManager.getInstance().three_checkButton10);
        CheckBox11.setChecked(DataManager.getInstance().three_checkButton11);
        CheckBox12.setChecked(DataManager.getInstance().three_checkButton12);
        CheckBox13.setChecked(DataManager.getInstance().three_checkButton13);
        CheckBox14.setChecked(DataManager.getInstance().three_checkButton14);
        CheckBox15.setChecked(DataManager.getInstance().three_checkButton15);
        CheckBox16.setChecked(DataManager.getInstance().three_checkButton16);
        CheckBox17.setChecked(DataManager.getInstance().three_checkButton17);


        CheckBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox1.isChecked()) {
                    DataManager.getInstance().kcalSum += 122;
                    DataManager.getInstance().end.put("사과", "drinkOne");
                    if (!CheckKcal(CheckBox1, 122, "사과")) { DataManager.getInstance().three_checkButton1 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 122;
                    DataManager.getInstance().end.remove("사과");
                    DataManager.getInstance().three_checkButton1 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });

        CheckBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox2.isChecked()) {
                    DataManager.getInstance().kcalSum += 93;
                    DataManager.getInstance().end.put("바나나", "drinkTwo");
                    if (!CheckKcal(CheckBox2, 93, "바나나")) { DataManager.getInstance().three_checkButton2 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 93;
                    DataManager.getInstance().end.remove("바나나");
                    DataManager.getInstance().three_checkButton2 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });

        CheckBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox3.isChecked()) {
                    DataManager.getInstance().kcalSum += 25;
                    DataManager.getInstance().end.put("김치", "drinkThree");
                    if (!CheckKcal(CheckBox3, 25, "김치")) { DataManager.getInstance().three_checkButton3 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 25;
                    DataManager.getInstance().end.remove("김치");
                    DataManager.getInstance().three_checkButton3 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox4.isChecked()) {
                    DataManager.getInstance().kcalSum += 93;
                    DataManager.getInstance().end.put("찐고구마", "drinkFour");
                    if (!CheckKcal(CheckBox4, 93, "찐고구마")) { DataManager.getInstance().three_checkButton4 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 93;
                    DataManager.getInstance().end.remove("찐고구마");
                    DataManager.getInstance().three_checkButton4 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox5.isChecked()) {
                    DataManager.getInstance().kcalSum += 4;
                    DataManager.getInstance().end.put("아메리카노", "drinkFive");
                    if (!CheckKcal(CheckBox5, 4, "아메리카노")) { DataManager.getInstance().three_checkButton5 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 4;
                    DataManager.getInstance().end.remove("아메리카노");
                    DataManager.getInstance().three_checkButton5 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox6.isChecked()) {
                    DataManager.getInstance().kcalSum += 2;
                    DataManager.getInstance().end.put("방울토마토", "drinkSix");
                    if (!CheckKcal(CheckBox6, 2, "방울토마토")) { DataManager.getInstance().three_checkButton6 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 2;
                    DataManager.getInstance().end.remove("방울토마토");
                    DataManager.getInstance().three_checkButton6 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox7.isChecked()) {
                    DataManager.getInstance().kcalSum += 48;
                    DataManager.getInstance().end.put("배", "drinkSeven");
                    if (!CheckKcal(CheckBox7, 48, "배")) { DataManager.getInstance().three_checkButton7 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 48;
                    DataManager.getInstance().end.remove("배");
                    DataManager.getInstance().three_checkButton7 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox8.isChecked()) {
                    DataManager.getInstance().kcalSum += 122;
                    DataManager.getInstance().end.put("우유", "drink8");
                    if (!CheckKcal(CheckBox8, 122, "우유")) { DataManager.getInstance().three_checkButton8 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 122;
                    DataManager.getInstance().end.remove("우유");
                    DataManager.getInstance().three_checkButton8 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox9.isChecked()) {
                    DataManager.getInstance().kcalSum += 69;
                    DataManager.getInstance().end.put("포도", "drink9");
                    if (!CheckKcal(CheckBox9, 69, "포도")) { DataManager.getInstance().three_checkButton9 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 69;
                    DataManager.getInstance().end.remove("포도");
                    DataManager.getInstance().three_checkButton9 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox10.isChecked()) {
                    DataManager.getInstance().kcalSum += 7;
                    DataManager.getInstance().end.put("아몬드", "drink10");
                    if (!CheckKcal(CheckBox10, 7,"아몬드")) { DataManager.getInstance().three_checkButton10 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 7;
                    DataManager.getInstance().end.remove("아몬드");
                    DataManager.getInstance().three_checkButton10 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox11.isChecked()) {
                    DataManager.getInstance().kcalSum += 10;
                    DataManager.getInstance().end.put("스타벅스 ICE 아메리카노", "drink11");
                    if (!CheckKcal(CheckBox11, 10,"스타벅스 ICE 아메리카노")) { DataManager.getInstance().three_checkButton11 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 10;
                    DataManager.getInstance().end.remove("스타벅스 ICE 아메리카노");
                    DataManager.getInstance().three_checkButton11 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox12.isChecked()) {
                    DataManager.getInstance().kcalSum += 91;
                    DataManager.getInstance().end.put("복숭아", "drink12");
                    if (!CheckKcal(CheckBox12, 91,"복숭아")) { DataManager.getInstance().three_checkButton12 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 91;
                    DataManager.getInstance().end.remove("복숭아");
                    DataManager.getInstance().three_checkButton12 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox13.isChecked()) {
                    DataManager.getInstance().kcalSum += 2;
                    DataManager.getInstance().end.put("대추방울토마토", "drink13");
                    if (!CheckKcal(CheckBox13, 2,"대추방울토마토")) { DataManager.getInstance().three_checkButton13 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 2;
                    DataManager.getInstance().end.remove("대추방울토마토");
                    DataManager.getInstance().three_checkButton13 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox14.isChecked()) {
                    DataManager.getInstance().kcalSum += 124;
                    DataManager.getInstance().end.put("군고구마", "drink14");
                    if (!CheckKcal(CheckBox14, 124,"군고구마")) { DataManager.getInstance().three_checkButton14 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 124;
                    DataManager.getInstance().end.remove("군고구마");
                    DataManager.getInstance().three_checkButton14 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox15.isChecked()) {
                    DataManager.getInstance().kcalSum += 19;
                    DataManager.getInstance().end.put("오이", "drink15");
                    if (!CheckKcal(CheckBox15, 19,"오이")) { DataManager.getInstance().three_checkButton15 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 19;
                    DataManager.getInstance().end.remove("오이");
                    DataManager.getInstance().three_checkButton15 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox16.isChecked()) {
                    DataManager.getInstance().kcalSum += 14;
                    DataManager.getInstance().end.put("토마토", "drink16");
                    if (!CheckKcal(CheckBox16, 14,"토마토")) { DataManager.getInstance().three_checkButton16 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 14;
                    DataManager.getInstance().end.remove("토마토");
                    DataManager.getInstance().three_checkButton16 = false;
                }
                kcalView.setText("총 칼로리 : " + DataManager.getInstance().kcalSum);
            }
        });
        CheckBox17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CheckBox17.isChecked()) {
                    DataManager.getInstance().kcalSum += 45;
                    DataManager.getInstance().end.put("아몬드 브리즈 오리지널", "drink17");
                    if (!CheckKcal(CheckBox17, 45,"아몬드 브리즈 오리지널")) { DataManager.getInstance().three_checkButton17 = true; }
                } else {
                    DataManager.getInstance().kcalSum -= 45;
                    DataManager.getInstance().end.remove("아몬드 브리즈 오리지널");
                    DataManager.getInstance().three_checkButton17 = false;
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