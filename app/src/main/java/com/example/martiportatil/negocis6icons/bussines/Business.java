package com.example.martiportatil.negocis6icons.bussines;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.martiportatil.negocis6icons.R;

import static android.view.View.OnClickListener;

public class Business extends AppCompatActivity implements OnClickListener {
    private ImageView b1;
    private TextView topc1;
    private TextView topc2;
    private TextView topc3;
    private ImageView iopc1;
    private ImageView iopc2;
    private ImageView iopc3;
    private Spinner spin;
    private String textsearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        b1 = findViewById(R.id.back);
        iopc1 = findViewById(R.id.iopcio1);
        iopc2 = findViewById(R.id.iopcio2);
        iopc3 = findViewById(R.id.iopcio3);
        topc1 = findViewById(R.id.topcio1);
        topc2 = findViewById(R.id.topcio2);
        topc3 = findViewById(R.id.topcio3);
        spin = findViewById(R.id.spinnerOrder);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected (AdapterView<?> parentView, View arg1, int position, long id){
                if (id==1)
                {
                    iopc1.setImageResource(R.drawable.general_optica);
                    topc1.setText("General Optica");
                    iopc2.setImageResource(R.drawable.mutiopticas);
                    topc2.setText("Multiopticas");
                    iopc3.setImageResource(R.drawable.optica_granollers);
                    topc3.setText("Optica Universitaria de Granollers");
                }else if(id==2){
                    iopc1.setImageResource(R.drawable.la_gralla);
                    topc1.setText("La Gralla");
                    iopc2.setImageResource(R.drawable.abacus);
                    topc2.setText("Abacus");
                    iopc3.setImageResource(R.drawable.carbo);
                    topc3.setText("Carbó");
                }else if(id==3){
                    iopc1.setImageResource(R.drawable.general_optica);
                    topc1.setText("General Optica");
                    iopc2.setImageResource(R.drawable.mutiopticas);
                    topc2.setText("Multiopticas");
                    iopc3.setImageResource(R.drawable.optica_granollers);
                    topc3.setText("Optica Universitaria de Granollers");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView){
                //ypur code here
            }
        });

    }
    @Override
    public void onClick(View v) {

    }
}
