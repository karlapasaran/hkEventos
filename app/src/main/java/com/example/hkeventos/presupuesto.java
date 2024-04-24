package com.example.hkeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class presupuesto extends AppCompatActivity {

    TextView precioFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presupuesto);

        precioFinal=findViewById(R.id.tvTotalPrecio);
        // Verificar si el Bundle no es nulo
        if (getIntent().getExtras() != null) {
            // Obtener el Bundle
            Bundle recibePrecio = getIntent().getExtras();
            // Verificar si la clave "costos" está presente en el Bundle
            if (recibePrecio.containsKey("costos")) {
                // Obtener la lista de precios del Bundle
                ArrayList<Integer> listaPrecio = recibePrecio.getIntegerArrayList("costos");
                // Calcular el precio total sumando todos los precios en la lista
                int precioTotal = 0;
                for (int precio : listaPrecio) {
                    precioTotal += precio;
                }
                // Establecer el precio total en el TextView
                precioFinal.setText(String.valueOf("$"+precioTotal));
            }
        }


    }



}