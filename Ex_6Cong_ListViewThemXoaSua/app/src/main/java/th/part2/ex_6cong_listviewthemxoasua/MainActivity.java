package th.part2.ex_6cong_listviewthemxoasua;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtSong, edtPos;
    Button btnthem, btnSua, btnXoa;
    TextView SoLuong, ViTri;
    int count = 0;
    ListView lvBaiHat;
    ArrayList<String> dsbh = new ArrayList<>();
    ArrayAdapter<String> adapterBH;
    //Biến dành cho chức năng sửa
    int PosItem = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        adapterBH = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsbh);

        lvBaiHat.setAdapter(adapterBH);

        //Hiển thị số lượng ban đầu danh sách bài hát
        SoLuong.setText(String.valueOf(count));


        //Kiểm tra nếu danh sách rỗng thì 2 chức năng Sửa và Xoá chưa thể hoạt động được.
        //Khi đã có phần tử thì khi nhấn vào các Item trong ListView thì 2 chức năng này sẽ hoạt động.
        if(dsbh.isEmpty()){
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
        }

        //Lựa chọn phần tử trong danh sách
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectItem  = parent.getItemAtPosition(position).toString();
                PosItem = position;
                Toast.makeText(MainActivity.this, "Bạn đã lựa chọn: " + selectItem, Toast.LENGTH_SHORT).show();
                edtSong.setText(selectItem);
                edtPos.setText(String.valueOf(position));


                edtPos.setEnabled(true);
                edtPos.setVisibility(View.VISIBLE);
                ViTri.setVisibility(View.VISIBLE);
                btnSua.setEnabled(true);
                btnXoa.setEnabled(true);
            }
        });

        //Xử lý chức năng Thêm phần tử
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strBaiHat = edtSong.getText().toString();

                //Hiển thị số lượng bài hát đang có trong List
                if(strBaiHat.isEmpty()){
                    Toast.makeText(MainActivity.this, "Tên bài hát không được để trống", Toast.LENGTH_SHORT).show();
                }
                else {
                    dsbh.add(strBaiHat);
                    adapterBH.notifyDataSetChanged();
                    count++;
                    SoLuong.setText(String.valueOf(count));
                    Toast.makeText(MainActivity.this, "Đã thêm bài hát " + strBaiHat + " thành công", Toast.LENGTH_SHORT).show();
                }

                edtSong.requestFocus();
                //Add xong thì phần editText vừa nhập sẽ clean đi
                edtSong.setText("");
            }
        });

        //Xử lý chức năng Sửa phần tử
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String upd_Name = edtSong.getText().toString();

                int upd_Pos = Integer.parseInt(edtPos.getText().toString());
                if (PosItem != -1){
                    if(upd_Pos >= 0 && upd_Pos < dsbh.size()){
                        dsbh.set(PosItem, upd_Name);

                        //Cập nhật lại vị trí Item mới trong danh sách.
                        if(upd_Pos != PosItem){
                            dsbh.remove(PosItem);
                            dsbh.add(upd_Pos, upd_Name);
                        }

                        adapterBH.notifyDataSetChanged();
                        Toast.makeText(MainActivity.this, "Cập nhật bài hát thành công", Toast.LENGTH_SHORT).show();
                        //Cập nhật xong sẽ clean text
                        edtSong.setText("");
                        edtPos.setText("");
                        PosItem = -1;
                        edtSong.requestFocus();
                        edtPos.setEnabled(false);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Vị trí không hợp lệ", Toast.LENGTH_SHORT).show();
                        edtPos.requestFocus();
                    }
                }

            }
        });

        //Xử lý chức năng Xoá phần tử
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String DelSong = edtSong.getText().toString();
                int DelSongPos = PosItem;

                dsbh.remove(DelSongPos);
                Toast.makeText(MainActivity.this, "Xoá bài hát " + DelSong + " thành công", Toast.LENGTH_SHORT).show();

                //Xoá cập nhật lại số lượng bài hát trong sách sách
                count--;
                SoLuong.setText(String.valueOf(count));

                adapterBH.notifyDataSetChanged();

                edtSong.setText("");
                edtSong.requestFocus();

                if(dsbh.isEmpty()){
                    btnSua.setEnabled(false);
                    btnXoa.setEnabled(false);
                    edtPos.setVisibility(View.GONE);
                    ViTri.setVisibility(View.GONE);
                }
            }
        });
    }

    void TimDieuKhien(){
        edtSong = findViewById(R.id.edtnameSong);
        edtPos = findViewById(R.id.edtposition);
        ViTri = findViewById(R.id.txtPos);
        btnthem = findViewById(R.id.btnadd);
        btnSua = findViewById(R.id.btnupdate);
        btnXoa = findViewById(R.id.btndel);
        SoLuong = findViewById(R.id.tvSoLuong);
        lvBaiHat = findViewById(R.id.lvBaihat);
    }
}