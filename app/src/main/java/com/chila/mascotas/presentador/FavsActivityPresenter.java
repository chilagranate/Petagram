package com.chila.mascotas.presentador;

import android.content.Context;

import com.chila.mascotas.DB.ConstructorMascotas;
import com.chila.mascotas.IFavsActivity;
import com.chila.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class FavsActivityPresenter implements IFavsActivityPresenter {
    private IFavsActivity iFavsActivity;
    Context context;

    private ArrayList<Mascota> mascotas;

    public FavsActivityPresenter(IFavsActivity iFavsActivity, Context context){
        this.iFavsActivity =iFavsActivity;
        this.context = context;
        obtenerMascotasBD();
    }

    @Override
    public void obtenerMascotasBD() {
        ConstructorMascotas constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerMascotasLike();
        mostrarMascotasRV();


    }

    @Override
    public void mostrarMascotasRV() {
        iFavsActivity.inicializarAdaptador(iFavsActivity.crearAdaptador(mascotas));
        iFavsActivity.generarLayout();



    }
}
