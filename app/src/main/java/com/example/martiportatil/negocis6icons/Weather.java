package com.example.martiportatil.negocis6icons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Weather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
}
