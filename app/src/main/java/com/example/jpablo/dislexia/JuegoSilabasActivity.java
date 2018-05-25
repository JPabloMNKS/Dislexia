package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class JuegoSilabasActivity extends AppCompatActivity implements View.OnClickListener {

    private BancoPreguntas bancoPreguntas = new BancoPreguntas();

    private TextView puntaje;
    private ImageView pregunta;
    private Button opcion1;
    private Button opcion2;
    private Button opcion3;


    private String respuesta;
    private int puntajeObtenido = 0;
    private int numeroPregunta = 0;
    private int total=0;
    private int aux =0;
    private String r ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_silabas);

        puntaje = findViewById(R.id.txt_puntaje);
        pregunta = findViewById(R.id.img_pregunta);
        opcion1 = findViewById(R.id.btn_opcion1);
        opcion2 = findViewById(R.id.btn_opcion2);
        opcion3 = findViewById(R.id.btn_opcion3);

        actualizarPregunta();

        opcion1.setOnClickListener(this);
        opcion2.setOnClickListener(this);
        opcion3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_opcion1:
                if(opcion1.getText() == respuesta){
                    puntajeObtenido += 1;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }
                else{
                    actualizarPregunta();
                }
            break;

            case R.id.btn_opcion2:
                if(opcion2.getText() == respuesta){
                    puntajeObtenido += 1;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }
                else{
                    actualizarPregunta();
                }

                break;

            case R.id.btn_opcion3:
                if(opcion3.getText() == respuesta){
                    puntajeObtenido += 1;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }
                else{
                    actualizarPregunta();
                }

                break;

        }
    }

    private void actualizarPregunta(){
        total = bancoPreguntas.getTamPreguntas();

        if(numeroPregunta<total){
            pregunta.setImageResource(bancoPreguntas.getPrgunta(numeroPregunta));
            opcion1.setText(bancoPreguntas.getOpcion1(numeroPregunta));
            opcion2.setText(bancoPreguntas.getOpcion2(numeroPregunta));
            opcion3.setText(bancoPreguntas.getOpcion3(numeroPregunta));

            respuesta = bancoPreguntas.getRespuesta(numeroPregunta);
            numeroPregunta ++;
        }else{
            Intent intent = new Intent(getApplicationContext(),ResultadoSilabasActivity.class);
            intent.putExtra("puntajeObtenido",getResultado());
            startActivity(intent);
            finish();
        }
    }

    public String getResultado() {
        return r = String.valueOf(puntajeObtenido);
    }



    public void actualizarPuntaje(int a){
        puntaje.setText(""+a);
    }

}
