package com.example.straycat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Filtro extends AppCompatActivity {

    ImageView logotipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro);

        logotipo = (ImageView) findViewById(R.id.avatar);

        Glide.with(this)

                .load("https://i.imgur.com/2qn7dyl.jpg")

                .into(logotipo);

    }
}