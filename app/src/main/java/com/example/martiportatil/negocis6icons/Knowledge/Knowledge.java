package com.example.martiportatil.negocis6icons.Knowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.martiportatil.negocis6icons.R;

public class Knowledge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);
    }
}