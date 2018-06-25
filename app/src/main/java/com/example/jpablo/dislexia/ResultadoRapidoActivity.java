package com.example.jpablo.dislexia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoRapidoActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtResultado;
    TextView txtConsejo;
    Button terminarRapido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rapido);

        txtResultado = findViewById(R.id.txt_resultado);
        txtConsejo = findViewById(R.id.txt_consejo_resultado);
        terminarRapido = findViewById(R.id.btn_terminar_rapido);

        terminarRapido.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        try {
            txtResultado.setText(bundle.getString("resultadoRapido",""));
        }catch (Exception e){
        }

        int n;
        n = Integer.parseInt(txtResultado.getText().toString());

        if(n>=0 && n<4){
            txtConsejo.setText(R.string.menor_3);
        }
        if(n>=4 && n<=7){
            txtConsejo.setText(R.string.menor_7);
        }
        if(n>7){
            txtConsejo.setText(R.string.mayor_7);
        }
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
