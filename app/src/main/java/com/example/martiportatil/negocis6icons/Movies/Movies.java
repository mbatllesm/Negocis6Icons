package com.example.martiportatil.negocis6icons.Movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.martiportatil.negocis6icons.R;

public class Movies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
    }
}
