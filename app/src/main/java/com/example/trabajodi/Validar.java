package com.example.trabajodi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Validar extends AppCompatActivity {

    private TextView tvValor1, tvValor2, tvValor3, tvServicio;
    private Button btnAtras, btnConfirmar;
    private EditText etValor1, etValor2, etValor3;
    String tipoServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar);

        tvServicio=findViewById(R.id.textViewServicio);

        tvValor1=findViewById(R.id.textViewValor1);
        tvValor2=findViewById(R.id.textViewValor2);
        tvValor3=findViewById(R.id.textViewValor3);

        btnAtras=findViewById(R.id.buttonAtras);
        btnConfirmar=findViewById(R.id.buttonConfirmar);

        etValor1=findViewById(R.id.editTextValor1);
        etValor2=findViewById(R.id.editTextValor2);
        etValor3=findViewById(R.id.editTextValor3);


        tipoServicio=getIntent().getStringExtra("valor2");

        if(getIntent().getStringExtra("valor2").equals("electricidad")){
            getSupportActionBar().setTitle((R.string.electricidad));
        }
        else if(getIntent().getStringExtra("valor2").equals("gas")){
            getSupportActionBar().setTitle((R.string.gas));
        }



        if(getIntent().getStringExtra("valor1").equals("alta")){
            tvServicio.setText(R.string.dar_de_alta);
            tvValor1.setText(R.string.direccion);
            tvValor2.setText(R.string.dni);
            tvValor3.setText(R.string.nombre);

        } else if(getIntent().getStringExtra("valor1").equals("baja")){
            tvServicio.setText(R.string.dar_de_baja);
            tvValor1.setText(R.string.direccion);
            tvValor2.setText(R.string.dni);
            tvValor3.setText(R.string.nombre);


        } else if(getIntent().getStringExtra("valor1").equals("titular")){
            tvServicio.setText(R.string.cambiar_titular);
            tvValor1.setText(R.string.nombre);
            tvValor2.setText(R.string.apellido);
            tvValor3.setText(R.string.dni);


        } else if(getIntent().getStringExtra("valor1").equals("potencia")){
            tvServicio.setText(R.string.cambiar_potencia);
            tvValor1.setText(R.string.direccion);
            tvValor2.setText(R.string.dni);
            tvValor3.setText(R.string.potencia);


        }






        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etValor1.getText().toString().equals("") ||etValor2.getText().toString().equals("")|| etValor3.getText().toString().equals("")){
                    Toast.makeText(Validar.this, R.string.vacio, Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent pantalla4 = new Intent(Validar.this, Confirmar.class);
                    startActivity(pantalla4);
                }
            }
        });



        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pantalla1 = new Intent(Validar.this, Eleccion2.class);
                String valor  = tipoServicio;
                pantalla1.putExtra("valor", valor );
                startActivity(pantalla1);

            }
        });


    }

    public void onBackPressed(){

        Intent pantalla1 = new Intent(Validar.this, Eleccion2.class);
        String valor  = tipoServicio;
        pantalla1.putExtra("valor", valor );
        startActivity(pantalla1);


    }
}
