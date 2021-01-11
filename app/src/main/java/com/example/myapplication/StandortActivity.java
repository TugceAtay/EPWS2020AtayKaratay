package com.example.myapplication;

import android.app.NotificationManager;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;

public class StandortActivity extends AppCompatActivity implements View.OnClickListener{

    TextView begruessung, tvdatenerfassen, ptGebGes, ptName, ptAdresse, ptTelEmail;
    ImageView standort;
    EditText standortEingabe;
    Button btnWeiter;

    final String prefNameFirstStart = "FirstAppStart";
    final String databaseBenutzer = "benutzer.db";
    final String databaseBenutzerTabelenname ="Benutzer";
    final String databaseMaerkte = "Maerkte.db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standort);

        standort = findViewById(R.id.standort);
        begruessung = findViewById(R.id.begruessung);
        btnWeiter = (Button) findViewById(R.id.btnWeiter);
        ptAdresse = findViewById(R.id.ptAdresse);
        ptName= findViewById(R.id.ptName);
        ptTelEmail = findViewById(R.id.ptTelEmail);
        ptGebGes = findViewById(R.id.ptGebGes);

        btnWeiter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        Intent intent = new Intent(this, GeschaefteActivity.class);
        startActivity(intent);
        this.finish();

    }

    public boolean firstAppStart(){   //Soll zeigen, dass die App das erste mal gestartet wird
        SharedPreferences preferences =getSharedPreferences(prefNameFirstStart,MODE_PRIVATE); //Daten können nur in dieser app verwendet werden
        if(preferences.getBoolean(prefNameFirstStart,true)){
            SharedPreferences.Editor editor = preferences.edit(); //hilft als editor um die einträge zu bearbeiten
            editor.putBoolean(prefNameFirstStart,false);
            editor.apply();
            return true;
        }
        else return false;
    }


  /*  @Override
    public void onCreate(SQLiteDatabase db)
    {
        try{
            db.execSQL("create table " +          NotificationManager.getUserStatic(context) + "log ("+
                    KEY_TIME +" INTEGER primary key, "+ KEY_TEXT +" TEXT not null);");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * onOpen method called when app is opening.

    @Override
    public void onOpen(SQLiteDatabase db)
    {
        try{
            System.out.println("tophere");
            db.execSQL("create table if not exists "+DATABASE_NAME+"." + NotificationManager.getUserStatic(context) + "log ("+
                    KEY_TIME +" INTEGER primary key, "+ KEY_TEXT +" TEXT not null);");
            System.out.println("downhere");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }



    public void createDatabaseBenutzer(){ //Datenbank für Benutzer nicht Online
        SQLiteDatabase benutzer =  openOrCreateDatabase(databaseBenutzer,MODE_PRIVATE,null); //cursor factory ist die position auf der datenbank
        databaseBenutzer.execSQL("CREATE_TABLE "+ databaseBenutzerTabelenname + "(id INTEGER,name TEXT,anschrift TEXT, gebGes INTEGER) ");
        databaseBenutzer.execSQL("INSERT_INTO" + databaseBenutzerTabelenname+ "VALUES(id,ptName,ptAdresse,ptGebGes)");
    }

*/

}

