package ntu.nguyenkhacduyhung.bottomnavigationview;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import ntu.nguyenkhacduyhung.bottomnavigationview.Friend.Friends;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.bottomNavigationView);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

        BadgeDrawable badgeDrawable = navigation.getOrCreateBadge(R.id.thongbao);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(35);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.trangchu) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                    return true;
                } else if (itemId == R.id.banbe) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FriendFragment()).commit();
                    return true;
                } else if (itemId == R.id.thongbao) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NotifyFragment()).commit();
                    return true;
                }

                return false;
            }
        });
    }
}