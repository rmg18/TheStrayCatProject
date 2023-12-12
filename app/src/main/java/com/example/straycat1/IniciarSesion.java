package com.example.straycat1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void CrearCuenta(View view) {
        Intent intentCrearCuenta = new Intent(this, crear_cuenta.class);

        startActivity(intentCrearCuenta);

    }
}