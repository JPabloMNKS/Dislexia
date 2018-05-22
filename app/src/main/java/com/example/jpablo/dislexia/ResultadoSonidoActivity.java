package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoSonidoActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultado,resultadoSonidoConsejo;
    Button terminarSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_sonido);

        resultado = findViewById(R.id.txt_puntaje_sonido);
        resultadoSonidoConsejo = findViewById(R.id.txt_resultado_sonidos);
        terminarSonido = findViewById(R.id.btn_terminar_sonidos);
        terminarSonido.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        try{
            resultado.setText(bundle.getString("puntajeSonido",""));
        }catch (Exception e){
        }

        int n;
        n = Integer.parseInt(resultado.getText().toString());

        if(n==0){
            resultadoSonidoConsejo.setText(R.string.resultado_silabas_uno);
        }

        if(n>0 && n<4){
            resultadoSonidoConsejo.setText(R.string.resultado_silabas_dos);
        }
        if(n>=4 && n<=7){
            resultadoSonidoConsejo.setText(R.string.resultado_silabas_tres);
        }
        if(n>7){
            resultadoSonidoConsejo.setText(R.string.resultado_silabas_cuatro);
        }
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
