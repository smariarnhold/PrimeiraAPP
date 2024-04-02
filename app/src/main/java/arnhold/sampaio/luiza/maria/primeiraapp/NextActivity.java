package arnhold.sampaio.luiza.maria.primeiraapp;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity { //a classe NextActivity eh a principal da aplicacao

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate eh chamado toda vez que a tela eh criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next); //constroi os elementos de interface definidos no arq xml
        Intent i = getIntent(); //chamou o intent já criado na outra tela (mainactivity)
        String textoDigitado = i.getStringExtra("texto"); //pega o texotdigitado que passamos no outro (mainactivity)
        TextView tvTexto = findViewById(R.id.tvTexto); //obtem o textview dessa tela
        tvTexto.setText(textoDigitado); //colocou o textodigitado dentro do textview dessa tela
    }
}