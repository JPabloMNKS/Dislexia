package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoSilabasActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultado,resultadoConsejo;
    Button terminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_silabas);

        resultado = findViewById(R.id.txt_puntaje_silabas);
        resultadoConsejo = findViewById(R.id.txt_resultado_silabas);
        terminar = findViewById(R.id.btn_terminar_silabas);

        terminar.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        try {
            resultado.setText(bundle.getString("puntajeObtenido",""));
        }catch (Exception e){
        }

        int n;
        n = Integer.parseInt(resultado.getText().toString());

        if(n==0){
            resultadoConsejo.setText(R.string.resultado_silabas_uno);
        }

        if(n>0 && n<4){
            resultadoConsejo.setText(R.string.resultado_silabas_dos);
        }
        if(n>=4 && n<=7){
            resultadoConsejo.setText(R.string.resultado_silabas_tres);
        }
        if(n>7){
            resultadoConsejo.setText(R.string.resultado_silabas_cuatro);
        }
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
