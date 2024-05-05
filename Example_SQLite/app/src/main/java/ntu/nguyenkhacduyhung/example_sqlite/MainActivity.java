package ntu.nguyenkhacduyhung.example_sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //Bước 0. Tạo file cơ sở dữ liệu
//
//        /*name: tên file = tên db
//        mode: giới hạn truy cập
//        factory: con trỏ bản ghi*/
//        SQLiteDatabase db =openOrCreateDatabase("QLSach.db", MODE_PRIVATE,null);
//
//        //Bước 1. Tạo bảng
//            //Câu lệnh tạo bảng
//
//        String sqlDeleteTableExist = "DROP TABLE IF EXISTS Books;\n";
//        String sqlCreateTable = "CREATE TABLE Books(BookID integer PRIMARY KEY, BookName text, Page integer, Price Float, Description text);";
//
//
//        //Thực hiện lệnh SQL
//        db.execSQL(sqlDeleteTableExist);
//        db.execSQL(sqlCreateTable);
//
//        //Thêm một số dòng dữ liệu vào bảng
//        String sqlInsertTable1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'Sách về java');";
//        String sqlInsertTable2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
//        String sqlInsertTable3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'Sách đọc cho vui');";
//        String sqlInsertTable4 = "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
//        String sqlInsertTable5 = "INSERT INTO Books VALUES(5, 'CNXH', 1, 1, 'chuyện cổ tích');";
//        db.execSQL(sqlInsertTable1);
//        db.execSQL(sqlInsertTable2);
//        db.execSQL(sqlInsertTable3);
//        db.execSQL(sqlInsertTable4);
//        db.execSQL(sqlInsertTable5);
//
//        //Để quan sát trực quan file .db => Dùng ứng dụng
//
//        //Đóng lại để check
//        db.close();

        //Bước 1: Mở CSDL
        SQLiteDatabase db =openOrCreateDatabase("QLSach.db", MODE_PRIVATE,null);

        //Bước 2: Thực thi câu lệnh Select
        String sqlSelect = "Select * FROM Books";

        Cursor cs =  db.rawQuery(sqlSelect, null);
        cs.moveToFirst();   //Đưa con trỏ bản ghi về hàng đầu tiên
        //Buước 3: Đổ vào biến nào đó để xử lý
            //3.1. Xây dựng model/class cho bảng Book. Ví dụ Book.java
            //3.2. Tạo biến ArrayList<Book> dsSach
        ArrayList<Book> dsSach = new ArrayList<Book>();
            //3.3. Duyệt lần lượt từng bảng ghi và thêm vào danhSach
        while (cs.moveToNext()){
            int idSach = cs.getInt(0);
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);
            //Tạo một đối tượng sách và thêm vào danh sách
            Book b = new Book(idSach,tenSach,soTrang,gia,mota);
            dsSach.add(b);
        }
        //Buớc 4: Hiện lên listview hoặc recyclerview
        ArrayList<String> dsTenSach = new ArrayList<String>();
        for(int i = 0; i < dsTenSach.size(); i++){
            dsTenSach.add(dsSach.get(i).getBookName());
        }
    }
}