package arnhold.sampaio.luiza.maria.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { //a classe MainActivity eh a principal da aplicacao

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate eh chamado toda vez que a tela eh criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroi os elementos de interface definidos no arq xml

        Button btnEnviar = findViewById(R.id.btnEnviar); //obtem o botao atraves de seu id
        btnEnviar.setOnClickListener(new View.OnClickListener() { //define o que acontece quando o botao eh clicado
            @Override
            public void onClick(View v) { //so vai acontecer quando o botao eh clicado
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);
            }
        });
    }
}