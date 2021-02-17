package com.example.myapplication;

import android.app.NotificationManager;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.*;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class StandortActivity extends AppCompatActivity implements View.OnClickListener{

    TextView begruessung, ptGebGes, ptName, ptAdresse, ptTelEmail;
    ImageView standort;
    EditText standortEingabe;
    Button btnWeiter;

    private static final String url = "jdbc:mysql://192.168.0.209:3306/myDB";
    private static final String user = "root";
    private static final String pass = "Hilal6161";

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


        ptGebGes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptName.setText("");
            }
        }) ;

        //OnkeyListener überspringt 1 feld immer
        ptGebGes.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ptTelEmail.requestFocus();
                    return true;
                } else
                    return false;
            }

        });

        ptName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptName.setText("");
            }
        });
        ptName.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ptAdresse.requestFocus();
                    return true;
                } else
                    return false;
            }
        });

        ptTelEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptTelEmail.setText("");
            }
        });

        ptTelEmail.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_ENTER)) {
                    btnWeiter.requestFocus();
                    return true;
                } else
                    return false;
            }
        });

        ptAdresse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ptAdresse.setText("");
            }
        });

        ptAdresse.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ptGebGes.requestFocus();
                    return true;
                } else
                    return false;
            }
        });
    }

    @Override
    public void onClick(View view){
        Intent intent = new Intent(this, GeschaefteActivity.class);
        startActivity(intent);
        this.finish();

        ConnectMySql connectMySql = new ConnectMySql();
        connectMySql.execute("");
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


    private class ConnectMySql extends AsyncTask<String, Void, String> {
        String res = "";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(StandortActivity.this, "Please wait...", Toast.LENGTH_SHORT)
                    .show();

        }

        @Override
        protected String doInBackground(String... params) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, user, pass);
                System.out.println("Databaseection success");

                String result = "Database Connection Successful\n";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select distinct Country from tblCountries");
                ResultSetMetaData rsmd = rs.getMetaData();

                while (rs.next()) {
                    result += rs.getString(1).toString() + "\n";
                }
                res = result;
            } catch (Exception e) {
                e.printStackTrace();
                res = e.toString();
            }
            return res;
        }

        @Override
        protected void onPostExecute(String result) {
            //txtData.setText(result);
        }
    }


    /*
    @Override
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

     onOpen method called when app is opening.

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

