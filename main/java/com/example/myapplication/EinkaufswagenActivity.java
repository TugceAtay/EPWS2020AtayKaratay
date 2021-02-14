package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class EinkaufswagenActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einkaufswagen);
        drawerLayout =findViewById(R.id.drawer_layout);
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
        ProduktkategorieActivity.redirectActivity(this,DashboardActivity.class);

    }

    public void ClickEinkaufswagen(View view) {
        recreate();
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