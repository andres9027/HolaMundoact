package com.andres.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String var = "Hola mundo";
        TextView vista;
        vista = new TextView(this);
        this.setTitle("APP ANDRES QUIROGA UMB VIRTUAL");
        vista.setText(var);
        setContentView(vista);
    }

     

}