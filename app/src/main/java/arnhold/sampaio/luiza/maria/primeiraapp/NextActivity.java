package arnhold.sampaio.luiza.maria.primeiraapp;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); //chamou o intent já criado na outra tela
        String textoDigitado = i.getStringExtra("texto"); //
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(textoDigitado); //colocou o  texto dentro do textview
    }
}