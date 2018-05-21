package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoSilabasActivity extends AppCompatActivity {

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_silabas);

        resultado = findViewById(R.id.txt_puntaje_silabas);

        Bundle bundle = getIntent().getExtras();

        try {
        resultado.setText(bundle.getString("puntajeObtenido",""));
        }catch (Exception e){
        }
    }
}
