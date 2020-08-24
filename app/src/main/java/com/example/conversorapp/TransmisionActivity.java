package com.example.conversorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TransmisionActivity extends AppCompatActivity {
    public Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transmision);
        btnCalcular = (Button)findViewById(R.id.btnConvertir);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                procesar(view);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void procesar(View view) {
        try {
            RadioGroup optOperaciones = (RadioGroup) findViewById(R.id.optTransmision);

            TextView tempVal = (TextView) findViewById(R.id.txtnum1);
            double num1 = Double.parseDouble(tempVal.getText().toString());

            double respuesta = 0;
            //Este es para el radiogroup y los radiobuttons
            switch (optOperaciones.getCheckedRadioButtonId()) {
                case R.id.optBitS:
                    respuesta = num1 * 8000000;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("La Conversion son " + respuesta + " Bits por segundo" );
                    break;
                case R.id.optKilobitS:
                    respuesta = num1 * 8000;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("La Conversion son " + respuesta + " Kilobits por segundo" );
                    break;
                case R.id.optKilobyteS:
                    respuesta = num1 * 1000;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("La Conversion son " + respuesta + " Kilobytes por segundo" );
                    break;
                case R.id.optGigabyteS:
                    respuesta = num1 / 1000;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("La Conversion son " + respuesta + "  Gigabytes por segundo" );

                    break;
                case R.id.optTerabyteS:
                    respuesta = num1 / 1000000;
                    tempVal = (TextView) findViewById(R.id.lblRespuesta);
                    tempVal.setText("La Conversion son " + respuesta + " Terabytes por segundo" );
                    break;
            }

            Toast.makeText(getApplicationContext(),"Conversion realizada ",Toast.LENGTH_LONG).show();
        }catch (Exception err){
            TextView temp = (TextView) findViewById(R.id.lblRespuesta);
            temp.setText("Por favor ingrese la cantidad en MB/S");

            Toast.makeText(getApplicationContext(),"Por favor ingrese la cantidad",Toast.LENGTH_LONG).show();
        }
    }
}