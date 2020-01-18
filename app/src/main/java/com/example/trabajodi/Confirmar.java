package com.example.trabajodi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Confirmar extends AppCompatActivity {

    private int atras=0;
    private Button btnOtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        btnOtra=findViewById(R.id.buttonOtra);


        btnOtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla1 = new Intent(Confirmar.this, Eleccion1.class);
                startActivity(pantalla1);
            }
        });
    }




    public void onBackPressed(){
        atras = (atras + 1);
        Intent pantalla1 = new Intent(Confirmar.this, Eleccion1.class);
        startActivity(pantalla1);

        if (atras>1) {
            this.finish();
        }
    }
}
