package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GeschaefteActivity extends AppCompatActivity {

    TextView tvGeschaefte, tvGeschaefteText;
    // Switch switchLidl, switchAldi, switchNetto, switchRewe;
    // Button btnWeiter;
    ImageButton ibLidl, ibAldi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geschaefte);

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
                                       public void onClick(View v){
                                           Intent intent = new Intent(GeschaefteActivity.this, AuswahlGeschaeftLidlActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );

        ibAldi.setOnClickListener( new View.OnClickListener(){
                                       public void onClick(View v){
                                           Intent intent = new Intent(GeschaefteActivity.this, AuswahlGeschaeftAldiActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );

    }