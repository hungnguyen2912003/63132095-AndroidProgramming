package th.part2.example_mylistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsMN;
    ArrayAdapter<String> adapter;
    ListView lvMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDK();

        //Bước 2
        dsMN = new ArrayList<String>();
        dsMN.add("Toán rời rạc");
        dsMN.add("Kỹ thuật lập trình");
        dsMN.add("Lập trình thiết bị di động");
        dsMN.add("Thiết kế web");
        dsMN.add("Cơ sở dữ liệu");

        //Bước 3: Tạo adapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsMN);

        //Bước 4: Gắn adapter

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chuoiThongBao = "Xin chào bạn!" + dsMN.get(position);
                Toast.makeText(MainActivity.this, chuoiThongBao, Toast.LENGTH_SHORT).show();
            }
        });

        //Bước 5: Xử lý sự kiện
        //...
    }

    void TimDK(){
        lvMonHoc = findViewById(R.id.MyLV);
    }
}