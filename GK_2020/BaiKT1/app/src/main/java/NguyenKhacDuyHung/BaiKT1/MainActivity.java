package NguyenKhacDuyHung.BaiKT1;

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

public class MainActivity extends AppCompatActivity {
    EditText edtUN, edtPass;
    Button btnLogIn;
    TextView tvAtt;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUName = edtUN.getText().toString();
                String strPass = edtPass.getText().toString();
                count++;
                tvAtt.setText("Attempts: " + String.valueOf(count));
                if(strUName.equals("maicuongtho") && strPass.equals("Cntt60ntu!")){
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    void TimDieuKhien(){
        edtUN = findViewById(R.id.edtUserName);
        edtPass = findViewById(R.id.edtPassword);
        btnLogIn = findViewById(R.id.btnLog);
        tvAtt = findViewById(R.id.tvAtt);
    }
}