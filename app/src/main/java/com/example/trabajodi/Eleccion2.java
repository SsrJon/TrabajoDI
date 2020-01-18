package com.example.trabajodi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Eleccion2 extends AppCompatActivity {

    private TextView tvAlta, tvBaja, tvTitular, tvPotencia;
    private Button btnAtras;
    String tipoServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleccion2);

        if(getIntent().getStringExtra("valor").equals("electricidad")){
            getSupportActionBar().setTitle((R.string.electricidad));
        }
        else if(getIntent().getStringExtra("valor").equals("gas")){
            getSupportActionBar().setTitle((R.string.gas));
        }

        tipoServicio=getIntent().getStringExtra("valor");

        tvAlta=findViewById(R.id.textViewAlta);
        tvBaja=findViewById(R.id.textViewBaja);
        tvTitular=findViewById(R.id.textViewTitular);
        tvPotencia=findViewById(R.id.textViewPotencia);
        btnAtras=findViewById(R.id.buttonAtras);

        tvAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla3 = new Intent(Eleccion2.this, Validar.class);
                String valor1  = "alta";
                pantalla3.putExtra("valor1", valor1 );
                String valor2  = tipoServicio;
                pantalla3.putExtra("valor2", valor2 );
                startActivity(pantalla3);
            }
        });

        tvBaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla3 = new Intent(Eleccion2.this, Validar.class);
                String valor1  = "baja";
                pantalla3.putExtra("valor1", valor1 );
                String valor2  = tipoServicio;
                pantalla3.putExtra("valor2", valor2 );
                startActivity(pantalla3);
            }
        });


        tvTitular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla3 = new Intent(Eleccion2.this, Validar.class);
                String valor1  = "titular";
                pantalla3.putExtra("valor1", valor1 );
                String valor2  = tipoServicio;
                pantalla3.putExtra("valor2", valor2 );
                startActivity(pantalla3);
            }
        });


        tvPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla3 = new Intent(Eleccion2.this, Validar.class);
                String valor1  = "potencia";
                pantalla3.putExtra("valor1", valor1 );
                String valor2  = tipoServicio;
                pantalla3.putExtra("valor2", valor2 );
                startActivity(pantalla3);
            }
        });


        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla1 = new Intent(Eleccion2.this, Eleccion1.class);
                startActivity(pantalla1);

            }
        });

    }
}
