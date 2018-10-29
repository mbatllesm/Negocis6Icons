package com.example.martiportatil.negocis6icons;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class empreses extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String empresa1 = getIntent().getExtras().getString("empresa");
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        ImageView image;
        setContentView(R.layout.activity_empreses);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        image = findViewById(R.id.img);
        if (empresa1.equalsIgnoreCase("La Gralla"))
        {
            image.setImageResource(R.drawable.la_gralla);
            //setContentView(image);
        }else if(empresa1.equalsIgnoreCase("General Optica"))
        {
            image.setImageResource(R.drawable.general_optica);
            //setContentView(image);
        }else if(empresa1.equalsIgnoreCase("Autoescola Granollers"))
        {
            image.setImageResource(R.drawable.autoescola_granollers);
            //setContentView(image);
        }
    }
}
