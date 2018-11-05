package com.example.martiportatil.negocis6icons;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.martiportatil.negocis6icons.bussines.Business;

public class empreses extends AppCompatActivity implements View.OnClickListener{
    private ImageView b1;
    private String nom;
    private TextView descripcio;
    private TextView adresa;
    private TextView telefon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String empresa1 = getIntent().getExtras().getString("empresa");
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        ImageView image;
        ImageView icono;
        setContentView(R.layout.activity_empreses);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        nom=empresa1;
        image = findViewById(R.id.img);
        icono = findViewById(R.id.icono_invalid);
        descripcio = findViewById(R.id.descrip);
        adresa = findViewById(R.id.address);
        telefon = findViewById(R.id.telef);
        if (empresa1.equalsIgnoreCase("La Gralla"))
        {
            image.setImageResource(R.drawable.la_gralla);
            icono.setImageResource(R.drawable.cadira_rodes);
            descripcio.setText("-Compra libres en català i estallà online - Llibreria online del Vallés Oriental");
            adresa.setText("-Plaça dels Cabrits, 5, 08401, Granollers");
            telefon.setText("938794970");
            //setContentView(image);
        }else if(empresa1.equalsIgnoreCase("General Optica"))
        {
            image.setImageResource(R.drawable.general_optica);
            descripcio.setText("-Con nosotros tendrás a un gran equipo de profesionales de la salud visual");
            adresa.setText("-Plaça de la Porxada, 10, 08401, Granollers");
            telefon.setText("972331132");
            //setContentView(image);
        }else if(empresa1.equalsIgnoreCase("Autoescola Granollers"))
        {
            image.setImageResource(R.drawable.autoescola_granollers);
            descripcio.setText("-Autoescuela Granollers es un centro de formación de conductores. En Autoescuela Granollers esneñamos a nuestros alumnos a conducir");
            adresa.setText("-Carrer de Joan Prim, 217, 08401, Granollers");
            telefon.setText("938499257");
            //setContentView(image);
        }
    }

    @Override
    public void onClick(View v) {
            Intent intent = new Intent(this,Business.class);
            startActivity(intent);
    }
    public void onClickLlamada(View v){
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_CALENDAR)!= PackageManager.PERMISSION_GRANTED)
        {
        }else{
            Intent i = new Intent(Intent.ACTION_CALL);
            if (nom.equalsIgnoreCase("La Gralla")) {
                i.setData(Uri.parse("tel.938794970"));
                startActivity(i);
            }else if (nom.equalsIgnoreCase("General Optica")){
                i.setData(Uri.parse("tel.972331132"));
                startActivity(i);
            }else if (nom.equalsIgnoreCase("Autoescola Granollers")){
                i.setData(Uri.parse("tel.938499257"));
                startActivity(i);
            }
        }
    }
}
