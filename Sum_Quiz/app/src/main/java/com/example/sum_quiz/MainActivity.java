package com.example.sum_quiz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btnGen;
    EditText edtA, edtB;
    TextView tvCount, tvCau;
    int DapAnDung;

    int DemCauDung = 0;

    int DemSoCau = 0;
    ArrayList<Integer> choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        btnGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemSoCau++;
                if (DemSoCau == 1){
                    DemCauDung = 0;
                    tvCount.setText("");
                }
                if(DemSoCau <= 10){
                    btnGen.setText("Tiếp tục");
                    TaoNgauNhien();
                    String strCau = "Câu: " + String.valueOf(DemSoCau);
                    tvCau.setText(strCau);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                }
                else{
                    btnGen.setText("Khởi tạo lại");
                    Toast.makeText(MainActivity.this, "Đã hết 10 câu! Số câu đúng của bạn là " + DemCauDung, Toast.LENGTH_LONG).show();
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    DemSoCau = 0;
                }

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KTDapAn(0);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KTDapAn(1);
                btn1.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KTDapAn(2);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn4.setEnabled(false);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KTDapAn(3);
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
            }
        });
    }

    void TimDieuKhien(){
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        tvCount = findViewById(R.id.tvCount);
        tvCau = findViewById(R.id.tvCau);
        btn1 = findViewById(R.id.btnNum1);
        btn2 = findViewById(R.id.btnNum2);
        btn3 = findViewById(R.id.btnNum3);
        btn4 = findViewById(R.id.btnNum4);
        btnGen = findViewById(R.id.btnGen);
    }

    void TaoNgauNhien(){
        Random rand = new Random();
        int a = rand.nextInt(21);
        int b = rand.nextInt(21);
        edtA.setText(String.valueOf(a));
        edtB.setText(String.valueOf(b));

        DapAnDung = a + b;

        choose = new ArrayList<>();
        choose.add(DapAnDung);

        while (choose.size() < 4) {
            int option = rand.nextInt(41);
            if (!choose.contains(option)) {
                choose.add(option);
            }
        }

        //Xáo trộn đáp án
        Collections.shuffle(choose);

        btn1.setText(String.valueOf(choose.get(0)));
        btn2.setText(String.valueOf(choose.get(1)));
        btn3.setText(String.valueOf(choose.get(2)));
        btn4.setText(String.valueOf(choose.get(3)));
    }

    @SuppressLint("SetTextI18n")
    void KTDapAn(int luaChon) {
        if (choose.get(luaChon) == DapAnDung) {
            DemCauDung++;
        }

        String strCauDung = String.valueOf(DemCauDung) + "/10";
        tvCount.setText(strCauDung);
    }
}