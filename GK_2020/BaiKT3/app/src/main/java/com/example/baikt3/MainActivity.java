package com.example.baikt3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtPos, edtVal;
    Button btnAdd, btnEdit, btnDel;
    ListView lvContent;
    ArrayList<String> ds;
    ArrayAdapter<String> adapter;

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ds = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, ds);

        edtPos.setEnabled(false);
        //Chọn item
        lvContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                i = position;
                edtPos.setText(String.valueOf(position));
                edtVal.setText(item);
                edtPos.setEnabled(true);
            }
        });

        //Thêm
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strVal = edtVal.getText().toString();
                if(strVal.isEmpty()){
                    Toast.makeText(MainActivity.this, "Giá trị không được để trống", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(ds.contains(strVal)){
                        Toast.makeText(MainActivity.this, "Giá trị đã có trong danh sách", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        ds.add(strVal);
                        adapter.notifyDataSetChanged();
                        edtVal.setText("");
                    }
                }
                lvContent.setAdapter(adapter);
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = edtVal.getText().toString();
                int i_upd = Integer.parseInt(edtPos.getText().toString());
                if(ds.contains(x)){
                    Toast.makeText(MainActivity.this, "Giá trị đã có trong danh sách", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(i_upd >= 0 && i_upd < ds.size()){
                        ds.set(i,x);
                        ds.remove(i);
                        ds.add(i_upd, x);
                        adapter.notifyDataSetChanged();
                        edtPos.setText("");
                        edtVal.setText("");
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Vị trí không hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ds.remove(i);
                adapter.notifyDataSetChanged();
                edtVal.setText("");
                edtPos.setText("");
            }
        });
    }



    void TimDieuKhien(){
        edtPos = findViewById(R.id.edtPos);
        edtVal = findViewById(R.id.edtValue);
        btnAdd = findViewById(R.id.btnAdd);
        btnEdit = findViewById(R.id.btnEdit);
        btnDel = findViewById(R.id.btnDel);
        lvContent = findViewById(R.id.lvBai3);
    }
}