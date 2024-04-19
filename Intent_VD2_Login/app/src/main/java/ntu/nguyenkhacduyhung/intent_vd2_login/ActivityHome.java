package ntu.nguyenkhacduyhung.intent_vd2_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityHome extends AppCompatActivity {

    EditText edtUserName = findViewById(R.id.edtUserName);
    TextView tvUserName = findViewById(R.id.tvUserName);
    Button btnQuayLai = findViewById(R.id.btnQuaylai);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String strUserName = edtUserName.getText().toString();

        tvUserName.setText(strUserName);

        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iQuayLai = new Intent(ActivityHome.this, MainActivity.class);

                startActivity(iQuayLai);
            }
        });
    }
}