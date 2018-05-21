package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoSonidoActivity extends AppCompatActivity {

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_sonido);

        resultado = findViewById(R.id.txt_puntaje_sonido);

        Bundle bundle = getIntent().getExtras();

        try{
            resultado.setText(bundle.getString("puntajeSonido",""));
        }catch (Exception e){

        }


    }
}
