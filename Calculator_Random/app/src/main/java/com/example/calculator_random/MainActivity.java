package com.example.calculator_random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnCreate;

    EditText edtSo1, edtSo2, edtKQ;

    ImageButton btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int so1 = rand.nextInt(10) + 1;
                int so2 = rand.nextInt(10) + 1;
                edtSo1.setText(String.valueOf(so1));
                edtSo2.setText(String.valueOf(so2));
            }
        });

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSo1 = edtSo1.getText().toString();
                String strSo2 = edtSo2.getText().toString();

                int so1 = Integer.parseInt(strSo1);
                int so2 = Integer.parseInt(strSo2);

                int kq = so1 + so2;
                edtKQ.setText(String.valueOf(kq));
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSo1 = edtSo1.getText().toString();
                String strSo2 = edtSo2.getText().toString();

                int so1 = Integer.parseInt(strSo1);
                int so2 = Integer.parseInt(strSo2);

                int kq = so1 - so2;
                edtKQ.setText(String.valueOf(kq));
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSo1 = edtSo1.getText().toString();
                String strSo2 = edtSo2.getText().toString();

                int so1 = Integer.parseInt(strSo1);
                int so2 = Integer.parseInt(strSo2);

                int kq = so1 * so2;
                edtKQ.setText(String.valueOf(kq));
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSo1 = edtSo1.getText().toString();
                String strSo2 = edtSo2.getText().toString();

                int so1 = Integer.parseInt(strSo1);
                int so2 = Integer.parseInt(strSo2);

                int kq = so1 / so2;
                edtKQ.setText(String.valueOf(kq));
            }
        });
    }

    void TimDieuKhien(){
        btnCreate = findViewById(R.id.btnCreate);
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKQ = findViewById(R.id.edtKQ);
        btnCong = findViewById(R.id.ibCong);
        btnTru = findViewById(R.id.ibTru);
        btnNhan = findViewById(R.id.ibNhan);
        btnChia = findViewById(R.id.ibChia);
    }
}