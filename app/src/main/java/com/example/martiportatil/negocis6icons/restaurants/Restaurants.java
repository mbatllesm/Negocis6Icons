package com.example.martiportatil.negocis6icons.restaurants;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.martiportatil.negocis6icons.R;

public class Restaurants extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    public Intent restaurants1;
    public Intent restaurants2;
    public Intent restaurants3;
    public Spinner spin;
    public VegetariaFragment fragment1;
    public ItaliaFragment fragment2;
    public MediterraniaFragment fragment3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        spin = findViewById(R.id.spinnerOrder);
        spin.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        fragment1 = new VegetariaFragment();
        fragment2 = new ItaliaFragment();
        fragment3 = new MediterraniaFragment();


        if (position==0)
        {
            FragmentManager fm = getFragmentManager();
            if (fm.findFragmentById(R.id.recipient) == null)
            {
                fm.beginTransaction().add(R.id.recipient, fragment1).commit();
                fm.beginTransaction().add(R.id.recipient, fragment2).commit();
                fm.beginTransaction().add(R.id.recipient, fragment3).commit();
            }
            else
            {
                fm.beginTransaction().replace(R.id.recipient, fragment1).commit();
                fm.beginTransaction().add(R.id.recipient, fragment2).commit();
                fm.beginTransaction().add(R.id.recipient, fragment3).commit();
            }
        }
        else if (position==1)
        {
            FragmentManager fm = getFragmentManager();
            fm.beginTransaction().replace(R.id.recipient, fragment1).commit();
        }
        else if (position==2)
        {
            FragmentManager fm = getFragmentManager();
            fm.beginTransaction().replace(R.id.recipient, fragment2).commit();
        }
        else if (position==3)
        {
            FragmentManager fm = getFragmentManager();
            fm.beginTransaction().replace(R.id.recipient, fragment3).commit();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
