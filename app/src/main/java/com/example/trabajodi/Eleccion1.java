package com.example.trabajodi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Eleccion1 extends AppCompatActivity {

    private TextView tvElectricidad, tvGas;
    private int atras=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion1);

        tvElectricidad=findViewById(R.id.textViewElectricidad);
        tvGas=findViewById(R.id.textViewGas);



        tvElectricidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla2 = new Intent(Eleccion1.this, Eleccion2.class);
                String valor  = "electricidad";
                pantalla2.putExtra("valor", valor );
                startActivity(pantalla2);

            }
        });

        tvGas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla2 = new Intent(Eleccion1.this, Eleccion2.class);
                String valor  = "gas";
                pantalla2.putExtra("valor", valor );
                startActivity(pantalla2);

            }
        });



    }

    public void onBackPressed(){

        atras = (atras + 1);


        if (atras>1) {
            this.finish();
        }

    }


}
