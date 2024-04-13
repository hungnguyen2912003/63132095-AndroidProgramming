package com.example.baikt4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Animal> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ds = new ArrayList<Animal>();
        ds.add(new Animal("Octopus", "8 tentacled monster", "octopus"));
        ds.add(new Animal("Pig", "Delicious in rolls", "pig"));
        ds.add(new Animal("Sheep", "Great of jumpers", "sheep"));
        ds.add(new Animal("Rabbit", "Nice in a stew", "rabbit"));
        ds.add(new Animal("Snake", "Great of shoes", "snake"));
        ds.add(new Animal("Spider", "9 tentacled monster", "spider"));

        ListView lvAnimal = findViewById(R.id.lvAnimal);

        AnimalAdapter adapter = new AnimalAdapter(this, ds);

        lvAnimal.setAdapter(adapter);

    }
}