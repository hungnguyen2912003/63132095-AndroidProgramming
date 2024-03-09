package th.part2.ex_6_listviewdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dstinhthanh;
        dstinhthanh = new ArrayList<String>();
        dstinhthanh.add("Nha Trang");
        dstinhthanh.add("Đà Nẵng");
        dstinhthanh.add("Bình Định");
        dstinhthanh.add("Quy Nhơn");
        dstinhthanh.add("Phú Yên");

        ArrayAdapter<String> adapterTinh = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dstinhthanh);

        ListView lvTinhThanh = findViewById(R.id.lvtinhthanh);
        lvTinhThanh.setAdapter(adapterTinh);
    }
}