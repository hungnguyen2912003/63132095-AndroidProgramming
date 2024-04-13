package com.example.baikt2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnTinh;
    RadioButton rdb13, rdb15, rdb18;
    EditText edtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum = edtNum.getText().toString();
                int num = Integer.parseInt(strNum);
                float value;
                float tip;
                if(rdb13.isChecked()){
                    value = 0.13f;
                    tip = num * value;
                    Toast.makeText(MainActivity.this, "Your tip will be " + tip, Toast.LENGTH_LONG).show();
                }
                if(rdb15.isChecked()){
                    value = 0.15f;
                    tip = num * value;
                    Toast.makeText(MainActivity.this, "Your tip will be " + tip, Toast.LENGTH_LONG).show();
                }
                if(rdb18.isChecked()){
                    value = 0.18f;
                    tip = num * value;
                    Toast.makeText(MainActivity.this, "Your tip will be " + tip, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    void TimDieuKhien(){
        edtNum = findViewById(R.id.edtNum);
        btnTinh = findViewById(R.id.btnTinh);
        rdb13 = findViewById(R.id.rdb13);
        rdb15 = findViewById(R.id.rdb15);
        rdb18 = findViewById(R.id.rdb18);
    }
}