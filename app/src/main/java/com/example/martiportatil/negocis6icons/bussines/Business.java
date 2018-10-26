package com.example.martiportatil.negocis6icons.bussines;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.martiportatil.negocis6icons.MainActivity;
import com.example.martiportatil.negocis6icons.R;

public class Business extends AppCompatActivity implements View.OnClickListener {
    private ImageView b1;
    private TextView titole;
    private EditText buscar;
    private String textsearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        b1 = findViewById(R.id.back);
        b1.setOnClickListener(this);
        titole = findViewById(R.id.titol);
        buscar = findViewById(R.id.search);
        buscar.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    Buscador();
                    return true;
                }
                return false;
            }
        });
    }
    private void Buscador() {
        textsearch = buscar.getText().toString();
        titole.setText(textsearch);
    }
    @Override
    public void onClick(View v) {
        if (v==b1)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
