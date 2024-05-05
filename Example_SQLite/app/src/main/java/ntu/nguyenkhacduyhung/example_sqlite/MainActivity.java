package ntu.nguyenkhacduyhung.example_sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList<Book> mylist;

    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvBook);
        //Bước 0. Tạo file cơ sở dữ liệu
        db = openOrCreateDatabase("QLSach.db", MODE_PRIVATE,null);

        //Bước 1. Tạo bảng
            //Câu lệnh tạo bảng
        String sqlDeleteTableExist = "DROP TABLE IF EXISTS Books;\n";
        String sqlCreateTable = "CREATE TABLE Books(BookID integer PRIMARY KEY, BookName text, Page integer, Price Float, Description text);";

        //Thực hiện lệnh SQL
        db.execSQL(sqlDeleteTableExist);
        db.execSQL(sqlCreateTable);

        //Thêm một số dòng dữ liệu vào bảng
        String sqlInsertTable1 = "INSERT INTO Books VALUES(1, 'Java', 100, 9.99, 'Sách về java');";
        String sqlInsertTable2 = "INSERT INTO Books VALUES(2, 'Android', 320, 19.00, 'Android cơ bản');";
        String sqlInsertTable3 = "INSERT INTO Books VALUES(3, 'Học làm giàu', 120, 0.99, 'Sách đọc cho vui');";
        String sqlInsertTable4 = "INSERT INTO Books VALUES(4, 'Tử điển Anh-Việt', 1000, 29.50, 'Từ điển 100.000 từ');";
        String sqlInsertTable5 = "INSERT INTO Books VALUES(5, 'CNXH', 650, 50.32, 'chuyện cổ tích');";
        String sqlInsertTable6 = "INSERT INTO Books VALUES(6, 'Con vịt', 1000, 24.35, 'Vịt vàng trong hồ bơi');";
        String sqlInsertTable7 = "INSERT INTO Books VALUES(7, 'Mạng máy tính', 540, 86.42, 'Bài giảng Packet Tracer');";
        String sqlInsertTable8 = "INSERT INTO Books VALUES(8, 'Ba con mèo', 1000, 100.25, 'Con mèo méo meo');";
        String sqlInsertTable9 = "INSERT INTO Books VALUES(9, 'Năm con cá', 40, 56.42, 'Tui là con cá');";
        String sqlInsertTable10 = "INSERT INTO Books VALUES(10, 'SQLite', 500, 150.32, 'SQLite tổng hợp');";
        db.execSQL(sqlInsertTable1);
        db.execSQL(sqlInsertTable2);
        db.execSQL(sqlInsertTable3);
        db.execSQL(sqlInsertTable4);
        db.execSQL(sqlInsertTable5);
        db.execSQL(sqlInsertTable6);
        db.execSQL(sqlInsertTable7);
        db.execSQL(sqlInsertTable8);
        db.execSQL(sqlInsertTable9);
        db.execSQL(sqlInsertTable10);
        //Để quan sát trực quan file .db => Dùng ứng dụng
            //Đóng lại để check
        db.close();

        ////////////////////----Hiển thị lên Android---/////////////////////
        //Bước 1: Mở CSDL
        SQLiteDatabase db = openOrCreateDatabase("QLSach.db", MODE_PRIVATE,null);

        //Bước 2: Thực thi câu lệnh Select
        String sqlSelect = "Select * FROM Books";
        Cursor cs =  db.rawQuery(sqlSelect, null);

        //Buước 3: Đổ vào biến nào đó để xử lý
            //3.1. Xây dựng model/class cho bảng Book. Ví dụ Book.java
            //3.2. Tạo biến ArrayList<Book> dsSach
        mylist = new ArrayList<Book>();
            //3.3. Duyệt lần lượt từng bảng ghi và thêm vào danhSach
        while (cs.moveToNext()){
            int idSach = cs.getInt(0);
            String tenSach = cs.getString(1);
            int soTrang = cs.getInt(2);
            float gia = cs.getFloat(3);
            String mota = cs.getString(4);

            // Tạo một đối tượng sách và thêm vào danh sách
            Book b = new Book(idSach,tenSach,soTrang,gia,mota);
            mylist.add(b);
        }

        BookAdapter adapter = new BookAdapter(this, mylist);

        lv.setAdapter(adapter);
    }
}