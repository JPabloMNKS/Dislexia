package com.example.jpablo.dislexia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        getIncomingIntent();

    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("llaveMensaje") && getIntent().hasExtra("llaveMensajito")){

            String data = getIntent().getStringExtra("llaveMensaje");
            String mensajito = getIntent().getStringExtra("llaveMensajito");

            setData(mensajito);
        }

    }

    private void setData(String data){

        TextView mensaje = findViewById(R.id.mensaje_final);
        mensaje.setText(data);
    }



}
