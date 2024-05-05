package ntu.nguyenkhacduyhung.example_sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtID, edtName, edtPage, edtPrice, edtDes;

    Button btnThem, btnSua, btnXoa, btnTVan;

    ListView lv;

    ArrayList<String> mylist;
    ArrayAdapter<String> adapter;

    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        // Tạo và mở Cơ sở dữ liệu Sqlite
        db = openOrCreateDatabase("QLSach.db",MODE_PRIVATE,null);
        // Tạo Table để chứa dữ liệu
        String sqlCreateTable = "CREATE TABLE Books(BookID integer PRIMARY KEY, BookName text, Page integer, Price Float, Description text);";
        String sqlDeleteTableExist = "DROP TABLE IF EXISTS Books;\n";
        db.execSQL(sqlDeleteTableExist);
        db.execSQL(sqlCreateTable);


        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edtID.getText().toString());
                String name = edtName.getText().toString();
                int page = Integer.parseInt(edtPage.getText().toString());
                float price = Float.parseFloat(edtPrice.getText().toString());
                String des = edtDes.getText().toString();

                ContentValues myvalue = new ContentValues();
                myvalue.put("BookID", id);
                myvalue.put("BookName", name);
                myvalue.put("Page", page);
                myvalue.put("Price", price);
                myvalue.put("Description", des);
                String msg = "";
                if(db.insert("Books", null, myvalue) == -1){
                    msg = "Thêm dữ liệu thất bại";
                }
                else{
                    msg = "Thêm dữ liệu thành công";
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                edtID.setText("");
                edtName.setText("");
                edtPage.setText("");
                edtPrice.setText("");
                edtDes.setText("");
                edtID.requestFocus();
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edtID.getText().toString());
                int n = db.delete("Books", "id = ?", new String[]{String.valueOf(id)});
                String msg = "";
                if(n == 0){
                    msg = "Không có dữ liệu để xoá";
                }
                else{
                    msg = "Bản ghi " + n + "đã được xoá";
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edtID.getText().toString());
                String name = edtName.getText().toString();
                int page = Integer.parseInt(edtPage.getText().toString());
                float price = Float.parseFloat(edtPrice.getText().toString());
                String des = edtDes.getText().toString();
                ContentValues myvalue = new ContentValues();
                myvalue.put("BookName", name);
                myvalue.put("Page", page);
                myvalue.put("Price", price);
                myvalue.put("Description", des);
                int n = db.delete("Books", "id = ?", new String[]{String.valueOf(id)});
                String msg = "";
                if(n == 0){
                    msg = "Không có dữ liệu để xoá";
                }
                else{
                    msg = "Bản ghi " + n + "đã được cập nhật";
                }
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        });

        btnTVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mylist.clear();
                Cursor c = db.query("Books", null, null,null,null,null, null);
                c.moveToNext();
                String data = "";
                while(c.isAfterLast() == false){
                    data = c.getString(0) + " - " + c.getString(1) + " - " + c.getString(2);
                    c.moveToNext();
                    mylist.add(data);
                }
                c.close();
                adapter.notifyDataSetChanged();
            }
        });
    }

    void TimDieuKhien(){
        edtID = findViewById(R.id.edtBookID);
        edtName = findViewById(R.id.edtBookName);
        edtPage = findViewById(R.id.edtPage);
        edtPrice = findViewById(R.id.edtGia);
        edtDes = findViewById(R.id.edtDescription);

        btnThem = findViewById(R.id.btnThem);
        btnSua = findViewById(R.id.btnUpdate);
        btnXoa = findViewById(R.id.btnDel);
        btnTVan = findViewById(R.id.btnQuery);

        lv = findViewById(R.id.lvBook);

        mylist = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mylist);

        lv.setAdapter(adapter);
    }
}