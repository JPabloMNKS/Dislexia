package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoSonidoActivity extends AppCompatActivity {

    TextView resultado,resultadoSonidoConsejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_sonido);

        resultado = findViewById(R.id.txt_puntaje_sonido);
        resultadoSonidoConsejo = findViewById(R.id.txt_resultado_sonidos);


        Bundle bundle = getIntent().getExtras();

        try{
            resultado.setText(bundle.getString("puntajeSonido",""));
        }catch (Exception e){
        }

        int n = 0;
        n = Integer.parseInt(resultado.getText().toString());

        if(n==0){
            resultadoSonidoConsejo.setText("Debes Practicar mas");
        }

        if(n>0 && n<4){
            resultadoSonidoConsejo.setText("Vueleve a intentarlo pronto");
        }
        if(n>=4 && n<=7){
            resultadoSonidoConsejo.setText("Genial tus destrezas visuales son increibles");
        }
        if(n>7){
            resultadoSonidoConsejo.setText("Excelente eres de otro mundo vamos por más!");
        }



    }
}
