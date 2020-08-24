package com.example.conversorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    public CardView Moneda,Masa, Volumen, Longitud, Almacenamiento, Tiempo, Datos, Salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Moneda = (CardView) findViewById(R.id.moneda);
        Moneda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Masa = (CardView) findViewById(R.id.masa);
        Masa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,MasaActivity.class);
                startActivity(intent);
            }
        });

        Volumen = (CardView) findViewById(R.id.volumen);
        Volumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,VolumenActivity.class);
                startActivity(intent);
            }
        });

        Longitud = (CardView) findViewById(R.id.longitud);
        Longitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,LongitudActivity.class);
                startActivity(intent);
            }
        });

        Almacenamiento = (CardView) findViewById(R.id.almacenamiento);
        Almacenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,AlmacenamientoActivity.class);
                startActivity(intent);
            }
        });

        Tiempo = (CardView) findViewById(R.id.tiempo);
        Tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,TiempoActivity.class);
                startActivity(intent);
            }
        });

        Datos = (CardView) findViewById(R.id.datos);
        Datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this,TransmisionActivity.class);
                startActivity(intent);
            }
        });

        Salir = (CardView) findViewById(R.id.salir);
        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            finish();
            }
        });

    }
}