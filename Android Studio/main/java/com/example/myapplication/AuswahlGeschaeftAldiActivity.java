package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AuswahlGeschaeftAldiActivity extends AppCompatActivity {

        TextView tvgeschaefttext2, tvauswahlgeschaeft, tvdetailgeschaeftaldi1 , tvdetailgeschaeftaldi2, tvdetailgeschaeftaldi3;
        Button btnAuswaehlen1, btnAuswaehlen2,btnAuswaehlen3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_auswahlgeschaeftaldi);

                tvgeschaefttext2 = findViewById(R.id.tvgeschaefttext2);
                tvauswahlgeschaeft = findViewById(R.id.tvauswahlgeschaeft);
                tvdetailgeschaeftaldi1= findViewById(R.id.tvdetailgeschaeftlidl1);
                tvdetailgeschaeftaldi2= findViewById(R.id.tvdetailgeschaeftaldi2);
                tvdetailgeschaeftaldi3 = findViewById(R.id.tvdetailgeschaeftealdi3);
                btnAuswaehlen1 =findViewById(R.id.btnauswaehlen1);
                btnAuswaehlen2 =findViewById(R.id.btnauswaehlen2);
                btnAuswaehlen3 = findViewById(R.id.btnauswaehlen3);


                btnAuswaehlen1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent intent = new Intent(AuswahlGeschaeftAldiActivity.this, ProduktkategorieActivity.class);
                                startActivity(intent);
                        }
                }) ;

                btnAuswaehlen2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent intent = new Intent(AuswahlGeschaeftAldiActivity.this, ProduktkategorieActivity.class);
                                startActivity(intent);
                        }
                }) ;

                btnAuswaehlen3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent intent = new Intent(AuswahlGeschaeftAldiActivity.this, ProduktkategorieActivity.class);
                                startActivity(intent);
                        }
                }) ;

        }

}


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




