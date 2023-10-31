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

                .load("https://files.cults3d.com/uploaders/27695646/illustration-file/08001d33-2ba9-4b79-b635-f80138a1189b/ZBrush-Document_1.jpg")

                .into(logotipo);

    }
}