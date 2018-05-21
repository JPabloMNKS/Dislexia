package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPadre, btnAbout, btnHijo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPadre = (Button) findViewById(R.id.btn_padre);
        btnPadre.setOnClickListener(this);
        btnHijo = (Button) findViewById(R.id.btn_hijo);
        btnHijo.setOnClickListener(this);
        btnAbout = (Button) findViewById(R.id.btn_about);
        btnAbout.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_padre:
                Intent intent = new Intent(getApplicationContext(), PadresActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_hijo:
                Intent intent1 = new Intent(getApplicationContext(), HijoActivity.class);
                startActivity(intent1);
                break;

            case R.id.btn_about:
                Intent intent2 = new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(intent2);
                break;

        }
    }



}