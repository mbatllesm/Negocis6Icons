package com.example.martiportatil.negocis6icons.bussines;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.martiportatil.negocis6icons.MainActivity;
import com.example.martiportatil.negocis6icons.R;

public class Business extends AppCompatActivity implements View.OnClickListener {
    private ImageView b1;
    private LinearLayout Lgralla;
    private LinearLayout Lautoescola_granollers;
    private LinearLayout Lgerneral_optica;
    private LinearLayout Barra1;
    private LinearLayout Barra2;
    private LinearLayout Barra3;
    private TextView Tgralla;
    private TextView Tautoescola_granollers;
    private TextView Tgerneral_optica;
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
        Barra1 = findViewById(R.id.linea2);
        Barra2 = findViewById(R.id.linea3);
        Barra3 = findViewById(R.id.linea4);
        Lgralla = findViewById(R.id.layout_la_gralla);
        Lautoescola_granollers = findViewById(R.id.layout_autoescola_granollers);
        Lgerneral_optica = findViewById(R.id.layout_general_optica);
        Tgralla = findViewById(R.id.text_la_gralla);
        Tautoescola_granollers = findViewById(R.id.text_autoescola_granollers);
        Tgerneral_optica = findViewById(R.id.text_general_optica);
        Lautoescola_granollers.setOnClickListener(this);
        Lgralla.setOnClickListener(this);
        Lgerneral_optica.setOnClickListener(this);
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
        ViewGroup.LayoutParams params;
        textsearch = buscar.getText().toString();
        if (textsearch.equalsIgnoreCase(Tgerneral_optica.getText().toString()))
        {
            Lgerneral_optica.setVisibility(View.VISIBLE);
            params = Lgerneral_optica.getLayoutParams();
            params.height= ViewGroup.LayoutParams.WRAP_CONTENT;
            Lgerneral_optica.setLayoutParams(params);
            Barra1.setVisibility(View.INVISIBLE);
            Barra2.setVisibility(View.INVISIBLE);
            Barra3.setVisibility(View.VISIBLE);
            Lautoescola_granollers.setVisibility(View.INVISIBLE);
            params = Lautoescola_granollers.getLayoutParams();
            params.height=0;
            Lautoescola_granollers.setLayoutParams(params);
            Lgralla.setVisibility(View.INVISIBLE);
            params = Lgralla.getLayoutParams();
            params.height=0;
            Lgralla.setLayoutParams(params);
        }else if (textsearch.equalsIgnoreCase(Tautoescola_granollers.getText().toString()))
        {
            Lautoescola_granollers.setVisibility(View.VISIBLE);
            params = Lautoescola_granollers.getLayoutParams();
            params.height= ViewGroup.LayoutParams.WRAP_CONTENT;
            Lautoescola_granollers.setLayoutParams(params);
            Barra1.setVisibility(View.INVISIBLE);
            Barra2.setVisibility(View.VISIBLE);
            Barra3.setVisibility(View.INVISIBLE);
            Lgralla.setVisibility(View.INVISIBLE);
            params = Lgralla.getLayoutParams();
            params.height=0;
            Lgralla.setLayoutParams(params);
            Lgerneral_optica.setVisibility(View.INVISIBLE);
            params = Lgerneral_optica.getLayoutParams();
            params.height=0;
            Lgerneral_optica.setLayoutParams(params);
        }else if (textsearch.equalsIgnoreCase(Tgralla.getText().toString()))
        {
            Lgralla.setVisibility(View.VISIBLE);
            params = Lgralla.getLayoutParams();
            params.height= ViewGroup.LayoutParams.WRAP_CONTENT;
            Lgralla.setLayoutParams(params);
            Barra1.setVisibility(View.VISIBLE);
            Barra2.setVisibility(View.INVISIBLE);
            Barra3.setVisibility(View.INVISIBLE);
            Lgerneral_optica.setVisibility(View.INVISIBLE);
            params = Lgerneral_optica.getLayoutParams();
            params.height=0;
            Lgerneral_optica.setLayoutParams(params);
            Lautoescola_granollers.setVisibility(View.INVISIBLE);
            params = Lautoescola_granollers.getLayoutParams();
            params.height=0;
            Lautoescola_granollers.setLayoutParams(params);
        }else
        {
            Barra1.setVisibility(View.VISIBLE);
            Barra2.setVisibility(View.VISIBLE);
            Barra3.setVisibility(View.VISIBLE);
            params = Lgerneral_optica.getLayoutParams();
            params.height= ViewGroup.LayoutParams.WRAP_CONTENT;
            Lgerneral_optica.setLayoutParams(params);
            params = Lautoescola_granollers.getLayoutParams();
            params.height= ViewGroup.LayoutParams.WRAP_CONTENT;
            Lautoescola_granollers.setLayoutParams(params);
            Lgralla.setVisibility(View.VISIBLE);
            params = Lgralla.getLayoutParams();
            params.height= ViewGroup.LayoutParams.WRAP_CONTENT;
            Lgralla.setLayoutParams(params);
            Lgerneral_optica.setVisibility(View.VISIBLE);
            Lautoescola_granollers.setVisibility(View.VISIBLE);
        }
    }
    @Override
    public void onClick(View v) {
        if (v==b1)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if (v==Lgralla)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else if(v==Lgerneral_optica)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }else if(v==Lautoescola_granollers)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
