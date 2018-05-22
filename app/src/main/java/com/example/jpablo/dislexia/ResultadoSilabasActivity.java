package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoSilabasActivity extends AppCompatActivity {

    TextView resultado,resultadoConsejo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_silabas);

        resultado = findViewById(R.id.txt_puntaje_silabas);
        resultadoConsejo = findViewById(R.id.txt_resultado_silabas);

        Bundle bundle = getIntent().getExtras();

        try {
        resultado.setText(bundle.getString("puntajeObtenido",""));
        }catch (Exception e){
        }


        int n = 0;
        n = Integer.parseInt(resultado.getText().toString());

        if(n==0){
            resultadoConsejo.setText("Debes Practicar mas");
        }

        if(n>0 && n<4){
            resultadoConsejo.setText("Vueleve a intentarlo pronto");
        }
        if(n>=4 && n<=7){
            resultadoConsejo.setText("Genial tus destrezas visuales son increibles");
        }
        if(n>7){
            resultadoConsejo.setText("Excelente eres de otro mundo vamos por más!");
        }


    }
}
