package ntu.NguyenKhacDuyHung_63132095;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PTCong extends AppCompatActivity {
    EditText soA, soB;
    ImageButton btnQuayLai, btnSelect1, btnSelect2, btnSelect3, btnSelect4;
    TextView SoCau, SoCauDung, tvChoose1, tvChoose2, tvChoose3, tvChoose4;
    private int DemSoCau = 0;
    private int DemSoCauDung = 0;

    private int Correct;
    AlertDialog.Builder welcome;

    //Sử dụng danh sách để thêm lựa chọn đáp án
    ArrayList<Integer> dsdapan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pheptinhcong);
        TimDieuKhien();

        welcome = new AlertDialog.Builder(PTCong.this);
        welcome.setTitle("Chào mừng");
        welcome.setMessage("Bạn đang lựa chọn Quiz Phép tính Cộng. Quiz sẽ có 10 câu phép tính ngẫu nhiên. Nhiệm vụ của bạn là tìm đáp án đúng. Chúc bạn chơi vui vẻ!");
        welcome.setPositiveButton("Bắt đầu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TaoNgauNhien_PhepTinhCong();
                DemSoCau++;
                DemSoCauDung = 0;
                SoCau.setText("Câu: 1");
                SoCauDung.setText("Số câu đúng: 0/10");
            }
        });

        welcome.setNegativeButton("Quay lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        welcome.show();

        //Sự kiện cho nút quay lại
        btnQuayLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder exit = new AlertDialog.Builder(PTCong.this);
                exit.setTitle("Xác nhận");
                exit.setMessage("Bạn có muốn thoát trò chơi?");
                exit.setPositiveButton("Tiếp tục", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                exit.setNegativeButton("Thoát", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent mainScreen = new Intent(PTCong.this, MainActivity.class);
                        startActivity(mainScreen);
                    }
                });
                exit.show();
            }
        });


        //Xử lý nút lựa chọn đáp án 1
        btnSelect1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckDapAn(0);
                DemSoCau++;
            }
        });

        //Xứ lý nút lựa chọn đáp án 2
        btnSelect2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckDapAn(1);
                DemSoCau++;
            }
        });

        //Xứ lý nút lựa chọn đáp án 3
        btnSelect3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckDapAn(2);
                DemSoCau++;
            }
        });

        //Xứ lý nút lựa chọn đáp án 4
        btnSelect4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckDapAn(3);
                DemSoCau++;
            }
        });
    }

    //Tìm điều khiển
    public void TimDieuKhien(){
        soA = findViewById(R.id.edtA);
        soB = findViewById(R.id.edtB);

        btnQuayLai = findViewById(R.id.imbQuaylai);
        btnSelect1 = findViewById(R.id.imbSelect1);
        btnSelect2 = findViewById(R.id.imbSelect2);
        btnSelect3 = findViewById(R.id.imbSelect3);
        btnSelect4 = findViewById(R.id.imbSelect4);

        SoCau = findViewById(R.id.tvSoCau);
        SoCauDung = findViewById(R.id.tvSoCauDung);
        tvChoose1 = findViewById(R.id.tvSelect1);
        tvChoose2 = findViewById(R.id.tvSelect2);
        tvChoose3 = findViewById(R.id.tvSelect3);
        tvChoose4 = findViewById(R.id.tvSelect4);
    }



    //Hàm xử lý
    public void TaoNgauNhien_PhepTinhCong(){
        Random rand = new Random();
        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        soA.setText(String.valueOf(a));
        soB.setText(String.valueOf(b));

        Correct = a + b;

        dsdapan = new ArrayList<>();

        //Thêm đáp án đúng vào hàm
        dsdapan.add(Correct);


        while (dsdapan.size() < 4) {
            int luachon = rand.nextInt(101);
            if (!dsdapan.contains(luachon)) {
                dsdapan.add(luachon);
            }
        }

        //Xáo trộn đáp án
        Collections.shuffle(dsdapan);

        tvChoose1.setText(String.valueOf(dsdapan.get(0)));
        tvChoose2.setText(String.valueOf(dsdapan.get(1)));
        tvChoose3.setText(String.valueOf(dsdapan.get(2)));
        tvChoose4.setText(String.valueOf(dsdapan.get(3)));
    }

    //Hàm kiểm tra đáp án đúng
    void CheckDapAn(int luaChon) {
        AlertDialog.Builder mydialog = new AlertDialog.Builder(PTCong.this);
        mydialog.setTitle("Kết quả");
        if (dsdapan.get(luaChon) == Correct) {
            DemSoCauDung++;
            mydialog.setMessage("Đáp án đúng là " + Correct + ". Bạn đã trả lời đúng.");
            mydialog.setPositiveButton("Tiếp tục", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(DemSoCau <= 10){
                        TaoNgauNhien_PhepTinhCong();
                        String strCau = "Câu: " + String.valueOf(DemSoCau);
                        SoCau.setText(strCau);
                    }
                    else {
                        mydialog.setTitle("Trò chơi kết thúc");
                        mydialog.setMessage("Đã hết 10 câu Quiz. Số câu đúng bạn đạt được là " + DemSoCauDung + " .Vui lòng nhấn 'Chơi lại' hoặc 'Thoát trò chơi'");
                        mydialog.setPositiveButton("Chơi lại", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                DemSoCau = 0;
                                DemSoCauDung = 0;
                                welcome.show();
                            }
                        });
                        mydialog.setNegativeButton("Thoát trò chơi", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                        mydialog.show();
                    }
                }
            });
        }
        else{
            mydialog.setMessage("Đáp án đúng là " + Correct + ". Bạn đã trả lời sai.");
            mydialog.setNegativeButton("Tiếp tục", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(DemSoCau <= 10){
                        TaoNgauNhien_PhepTinhCong();
                        String strCau = "Câu: " + String.valueOf(DemSoCau);
                        SoCau.setText(strCau);
                    }
                    else {
                        mydialog.setTitle("Trò chơi kết thúc");
                        mydialog.setMessage("Đã hết 10 câu Quiz. Số câu đúng bạn đạt được là " + DemSoCauDung + " .Vui lòng nhấn 'Chơi lại' hoặc 'Thoát trò chơi'");
                        mydialog.setPositiveButton("Chơi lại", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                DemSoCau = 0;
                                DemSoCauDung = 0;
                                welcome.show();
                            }
                        });
                        mydialog.setNegativeButton("Thoát trò chơi", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                        mydialog.show();
                    }
                }
            });
        }
        mydialog.show();

        String strCauDung = "Số câu đúng: " + String.valueOf(DemSoCauDung) + "/10";
        SoCauDung.setText(strCauDung);
    }
}