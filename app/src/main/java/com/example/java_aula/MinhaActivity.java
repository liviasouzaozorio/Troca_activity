package com.example.java_aula;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MinhaActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_minha);

        TextView tvNome, tvIdade, tvCidade;
        tvNome = findViewById(R.id.nome);
        tvIdade = findViewById(R.id.idade);
        tvCidade = findViewById(R.id.cidade);

        LinearLayout layout = findViewById(R.id.main);

        Intent it = getIntent();

        String nome;
        int idade;
        String cidade;

        nome = it.getStringExtra("nome");
        idade = it.getIntExtra("idade", 0);
        cidade = it.getStringExtra("cidade");

        tvNome.setText(nome);
        tvIdade.setText(idade + "");
        tvCidade.setText(cidade);

        if (idade < 18){
            layout.setBackgroundColor(Color.RED);
        } else {
            layout.setBackgroundColor(Color.GREEN);
        }
        if (idade > 40){
            layout.setBackgroundColor(Color.YELLOW);
        }

    }
}
