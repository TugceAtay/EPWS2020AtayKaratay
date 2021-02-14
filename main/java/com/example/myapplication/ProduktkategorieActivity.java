package com.example.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class ProduktkategorieActivity extends AppCompatActivity {

    private static DrawerLayout drawerLayout;
    private AppBarConfiguration mAppBarConfiguration;
    CheckedTextView CTVKategorieTiefkuehl, CTVKategorieBrotundAufstrich, CTVKategorieObstundGemuese,CTVKategorieDrogerie;
    Button btnWeiter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produkte);

        drawerLayout = findViewById(R.id.drawer_layout);

        btnWeiter = (Button) findViewById((R.id.btnWeiter));
        CTVKategorieTiefkuehl = (CheckedTextView) findViewById(R.id.CTVKategegorieTiefkuehl); // initiate a CheckedTextView
        CTVKategorieBrotundAufstrich = (CheckedTextView) findViewById(R.id.CTVKategorieBrotundAufstrich);
        CTVKategorieObstundGemuese = (CheckedTextView) findViewById(R.id.CTVKategegorieObstundGemuese);
        CTVKategorieDrogerie = (CheckedTextView) findViewById(R.id.CTVKategegorieDrogerie);


        CTVKategorieTiefkuehl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CTVKategorieTiefkuehl.isChecked()){
                    CTVKategorieTiefkuehl.setChecked(false);
                }
                else CTVKategorieTiefkuehl.setChecked(true);
            }
        });


        CTVKategorieObstundGemuese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CTVKategorieObstundGemuese.isChecked()){
                    CTVKategorieObstundGemuese.setChecked(false);
                }
                else CTVKategorieObstundGemuese.setChecked(true);
            }
        });

        CTVKategorieBrotundAufstrich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CTVKategorieBrotundAufstrich.isChecked()){
                    CTVKategorieBrotundAufstrich.setChecked(false);
                }
                else CTVKategorieBrotundAufstrich.setChecked(true);
            }
        });

        CTVKategorieDrogerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CTVKategorieDrogerie.isChecked()){
                    CTVKategorieDrogerie.setChecked(false);
                }
                else CTVKategorieDrogerie.setChecked(true);
            }
        });


        Boolean checkedValueTiefkuehl = CTVKategorieTiefkuehl.isChecked(); // check current state of CheckedTextView
        Boolean checkedValueBrotundAufstrich = CTVKategorieBrotundAufstrich.isChecked();
        Boolean checkedValueObstundGemuese = CTVKategorieObstundGemuese.isChecked();
        Boolean checkedValueDrogerie = CTVKategorieDrogerie.isChecked();


        btnWeiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProduktkategorieActivity.this, ProduktkategorieActivity.class);
                startActivity(intent);
            }
        }) ;
    }

    public void ClickMenu(View view){
        //öffnet drawer
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void clickHome(View view){
        recreate();
    }

    public void clickDashboard(View view){
        redirectActivity(this, DashboardActivity.class);
    }

    public void clickEinkaufswagen(View view){
        redirectActivity(this,EinkaufswagenActivity.class);
    }

    public void clickLogout(View view){
        logout(this);
    }

    public static void logout (Activity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Wollen Sie die Anwendung wirklich verlassen?");
        builder.setPositiveButton("JA!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });

        builder.setNegativeButton("Nein.", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();
    }

    public static void redirectActivity(Activity activity, Class aclass) {
        Intent intent= new Intent (activity, aclass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        activity.startActivity(intent);
    }

    @Override
    protected void onPause(){
        super.onPause();
        closeDrawer(drawerLayout);
    }


}

