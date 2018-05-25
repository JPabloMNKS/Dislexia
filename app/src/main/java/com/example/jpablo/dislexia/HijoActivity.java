package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HijoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSilabas,btnSonidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijo);

        btnSilabas = findViewById(R.id.btn_juego_silabas);
        btnSonidos = findViewById(R.id.btn_juego_sonidos);

        btnSilabas.setOnClickListener(this);
        btnSonidos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_juego_silabas:
                Intent intent = new Intent(getApplicationContext(),SilabasInstruccionesActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_juego_sonidos:
                Intent intent1 = new Intent(getApplicationContext(),SonidosInstruccionesActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
