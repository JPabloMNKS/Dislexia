package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoRapidoActivity extends AppCompatActivity {

    TextView txtResultado;
    TextView txtConsejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rapido);

        txtResultado = findViewById(R.id.txt_resultado);
        txtConsejo = findViewById(R.id.txt_consejo_resultado);

        Bundle bundle = getIntent().getExtras();

        try {
            txtResultado.setText(bundle.getString("resultado",""));

        }catch (Exception e){
        }

        int n = 0;
        n = Integer.parseInt(txtResultado.getText().toString());

        if(n==0){
            txtConsejo.setText(R.string.llene);
        }

        if(n>0 && n<4){
            txtConsejo.setText(R.string.menor_3);
        }
        if(n>=4 && n<=7){
            txtConsejo.setText(R.string.menor_7);
        }
        if(n>7){
            txtConsejo.setText(R.string.mayor_7);
        }

    }

}
