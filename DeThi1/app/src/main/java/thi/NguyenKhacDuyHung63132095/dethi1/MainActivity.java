package thi.NguyenKhacDuyHung63132095.dethi1;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        //BottomNavView
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, new HomeFragment()).commit();
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment frg_selected = null;
                int itemID = item.getItemId();
                if(itemID == R.id.nav_home)
                {
                    frg_selected = new HomeFragment();
                }
                else if(itemID == R.id.nav_cau1)
                {
                    frg_selected = new BMIFragment();
                }
                else if(itemID == R.id.nav_cau2)
                {
                    frg_selected = new FamousCityFragment();
                }
                else if(itemID == R.id.nav_cau3)
                {
                    frg_selected = new NotesFragment();
                }
                else if(itemID == R.id.nav_cau4)
                {
                    frg_selected = new ProfileFragment();
                }
                if(frg_selected != null)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, frg_selected).commit();
                }
                return true;
            }
        });
    }
}