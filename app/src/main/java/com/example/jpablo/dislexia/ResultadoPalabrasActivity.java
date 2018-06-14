package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoPalabrasActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView resultado, resultadoConsejo;
    private Button terminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_palabras);

        resultado = findViewById(R.id.txt_puntaje_palabras_resultado);
        resultadoConsejo = findViewById(R.id.txt_resultado_palabras);
        terminar = findViewById(R.id.btn_terminar_palabras);

        terminar.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        try {
            resultado.setText(bundle.getString("PuntajePalabras",""));
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
