package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JuegoPalabras extends AppCompatActivity implements View.OnClickListener {

    private BancoPreguntas bancoPreguntas = new BancoPreguntas();

    private TextView puntaje;
    private TextView txtNumeroPregunta;
    private ImageView pregunta;
    private Button opcion1;
    private Button opcion2;

    private String respuesta;
    private int puntajeObtenido = 0;
    private int numeroPregunta = 0;
    private int total=0;
    private String r ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_palabras);

        puntaje = findViewById(R.id.txt_puntaje_palabras);
        txtNumeroPregunta = findViewById(R.id.txt_numero_pregunta_palabra);
        pregunta = findViewById(R.id.img_palabra);
        opcion1 = findViewById(R.id.btn_palabras_derecha);
        opcion2 = findViewById(R.id.btn_palabras_izquierda);

        actualizarPregunta();

        opcion1.setOnClickListener(this);
        opcion2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_palabras_derecha:
                if(opcion1.getText() == respuesta){
                    puntajeObtenido ++;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }else{
                    actualizarPregunta();
                }
                break;

            case R.id.btn_palabras_izquierda:
                if(opcion2.getText() == respuesta){
                    puntajeObtenido ++;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }else{
                    actualizarPregunta();
                }
                break;


        }
    }

    private void actualizarPregunta() {
        total = bancoPreguntas.getTamPreguntasPalabras();

        if (numeroPregunta < total) {
            pregunta.setImageResource(bancoPreguntas.getPreguntaPalabras(numeroPregunta));
            opcion1.setText(bancoPreguntas.getDerIzq(0));
            opcion2.setText(bancoPreguntas.getDerIzq(1));

            txtNumeroPregunta.setText(numeroPregunta + "/10");
            respuesta = bancoPreguntas.getRespuestasPalabras(numeroPregunta);
            numeroPregunta++;
        } else {
            Intent intent = new Intent(getApplicationContext(),ResultadoPalabrasActivity.class);
            intent.putExtra("PuntajePalabras",getResutado());
            startActivity(intent);
            finish();
        }
    }

    public String getResutado(){
        return r = String.valueOf(puntajeObtenido);
    }

    public void actualizarPuntaje(int a){
        puntaje.setText(""+a);
    }


}
