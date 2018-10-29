package com.example.martiportatil.negocis6icons;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class empreses extends AppCompatActivity {
    private String empresa1 = getIntent().getStringExtra("empresa");
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empreses);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        image = findViewById(R.id.img);
        if (empresa1 == "")
        {

        }
    }
}
