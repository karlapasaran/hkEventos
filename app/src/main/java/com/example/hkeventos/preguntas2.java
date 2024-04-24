package com.example.hkeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class preguntas2 extends AppCompatActivity {

    CheckBox ninos;
    View invitadosNinos;
    CheckBox adultos;
    View invitadosAdultos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas2);
        ninos=(CheckBox) findViewById(R.id.cBNinos);
        invitadosNinos=findViewById(R.id.eTInvitadosNinos);
        adultos=(CheckBox) findViewById(R.id.cBAdultos);
        invitadosAdultos=findViewById(R.id.eTInvitadosAdultos);

        ninos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (ninos.isChecked()){
                    invitadosNinos.setVisibility(View.VISIBLE);
                }
                else{
                    invitadosNinos.setVisibility(View.INVISIBLE);
                }
            }
        });

        adultos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (adultos.isChecked()){
                    invitadosAdultos.setVisibility(View.VISIBLE);
                }
                else{
                    invitadosAdultos.setVisibility(View.INVISIBLE);
                }
            }
        });





    }
}