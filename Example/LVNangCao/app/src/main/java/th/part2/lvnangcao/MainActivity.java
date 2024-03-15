package th.part2.lvnangcao;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import th.part2.lvnangcao.adapters.CountryAdapter;
import th.part2.lvnangcao.model.Country;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> dsQG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bước 1
        dsQG = new ArrayList<Country>();
        dsQG.add(new Country("Việt Nam", 90, "vn"));
        dsQG.add(new Country("Russia", 100, "ru"));
        dsQG.add(new Country("United State", 80, "us"));

        ListView listView = findViewById(R.id.lvQG);
        CountryAdapter adapter = new CountryAdapter(this, dsQG);
        listView.setAdapter(adapter);
    }
}