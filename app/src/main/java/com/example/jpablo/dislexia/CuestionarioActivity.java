package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CuestionarioActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView numPregunta;
    private TextView pregunta;
    private Button btnSi;
    private Button btnNo;

    private BancoPreguntas bancoPreguntas = new BancoPreguntas();

    private int puntajeObtenido = 0;
    private int numeroPregunta = 0;
    private int total=0;
    private String r ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);

        pregunta = findViewById(R.id.txt_pregunta);
        numPregunta = findViewById(R.id.txt_num_pregunta);
        btnSi = findViewById(R.id.btn_si);
        btnNo = findViewById(R.id.btn_no);

        actualizarPregunta();

        btnSi.setOnClickListener(this);
        btnNo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_si:
                    puntajeObtenido ++;
                    actualizarPregunta();
                break;

            case R.id.btn_no:
                actualizarPregunta();
                break;
        }

    }


    private void actualizarPregunta(){
        total = bancoPreguntas.getTamPreguntasCuetionario();

        if(numeroPregunta<total){
            pregunta.setText(bancoPreguntas.getPreguntasCuestionario(numeroPregunta));
            numeroPregunta ++;
            numPregunta.setText(numeroPregunta + " /10");

        }else{
            Intent intent = new Intent(getApplicationContext(),ResultadoRapidoActivity.class);
            intent.putExtra("resultadoRapido",getR());
            startActivity(intent);
            finish();
        }
    }

    public String getR(){
        return r = String.valueOf(puntajeObtenido);
    }





}
