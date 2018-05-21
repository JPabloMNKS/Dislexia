package com.example.jpablo.dislexia;

public class BancoPreguntas {

    private int preguntas [] = {
            R.drawable.ancla,
            R.drawable.biblioteca,
            R.drawable.bruja,
            R.drawable.cocodrilo,
            R.drawable.cuadrado,
            R.drawable.diablo,
            R.drawable.fruta,
            R.drawable.globo,
            R.drawable.iglesia,
            R.drawable.platano,
            R.drawable.regla,
            R.drawable.sobre,
            R.drawable.sombrero,
            R.drawable.triangulo
    };

    private int preguntasSonidos[] = {
            R.raw.cla,
            R.raw.blio,
            R.raw.bru,
            R.raw.dri,
            R.raw.dra,
            R.raw.blo,
            R.raw.fru,
            R.raw.glo,
            R.raw.gle,
            R.raw.pla,
            R.raw.gla,
            R.raw.bre,
            R.raw.bre,
            R.raw.tri
    };


    private String opciones [][] = {
            {"CLA","LAC","CAL"},
            {"BILO","BLIO","LIBO"},
            {"BUR","RUB","BRU"},
            {"DRI","DIR","DI"},
            {"DRA","RAD","DAR"},
            {"BLO","BOL","LOB"},
            {"RUF","FUR","FRU"},
            {"GOL","LOG","GLO"},
            {"GLE","GEL","LEG"},
            {"PAL","PA","PLA"},
            {"GAL","LAG","GLA"},
            {"REB","BER","BRE"},
            {"BER","BRE","REB"},
            {"TRO","TRI","TIR"}
    };

    private String respuestas[] = {"CLA","BLIO","BRU","DRI","DRA","BLO","FRU","GLO","GLE","PLA","GLA","BRE","BRE","TRI"};


    public int getPrgunta(int a){
        int pregunta = preguntas[a];
        return pregunta;
    }

    public int getPreguntasSonido(int a){
        int preSonido = preguntasSonidos[a];
        return preSonido;
    }

    public String getOpcion1(int a) {
        String opcion = opciones[a][0];
        return opcion;
    }

    public String getOpcion2(int a) {
        String opcion = opciones[a][1];
        return opcion;
    }

    public String getOpcion3(int a) {
        String opcion = opciones[a][2];
        return opcion;
    }


    public String getRespuesta(int a){
        String respuesta = respuestas[a];
        return respuesta;
    }


    public int getTamPreguntas(){
        return preguntas.length;
    }
}
