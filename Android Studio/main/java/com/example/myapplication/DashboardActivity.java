package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import org.w3c.dom.CDATASection;

public class DashboardActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view) {
        ProduktkategorieActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view) {
        ProduktkategorieActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view) {
        ProduktkategorieActivity.redirectActivity(this, ProduktkategorieActivity.class);
    }

    public void ClickDashboard(View view) {
        recreate();
    }

    public void ClickEinkaufswagen(View view) {
        ProduktkategorieActivity.redirectActivity(this,EinkaufswagenActivity.class);
    }

    public void ClickLogout(View view){
        ProduktkategorieActivity.logout(this);
    }

    @Override
    protected void onPause(){
        super.onPause();
        ProduktkategorieActivity.closeDrawer(drawerLayout);
            }
}