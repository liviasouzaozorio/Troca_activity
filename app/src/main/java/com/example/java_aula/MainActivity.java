package com.example.java_aula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Método chamado quando o botão "Enviar" é clicado
    public void enviar(View view) {

       EditText eNome, eIdade, eCidade;

       eNome = findViewById(R.id.nome);
       String nome = eNome.getText().toString();

       eIdade = findViewById(R.id.idade);
       int idade = Integer.parseInt(eIdade.getText().toString());

       eCidade = findViewById(R.id.cidade);
       String cidade = eCidade.getText().toString();

        // Cria o Intent para enviar os dados para a MinhaActivity
        Intent intent = new Intent(this, MinhaActivity.class);

        intent.putExtra("nome", nome);
        intent.putExtra("idade", idade);
        intent.putExtra("cidade", cidade);
        startActivity(intent);
    }
}
