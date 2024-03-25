package ntu.NguyenKhacDuyHung_63132095;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSelectCong, btnSelectTru, btnSelectNhan, btnSelectChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        btnSelectCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phepCongScreen = new Intent(MainActivity.this, PTCong.class);
                startActivity(phepCongScreen);
            }
        });

        btnSelectTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phepTruScreen = new Intent(MainActivity.this, PTTru.class);
                startActivity(phepTruScreen);
            }
        });

        btnSelectNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phepNhanScreen = new Intent(MainActivity.this, PTNhan.class);
                startActivity(phepNhanScreen);
            }
        });

        btnSelectChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phepChiaScreen = new Intent(MainActivity.this, PTChia.class);
                startActivity(phepChiaScreen);
            }
        });


    }

    //Tìm kiếm điều khiển
    public void TimDieuKhien(){
        btnSelectCong = findViewById(R.id.imbcong);
        btnSelectTru = findViewById(R.id.imbTru);
        btnSelectNhan = findViewById(R.id.imbNhan);
        btnSelectChia = findViewById(R.id.imbChia);
    }

}