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
            public void onClick(View v) { //metodo: so vai acontecer quando o botao eh clicado
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //obtem o elemento de campo de texto
                String textoDigitado = etDigiteAqui.getText().toString(); //pega o texto dentro do campo de texto, converte para string
                Intent i = new Intent(MainActivity.this,NextActivity.class); //sinalizar uma nova intenção para o sistema operacional, queremos navegar para a proxima tela
                i.putExtra("texto", textoDigitado); //pegamos o textodigitado e colocamos dentro do intent
                startActivity(i); //inicia uma nova activity, nesse caso o intent, navega para o nova activity
            }
        });
    }
}