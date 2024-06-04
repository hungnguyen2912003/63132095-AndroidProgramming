package thi.NguyenKhacDuyHung63132095.dethi1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMIFragment extends Fragment {

    EditText canNang, chieuCao, ketQua, Status;
    Button btnTinh;
    public BMIFragment() {
        // Required empty public constructor
    }

    public static BMIFragment newInstance(String param1, String param2) {
        BMIFragment fragment = new BMIFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Bước 2:
        View viewCau2 = inflater.inflate(R.layout.fragment_b_m_i, container, false);
        //////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////
        //Bước 3: Tìm điều khiển
        //Cú pháp: viewCau1.findViewById()
        canNang = viewCau2.findViewById(R.id.edtSoA);
        chieuCao = viewCau2.findViewById(R.id.edtSoB);
        ketQua = viewCau2.findViewById(R.id.edtKQ);
        btnTinh = viewCau2.findViewById(R.id.btnPT);
        Status = viewCau2.findViewById(R.id.edtStatus);
        //////////////////////////////////////////////////////////////////////////////////////
        //Bước 4: Gán sự kiện cho nút bấm: OnClickListener
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //-------- Trong hàm OnClickListener ----------//
                /////////////////////////////////////////////////////////////////////////////////////
                //Bước 5: Khai báo biến lấy dữ liệu nhập từ EditText
                //Cú pháp: String str = (tên biến EditText).getText().ToString();
                String strCanNang = canNang.getText().toString();
                String strChieuCao = chieuCao.getText().toString();
                String strkq = "";
                String strLK = "";

                Double weight = Double.parseDouble(strCanNang);
                Double height = Double.parseDouble(strChieuCao);
                Double bmi = weight / Math.pow(height,2);

                if(bmi < 18.5f){
                    strkq = "Thiếu cân";
                    strLK = "Bạn cần phải ăn uống và luyện tập thuờng xuyên";
                }
                else if(bmi > 18.5f && bmi < 24.9f){
                    strkq = "Khoẻ mạnh";
                    strLK = "Hãy duy trì trạng thái này nhé";
                }
                else if(bmi > 25 && bmi < 29.9f){
                    strkq = "Thừa cân";
                    strLK = "Bạn cần tập thể dục nhiều hơn";
                }
                else if(bmi > 30){
                    strkq = "Béo phì";
                    strLK = "Bạn cần phải ăn uống và hoạt động thể dục thể thao nhiều lên nhé.";
                }

                ketQua.setText(String.valueOf(Math.round(bmi)));
                Status.setText(strkq);
                Toast.makeText(getContext(), strLK, Toast.LENGTH_LONG).show();
            }
        });
        return viewCau2;
    }
}