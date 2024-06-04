package thi.NguyenKhacDuyHung63132095.dethi1;

import static android.content.Context.MODE_PRIVATE;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class NotesFragment extends Fragment {
    //Khai báo biến toàn cục
    SQLiteDatabase db;

    public NotesFragment() {
        // Required empty public constructor
    }

    public static NotesFragment newInstance(String param1, String param2) {
        NotesFragment fragment = new NotesFragment();
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
                /////////////////////////////////////////////////////////////////////////////////////
        //-------- Tạo cơ sở dữ liệu --------------
        //Bước 0. Tạo file cơ sở dữ liệu
        db = getActivity().openOrCreateDatabase("Notes.db",MODE_PRIVATE,null);

        //Bước 1. Tạo bảng
        String sqlDeleteTableExist = "DROP TABLE IF EXISTS NOTES;\n";
        String sqlCreateTable = "CREATE TABLE NOTES(NoteID integer PRIMARY KEY, NoteName text, Description text);";
        //Thực hiện lệnh SQL
        db.execSQL(sqlDeleteTableExist);
        db.execSQL(sqlCreateTable);


        //Bước 2. Thêm dữ liệu
        // Thêm một số dòng dữ liệu vào bảng
        String sqlThem1 = "INSERT INTO NOTES VALUES(1, 'Java', 'Lập trình java');";
        String sqlThem2 = "INSERT INTO NOTES VALUES(2, 'Android', 'Lập trình Android');";
        String sqlThem3 = "INSERT INTO NOTES VALUES(3, 'Cơ sở dữ liệu', 'SQL');";
        String sqlThem4 = "INSERT INTO NOTES VALUES(4, 'Tiếng anh B2', 'English');";
        String sqlThem5 = "INSERT INTO NOTES VALUES(5, 'Nhật ký vui', 'dialy note');";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
        db.execSQL(sqlThem3);
        db.execSQL(sqlThem4);
        db.execSQL(sqlThem5);
        // Để quan sát trực quan file .db ? ==> Dùng ứng dụng DB Browser for SQLite
        // Để mở được, ta file save file từ điện thoại ra đĩa cứng
        // Ta đóng lại để check
        db.close();

        /////////////////////////////////////////////////////////////////////////////////////
        ////////////////////----Hiển thị lên Android---/////////////////////
        //Bước 1: Mở CSDL
        db = getActivity().openOrCreateDatabase("Notes.db",MODE_PRIVATE,null);

        //Bước 2. Thực thi câu lệnh select
        String sqlSelect ="Select * from NOTES;";
        Cursor cs = db.rawQuery(sqlSelect,null);

        //Bước 3: Đổ vào biến nào đó để xử lý
        //3.1. Xây dựng model/class cho bảng Books, vi dụ: Book.java
        //3.2. Tạo biến ArrayList<Book> dsSach;
        ArrayList<notes> dsNote = new ArrayList<notes>();
        //3.3. Duyệt qua lần lượt từng bản ghi và thêm vào danhSach
        while (cs.moveToNext()) // còn bản ghi để chuyển tới
        {
            // Lấy dữ liệu từng côột ở dòng hiện tại
            int idNote = cs.getInt(0);  // lấy dữ liệu ở côt 0, kiểu int
            String tenNote = cs.getString(1);
            String mota = cs.getString(2);
            // Tạo một đối tượng sách và thêm vào danh sách
            notes n = new notes(idNote,tenNote,mota);
            dsNote.add(n);
        }
        //Bước 4: Hiện lên listview, recylerview,..
        //Chỉ hiển thị tên sách
        ArrayList<String> dsTenNote = new ArrayList<String>();
        for (int i=0; i<dsNote.size(); i++)
            dsTenNote.add(dsNote.get(i).getTitle());

        //Bước 5:
        View viewCau4 = inflater.inflate(R.layout.fragment_notes, container, false);

        //Bước 6: Tìm điều khiển
        ListView lsTenNote = viewCau4.findViewById(R.id.lVNote);

        //Bước 7: Khởi tạo Adapter
        ArrayAdapter<String> adapterTenNote = new ArrayAdapter<String>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTenNote
        );

        //Bước 8: Gán adapter vào listView
        lsTenNote.setAdapter(adapterTenNote);
        return viewCau4;
    }
}