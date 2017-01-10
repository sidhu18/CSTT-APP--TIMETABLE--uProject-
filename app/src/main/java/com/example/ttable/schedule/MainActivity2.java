package com.example.ttable.schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        TextView txt = (TextView) findViewById(R.id.textViewout);
        Intent intent = getIntent();
        String Optex = intent.getStringExtra(MainActivitystrtpage.Optext3);
        txt.setTextSize(20);
        txt.setText(Optex);


    }
}
