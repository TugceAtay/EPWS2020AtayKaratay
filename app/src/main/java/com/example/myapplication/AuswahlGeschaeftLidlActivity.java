package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AuswahlGeschaeftLidlActivity extends AppCompatActivity {

    TextView tvgeschaefttext2,tvauswahlgeschaeft, tvdetailgeschaeftelidl1, tvdetailgeschaeftelidl2, tvdetailgeschaeftelidl3;
    Button btnAuswaehlen1, btnAuswaehlen2,btnAuswaehlen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auswahlgeschaeftlidl);

        tvgeschaefttext2 = findViewById(R.id.tvgeschaefttext2);
        tvauswahlgeschaeft = findViewById(R.id.tvauswahlgeschaeft);
        tvdetailgeschaeftelidl1= findViewById(R.id.tvdetailgeschaeftlidl1);
        tvdetailgeschaeftelidl2= findViewById(R.id.tvdetailgeschaeftaldi2);
        tvdetailgeschaeftelidl3 = findViewById(R.id.tvdetailgeschaeftealdi3);
        btnAuswaehlen1 =findViewById(R.id.btnauswaehlen1);
        btnAuswaehlen2 =findViewById(R.id.btnauswaehlen2);
        btnAuswaehlen3 = findViewById(R.id.btnauswaehlen3);



        btnAuswaehlen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuswahlGeschaeftLidlActivity.this, ProduktkategorieActivity.class);
                startActivity(intent);
            }
        }) ;

        btnAuswaehlen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuswahlGeschaeftLidlActivity.this, ProduktkategorieActivity.class);
                startActivity(intent);
            }
        }) ;

        btnAuswaehlen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuswahlGeschaeftLidlActivity.this, ProduktkategorieActivity.class);
                startActivity(intent);
            }
        }) ;

    }
}
