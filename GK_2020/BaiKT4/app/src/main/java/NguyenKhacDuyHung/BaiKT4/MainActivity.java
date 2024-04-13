package NguyenKhacDuyHung.BaiKT4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import NguyenKhacDuyHung.BaiKT4.adapter.AnimalAdapter;
import NguyenKhacDuyHung.BaiKT4.model.Animal;

public class MainActivity extends AppCompatActivity {

    ArrayList<Animal> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ds = new ArrayList<Animal>();
        ds.add(new Animal("Octopus", "8 tentacled monster", "vn"));
        ds.add(new Animal("Pig", "Delicious in rolls", "us"));
        ds.add(new Animal("Sheep", "Great of jumpers", "ru"));
        ds.add(new Animal("Rabbit", "Nice in a stew", "vn"));
        ds.add(new Animal("Snake", "Great of shoes", "ru"));
        ds.add(new Animal("Spider", "9 tentacled monster", "us"));

        ListView lvAnimal = findViewById(R.id.lvAnimal);

        AnimalAdapter adapter = new AnimalAdapter(this, ds);

        lvAnimal.setAdapter(adapter);

    }
}