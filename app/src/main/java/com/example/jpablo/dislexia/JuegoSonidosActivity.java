package com.example.jpablo.dislexia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JuegoSonidosActivity extends AppCompatActivity implements View.OnClickListener {

    private BancoPreguntas bancoPreguntas = new BancoPreguntas();

    private TextView puntaje;
    private Button pregunta;
    private Button opcion1;
    private Button opcion2;
    private Button opcion3;


    private String respuesta;
    private int puntajeObtenido = 0;
    private int numeroPregunta = 0;
    private int numeroSonido = -1;
    private int total=0;
    private String r ="";

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_sonidos);


        puntaje = findViewById(R.id.txt_puntaje_sonido);
        pregunta = findViewById(R.id.btn_play);
        opcion1 = findViewById(R.id.btn_sonido1);
        opcion2 = findViewById(R.id.btn_sonido2);
        opcion3 = findViewById(R.id.btn_sonido3);

        actualizarPregunta();
        pregunta.setOnClickListener(this);

        opcion1.setOnClickListener(this);
        opcion2.setOnClickListener(this);
        opcion3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_play:
                mediaPlayer = MediaPlayer.create(this,bancoPreguntas.getPreguntasSonido(numeroSonido));
                mediaPlayer.start();
                break;

            case R.id.btn_sonido1:
                if(opcion1.getText() == respuesta){
                    puntajeObtenido += 1;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }else{
                    actualizarPregunta();
                }
                break;

            case R.id.btn_sonido2:
                if(opcion2.getText() == respuesta){
                    puntajeObtenido += 1;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }else{
                    actualizarPregunta();
                }
                break;

            case R.id.btn_sonido3:
                if(opcion3.getText() == respuesta){
                    puntajeObtenido += 1;
                    actualizarPuntaje(puntajeObtenido);
                    actualizarPregunta();
                }else{
                    actualizarPregunta();
                }
                break;
        }
    }

    public void actualizarPregunta(){
        total = bancoPreguntas.getTamPreguntas();
        if(numeroPregunta<total){
            opcion1.setText(bancoPreguntas.getOpcion1(numeroPregunta));
            opcion2.setText(bancoPreguntas.getOpcion2(numeroPregunta));
            opcion3.setText(bancoPreguntas.getOpcion3(numeroPregunta));

            respuesta = bancoPreguntas.getRespuesta(numeroPregunta);
            numeroPregunta ++;
            numeroSonido ++ ;
        }else{
            Intent intent = new Intent(getApplicationContext(),ResultadoSonidoActivity.class);
            intent.putExtra("puntajeSonido",getResultado());
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
