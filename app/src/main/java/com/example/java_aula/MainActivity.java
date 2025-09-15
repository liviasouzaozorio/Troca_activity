package com.example.java_aula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        };

    public void enviar(View view) {
        String nome = "SENAI";
        int idade = 50;

        Intent it = new Intent(this, MinhaActivity.class);
        it.putExtra("nome", nome);
        it.putExtra("idade", idade);
        startActivity(it);
    }
}