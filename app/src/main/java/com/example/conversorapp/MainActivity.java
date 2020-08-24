package com.example.conversorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = (Button)findViewById(R.id.btnConvertir);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                procesar(view);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void procesar(View vista){
        try {
            RadioGroup optOperaciones = (RadioGroup) findViewById(R.id.optMonedas);

            TextView tempVal = (TextView) findViewById(R.id.txtnum1);
            double num1 = Double.parseDouble(tempVal.getText().toString());

            double respuesta = 0;
            //Este es para el radiogroup y los radiobuttons
            switch (optOperaciones.getCheckedRadioButtonId()) {
                case R.id.optEuro:
                    respuesta = num1 * 0.84;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Euros" );
                    break;
                case R.id.optPeso:
                    respuesta = num1 * 22.09;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Pesos" );
                    break;
                case R.id.optColon:
                    respuesta = num1 * 595.50;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Colones" );
                    break;
                case R.id.optQuetzal:
                    respuesta = num1 * 7.71;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Quetzales" );

                    break;
                case R.id.optLempira:
                    respuesta = num1 * 24.67;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Lempiras" );
                    break;
                case R.id.optCordoba:
                    respuesta = num1 * 34.88;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Cordobas" );
                    break;
                case R.id.optbalboa:
                    respuesta = num1 * 1.00;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Balboas" );
                    break;
                case R.id.optYanes:
                    respuesta = num1 * 6.90;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("Respuesta: La Conversion son " + respuesta + " Yuanes" );
                    break;
            }

            Toast.makeText(getApplicationContext(),"Conversion realizada ",Toast.LENGTH_LONG).show();
        }catch (Exception err){
            TextView temp = (TextView) findViewById(R.id.lblRespuesta);
            temp.setText("Por favor ingrese la cantidad de Moneda");

            Toast.makeText(getApplicationContext(),"Por favor ingrese la cantidad",Toast.LENGTH_LONG).show();
        }
    }
}