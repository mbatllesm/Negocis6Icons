package com.example.martiportatil.negocis6icons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView b1;
    private ImageView b2;
    private ImageView b3;
    private ImageView b4;
    private ImageView b5;
    private ImageView b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.business);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.restaurant);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.movies);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.weather);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.hotels);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.knowledge);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==b1)
        {
            Intent intent = new Intent(this,Business.class);
            startActivity(intent);
        }
        else if (v==b2)
        {
            Intent intent = new Intent(this,Hotels.class);
            startActivity(intent);
        }
    }
}
