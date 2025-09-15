package com.example.java_aula;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MinhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minha);
        TextView tvNome, tvIdade;
        tvNome = findViewById(R.id.nome);
        tvIdade = findViewById(R.id.idade);

        Intent it = getIntent();
        String nome;
        int idade;

        nome= it.getStringExtra("nome");
        idade = it.getIntExtra("Idade", 0);
        tvNome.setText(nome);
        tvIdade.setText(idade+"");

        };
    }