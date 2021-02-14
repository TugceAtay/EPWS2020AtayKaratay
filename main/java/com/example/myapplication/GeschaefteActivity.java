package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class GeschaefteActivity extends AppCompatActivity {

    TextView tvGeschaefte, tvGeschaefteText;
  // Switch switchLidl, switchAldi, switchNetto, switchRewe;
  // Button btnWeiter;
   ImageButton ibLidl, ibAldi;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geschaefte);

        drawerLayout =findViewById(R.id.drawer_layout);
        tvGeschaefte =findViewById(R.id.tvGeschaefte);
        tvGeschaefteText = findViewById(R.id.tvGeschaefteText);
        ibAldi = findViewById(R.id.ibAldi);
        ibLidl = findViewById(R.id.ibLidl);

  /*
        switchAldi = findViewById(R.id.switchAldi);
        switchLidl = findViewById(R.id.switchLidl);

        switchLidl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){

                    }
                }else
            }
        });
        switchAldi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){

            } else{
        });
       switchNetto= findViewById(R.id.switchNetto);
       switchRewe = findViewById(R.id.switchRewe);

       btnWeiter = findViewById(R.id.btnWeiter);
       btnWeiter.setOnClickListener(this);
*/
       ibLidl.setOnClickListener( new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Intent intenti = new Intent(GeschaefteActivity.this, AuswahlGeschaeftLidlActivity.class);
               startActivity(intenti);
           }
       }
       );

        ibAldi.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(GeschaefteActivity.this, AuswahlGeschaeftAldiActivity.class);
                startActivity(intent);
            }
        }
        );

    }
    public void ClickMenu(View view) {
        ProduktkategorieActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view) {
        ProduktkategorieActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view) { ProduktkategorieActivity.redirectActivity(this, ProduktkategorieActivity.class); }

    public void ClickDashboard(View view) { ProduktkategorieActivity.redirectActivity(this,DashboardActivity.class); }

    public void ClickEinkaufswagen(View view) { ProduktkategorieActivity.redirectActivity(this,EinkaufswagenActivity.class); }

    public void ClickLogout(View view){ ProduktkategorieActivity.logout(this); }

    @Override
    protected void onPause(){
        super.onPause();
        ProduktkategorieActivity.closeDrawer(drawerLayout);
    }

}