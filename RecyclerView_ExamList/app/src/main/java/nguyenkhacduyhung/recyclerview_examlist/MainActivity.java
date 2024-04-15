package nguyenkhacduyhung.recyclerview_examlist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageGalleryAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Exam List");
        setSupportActionBar(toolbar);

        List<examData> list = new ArrayList<examData>();
        list.add(new examData("First Exam","May 23, 2015","Best Of Luck"));
        list.add(new examData("Second Exam","June 09, 2015","b of l"));
        list.add(new examData("My Test Exam","April 27, 2017","This is testing exam .."));

        recyclerView = findViewById(R.id.recyclerView);

        adapter = new ImageGalleryAdapter(list, getApplication());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}