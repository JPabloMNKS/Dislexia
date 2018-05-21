package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SilabasInstruccionesActivity extends AppCompatActivity implements View.OnClickListener {

    Button empezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silabas_instrucciones);

        empezar = findViewById(R.id.btn_empezar);
        empezar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),JuegoSilabasActivity.class);
        startActivity(intent);
        finish();
    }
}
