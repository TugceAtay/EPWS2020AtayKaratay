package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GeschaefteActivity extends AppCompatActivity implements View.OnClickListener{

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

        ibLidl.setOnClickListener( new View.OnClickListener(){
                                        public void onClick(View v){



                                            Intent intent = new Intent(this, AuswahlGeschaeftActivity.class);
                                            startActivity(intent);
                                            this.finish();

                                        }

                                   }



        );*/
        ibAldi.setOnClickListener(this);
    }



    @Override
    public void onClick(View view){

    }

/*
    public void auswaehlenGeschaefte(){
        Intent intent = new Intent(this, AuswahlGeschaeftActivity.class);
        intent.putExtra("switchLidl", switchLidl.isChecked());
    }*/


}