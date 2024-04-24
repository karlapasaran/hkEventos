package com.example.hkeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class ticket extends AppCompatActivity {
    private TextView FechaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        //Declaración de Fecha y Hora
        FechaHora = findViewById(R.id.tvFechaHora);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
        String fechaHoraActual = dateFormat.format(new Date());
        FechaHora.setText(fechaHoraActual);
        //


    }



}