package com.example.hkeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class servicios extends AppCompatActivity {

    CheckBox cBComida, cBBebida, cBMesas, cBBatucada, cBEntretenimiento, cBVideo, cBFotografia, cBSegurdad, cBMeseros, cBLimpieza, cBInvitaciones, cBRecuerdos, cBDulceros;
    ArrayList<Integer> costosServicios = new ArrayList<>();
    ArrayList<String> comida = new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
        // Inicializar CheckBox
        cBComida = findViewById(R.id.cBComida);
        cBBebida = findViewById(R.id.cBBebida);
        cBMesas = findViewById(R.id.cBMesas);
        cBBatucada = findViewById(R.id.cBBatucada);
        cBEntretenimiento = findViewById(R.id.cBEntretenimiento);
        cBVideo = findViewById(R.id.cBVideo);
        cBFotografia = findViewById(R.id.cBFotografia);
        cBSegurdad = findViewById(R.id.cBSegurdad);
        cBMeseros = findViewById(R.id.cBMeseros);
        cBLimpieza = findViewById(R.id.cBLimpieza);
        cBInvitaciones = findViewById(R.id.cBInvitaciones);
        cBRecuerdos = findViewById(R.id.cBRecuerdos);
        cBDulceros = findViewById(R.id.cBDulceros);

        // Manejar eventos de clic en los CheckBox
        cBComida.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (cBComida.isChecked()) {
                    // Agregar costo del servicio de comida al array
                    costosServicios.add(100); // Puedes cambiar el costo según tu necesidad
                    comida.add("COMIDA");
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de comida del array
                    costosServicios.remove(Integer.valueOf(100));
                }
            }

        });
        //
        cBBebida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBBebida.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }


        });
        //
        cBMesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBMesas.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        //
        cBBatucada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBBatucada.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        //
        cBEntretenimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBEntretenimiento.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        cBVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBVideo.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        cBFotografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBFotografia.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        cBSegurdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBSegurdad.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        cBMeseros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBMeseros.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });
        cBLimpieza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBLimpieza.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });

        cBInvitaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBInvitaciones.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });

        cBRecuerdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBRecuerdos.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });

        cBDulceros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cBDulceros.isChecked()) {
                    // Agregar costo del servicio de bebida al array
                    costosServicios.add(150); // Puedes cambiar el costo según tu necesidad
                } else {
                    // Si se desmarca el CheckBox, remover el costo del servicio de bebida del array
                    costosServicios.remove(Integer.valueOf(150));
                }
            }
        });

        findViewById(R.id.btnPresu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /// Calcular el costo total de los servicios seleccionados
                int costoTotal = 0;
                for (int costo : costosServicios) {
                    costoTotal += costo;
                }
                // Mostrar el costo total en un mensaje Toast
                //Toast.makeText(servicios.this, "Costo total: $" + costoTotal, Toast.LENGTH_SHORT).show();

                // Crear un Bundle para enviar los costos al siguiente Activity
                Bundle enviaPrecio = new Bundle();
                enviaPrecio.putIntegerArrayList("costos", costosServicios);

                // Crear un Intent para abrir el siguiente Activity (presupuesto)
                Intent intent = new Intent(servicios.this, presupuesto.class);
                // Adjuntar el Bundle al Intent
                intent.putExtras(enviaPrecio);
                // Iniciar el siguiente Activity
                startActivity(intent);

            }
        });
    }

}