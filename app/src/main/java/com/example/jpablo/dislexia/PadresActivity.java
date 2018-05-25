package com.example.jpablo.dislexia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PadresActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_rapido,btn_men,btn_duda,btn_frecuentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padres);

        btn_rapido = findViewById(R.id.btn_rapido);
        btn_rapido.setOnClickListener(this);

        btn_men = findViewById(R.id.btn_mensajes);
        btn_men.setOnClickListener(this);

        btn_duda = findViewById(R.id.btn_dudas);
        btn_duda.setOnClickListener(this);

        btn_frecuentes = findViewById(R.id.btn_frecuentes);
        btn_frecuentes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_rapido:
                Intent intent = new Intent(getApplicationContext(),CuestionarioRapidoActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_mensajes:
                Intent intent1 = new Intent(getApplicationContext(),MensajeRecyclerActivity.class);
                startActivity(intent1);
                break;

            case R.id.btn_dudas:
                Intent intDudas = new Intent(Intent.ACTION_VIEW);
                intDudas.setData(Uri.parse("https://www.educaciontrespuntocero.com/recursos/recursos-dislexia-alumnos/15797.html"));
                startActivity(intDudas);

            case R.id.btn_frecuentes:
                Intent intent2 = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent2);
        }
    }
}
