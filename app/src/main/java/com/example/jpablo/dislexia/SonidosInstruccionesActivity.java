package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SonidosInstruccionesActivity extends AppCompatActivity implements View.OnClickListener {

    Button empezarSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_instrucciones);

        empezarSonido = findViewById(R.id.btn_empezar_sonido);
        empezarSonido.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),JuegoSonidosActivity.class);
        startActivity(intent);
        finish();
    }
}
