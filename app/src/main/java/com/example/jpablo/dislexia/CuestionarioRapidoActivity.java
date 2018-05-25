package com.example.jpablo.dislexia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CuestionarioRapidoActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10;
    RadioButton rb11,rb12,rb13,rb14,rb15,rb16,rb17,rb18,rb19,rb20;
    RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7,rg8,rg9,rg10;
    Button aceptar;

    String r = "";

    int aux,aux1,aux2,aux3,aux4,aux5,aux6,aux7,aux8,aux9,aux10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario_rapido);

        rb1 =  findViewById(R.id.rb_1);
        rb2 =  findViewById(R.id.rb_2);
        rb3 =  findViewById(R.id.rb_3);
        rb4 =  findViewById(R.id.rb_4);
        rb5 =  findViewById(R.id.rb_5);
        rb6 =  findViewById(R.id.rb_6);
        rb7 =  findViewById(R.id.rb_7);
        rb8 =  findViewById(R.id.rb_8);
        rb9 =  findViewById(R.id.rb_9);
        rb10 =  findViewById(R.id.rb_10);

        rb11 = findViewById(R.id.rb_11);
        rb12 = findViewById(R.id.rb_12);
        rb13 = findViewById(R.id.rb_13);
        rb14 = findViewById(R.id.rb_14);
        rb15 = findViewById(R.id.rb_15);
        rb16 = findViewById(R.id.rb_16);
        rb17 = findViewById(R.id.rb_17);
        rb18 = findViewById(R.id.rb_18);
        rb19 = findViewById(R.id.rb_19);
        rb20 = findViewById(R.id.rb_20);

        rg1 =  findViewById(R.id.rg_1);
        rg2 =  findViewById(R.id.rg_2);
        rg3 =  findViewById(R.id.rg_3);
        rg4 =  findViewById(R.id.rg_4);
        rg5 =  findViewById(R.id.rg_5);
        rg6 =  findViewById(R.id.rg_6);
        rg7 =  findViewById(R.id.rg_7);
        rg8 =  findViewById(R.id.rg_8);
        rg9 =  findViewById(R.id.rg_9);
        rg10 =  findViewById(R.id.rg_10);

        rg1.setOnCheckedChangeListener(this);
        rg2.setOnCheckedChangeListener(this);
        rg3.setOnCheckedChangeListener(this);
        rg4.setOnCheckedChangeListener(this);
        rg5.setOnCheckedChangeListener(this);
        rg6.setOnCheckedChangeListener(this);
        rg7.setOnCheckedChangeListener(this);
        rg8.setOnCheckedChangeListener(this);
        rg9.setOnCheckedChangeListener(this);
        rg10.setOnCheckedChangeListener(this);

        aceptar = (Button) findViewById(R.id.btn_aceptar_rapido);
        aceptar.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if(rb1.isChecked() ){ aux1 = 1; }
        if(rb2.isChecked() ){ aux2 = 1; }
        if(rb3.isChecked() ){ aux3 = 1; }
        if(rb4.isChecked() ){ aux4 = 1; }
        if(rb5.isChecked() ){ aux5 = 1; }
        if(rb6.isChecked() ){ aux6 = 1; }
        if(rb7.isChecked() ){ aux7 = 1; }
        if(rb8.isChecked() ){ aux8 = 1; }
        if(rb9.isChecked() ){ aux9 = 1; }
        if(rb1.isChecked() ){ aux10 = 1; }

        if(rb11.isChecked() ){ aux1 = 0; }
        if(rb12.isChecked() ){ aux2 = 0; }
        if(rb13.isChecked() ){ aux3 = 0; }
        if(rb14.isChecked() ){ aux4 = 0; }
        if(rb15.isChecked() ){ aux5 = 0; }
        if(rb16.isChecked() ){ aux6 = 0; }
        if(rb17.isChecked() ){ aux7 = 0; }
        if(rb18.isChecked() ){ aux8 = 0; }
        if(rb19.isChecked() ){ aux9 = 0; }
        if(rb20.isChecked() ){ aux10 = 0; }

        aux = aux1 + aux2 + aux3 + aux4 + aux5 + aux6 +aux7 + aux8 + aux9 + aux10;

    }

    public String getR() {
        return r = String.valueOf(aux);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),ResultadoRapidoActivity.class);
        intent.putExtra("resultado",getR());
        startActivity(intent);
        finish();
    }

}
