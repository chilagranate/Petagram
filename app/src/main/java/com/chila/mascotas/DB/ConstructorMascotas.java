package com.chila.mascotas.DB;

import android.content.Context;

import com.chila.mascotas.R;
import com.chila.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private Context context;

    public ConstructorMascotas(Context context){
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        ArrayList<Mascota> mascotas;
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perrito, "Bobby", 5));
        mascotas.add(new Mascota(R.drawable.tortuga, "Manuelita", 7));
        mascotas.add(new Mascota(R.drawable.pajaro, "Birdy", 5));
        mascotas.add(new Mascota(R.drawable.red_nemo, "Nemo", 2));
        mascotas.add(new Mascota(R.drawable.gato, "Firulais", 3));
        return mascotas;
    }
}
