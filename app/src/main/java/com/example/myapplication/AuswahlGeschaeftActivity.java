package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AuswahlGeschaeftActivity extends AppCompatActivity implements View.OnClickListener {

        TextView tvGeschaeftText2, tvAuswahlgeschaeft, tvdetailGeschaefteLidl, tvDetailGeschaefteAldi, tvDetailGeschaefteNetto, tvDetailGeschaefteRewe;
        boolean switchChecked;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_auswahlgeschaeft);

                tvAuswahlgeschaeft = findViewById(R.id.tvauswahlgeschaeft);
                // tvdetailGeschaefteLidl = findViewById(R.id.tvdetailgeschaeftelidl);
                tvDetailGeschaefteAldi = findViewById(R.id.tvdetailgeschaeftealdi);
                tvDetailGeschaefteNetto = findViewById(R.id.tvdetailgeschaeftenetto);
                tvDetailGeschaefteRewe = findViewById(R.id.tvdetailgeschaefterewe);

                tvdetailGeschaefteLidl.setOnClickListener(this);
                tvDetailGeschaefteAldi.setOnClickListener(this);
                tvDetailGeschaefteNetto.setOnClickListener(this);
                tvDetailGeschaefteRewe.setOnClickListener(this);


    /*   Intent intent = getIntent();
        switchChecked = intent.getBooleanExtra("switchLidl",);
        }

        //Swicht-Anweisung für die klickable adressen anlegen,da das in cases unterteilt werden kann den folgenden bilschirim einmal designen und rest kopieren

//Intent greif auf vorheriges switch ob geklickt ider nicht


        public void ausgabe(){

        switch(v.getString()){

        }
                case R.id.      :
                getIntent().getBooleanExtra();
                if  (ibLidl.isChecked){
                        tvDetailGeschaefteRewe.setText("Lidl Industriestraße 2     51643 Gummersbach     Öffnungszeiten:        Montag - Samstag    07:00 Uhr - 21:00 Uhr");
                        tvDetailGeschaefteAldi.setText("Aldi Kölner Str. 2-14      51702 Bergneustadt    Öffnungszeiten:        Montag - Samstag    08:00 Uhr - 21:00 Uhr");
                        tvDetailGeschaefteNetto.setText("Netto Kölner Str. 304  51702 Bergneustadt     Öffnungszeiten:        Montag - Samstag    07:00 Uhr - 21:00 Uhr");

                        tvDetailGeschaefteRewe.setOnClickListener(new View.OnClickListener(){
                                public void onClick(View view){
                                        Intent intent = new Intent(this, MainActivity.class);
                                        startActivity(intent);
                                        this.finish();
                                }
                        }
                        );
                }*/


        }


                @Override
                public void onClick (View view){
                }


        }


