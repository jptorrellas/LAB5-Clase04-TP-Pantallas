package com.example.a55.clase04_tp_pantallas.Interfaces;

import android.view.View;

/**
 * Created by A55 on 25/04/2017.
 */

public interface IRegistroUsuario {

    public void operar(View v);
    public void registrar(String nombre, String apellido, String dni, String email, String clave);
}
