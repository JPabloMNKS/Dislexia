package com.example.jpablo.dislexia;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MensajeRecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> listaMensajes;
    private List<String> mensajes;
    private RecyclerViewAdapter adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_recycler);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerMensaje);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        listaMensajes = llenarDatos();
        mensajes = llenadoMensajes();


        initRecyclerView();


    }

    public List<String> llenadoMensajes(){
        List<String> mens = new ArrayList<>();
        mens.add(getString(R.string.mensaje_1));
        mens.add(getString(R.string.mensaje_2));
        mens.add(getString(R.string.mensaje_3));

        return mens;
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerMensaje);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,listaMensajes,mensajes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


    public List<String> llenarDatos() {
        List<String> data = new ArrayList<>();

        data.add(getString(R.string.pregunta_mesaje_1));
        data.add(getString(R.string.pregunta_mensaje_2));
        data.add(getString(R.string.pregunta_mensaje_3));

        return data;
    }



    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView textMensaje;
        private TextView textMensajito;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

             textMensaje = (TextView) itemView.findViewById(R.id.text_lista_mensaje);
        }
    }


    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

        private List<String> data;
        private List<String> mensajes;
        private Context menContext;

        public RecyclerViewAdapter(Context menContext, List<String> data, List<String> mensajes) {
            this.data = data;
            this.mensajes = mensajes;
            this.menContext = menContext;
        }

        public RecyclerViewAdapter(List<String> a) {
            data = a;
        }

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getApplicationContext());

            View view = layoutInflater.inflate(R.layout.layout_lista_mensaje,
                    parent, false);
            return new RecyclerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, final int position) {

            final String dato = data.get(position);
            holder.textMensaje.setText(dato);


            holder.textMensaje.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(menContext, MensajeActivity.class);
                    intent.putExtra("llaveMensaje",data.get(position));
                    intent.putExtra("llaveMensajito",mensajes.get(position));
                    menContext.startActivity(intent);

                }
            });


        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }



}
