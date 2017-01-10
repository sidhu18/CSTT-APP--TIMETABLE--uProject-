package com.example.ttable.schedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splashact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashact);

        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        Intent intentsrt = new Intent(splashact.this,MainActivity.class);
                        startActivity(intentsrt);
                        finish();
                    }},2000);
                }
    }


