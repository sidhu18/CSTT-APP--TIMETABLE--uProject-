package com.example.ttable.schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public final static String spinnerdat ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main_strtpage);
        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String spinnerval;
                Intent intentmain = new Intent(MainActivity.this,MainActivitystrtpage.class);
                Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
                spinnerval= String.valueOf(spinner3.getSelectedItem());
                intentmain.putExtra(spinnerdat,spinnerval);
                startActivity(intentmain);
            }
        });
    }
}