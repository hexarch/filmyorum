package com.example.filmyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private YorumDatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new YorumDatabaseHelper(this);
        Button aksiyon = findViewById(R.id.aksiyon);
        aksiyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, aksiyon.class);
                startActivity(intent);
            }
        });
        Button bilim = findViewById(R.id.bilim);
        bilim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, bilimkurgu.class);
                startActivity(intent);
            }
        });
        Button animasyon = findViewById(R.id.animasyon);
        animasyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, animasyon.class);
                startActivity(intent);
            }
        });
        ImageView benefsaneyim = findViewById(R.id.benefsaneyim);
        benefsaneyim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, benefsaneyim.class);
                startActivity(intent);
            }
        });
        ImageView hizliveofkeli = findViewById(R.id.hizliveofkeli);
        hizliveofkeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, hizli.class);
                startActivity(intent);
            }
        });
        ImageView hulk = findViewById(R.id.hulk);
        hulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, hulk.class);
                startActivity(intent);
            }
        });
        ImageView matrix = findViewById(R.id.matrix);
        matrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, matrix.class);
                startActivity(intent);
            }
        });
        ImageView ejder = findViewById(R.id.ejder);
        ejder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, ejder.class);
                startActivity(intent);
            }
        });
        ImageView transformers = findViewById(R.id.transformers);
        transformers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklama işlemlerini buraya ekleyin
                Intent intent = new Intent(MainActivity.this, transformers.class);
                startActivity(intent);
            }
        });
        Button buttonSil = findViewById(R.id.sil);
        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.deleteAllYorumlar();
                Toast.makeText(MainActivity.this, "Yorumlar silindi!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}