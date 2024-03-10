package com.example.life_manager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout s_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        NavigationView nav = findViewById(R.id.side_menu);
        nav.setNavigationItemSelectedListener(this);

        s_menu = (DrawerLayout) findViewById(R.id.main);
    }

    public boolean onNavigationItemSelected(MenuItem item){
        int id = item.getItemId();
        s_menu.closeDrawer(GravityCompat.START);
        return false;
    }
}