package com.example.a55.clase04_tp_pantallas.Listeners;

import android.view.View;

import com.example.a55.clase04_tp_pantallas.Interfaces.IRegistroUsuario;

/**
 * Created by A55 on 25/04/2017.
 */

public class RegistroUsuarioListener implements View.OnClickListener {

    public IRegistroUsuario iRegistroUsuario;

    public RegistroUsuarioListener(IRegistroUsuario iRegistroUsuario) {

        this.iRegistroUsuario = iRegistroUsuario;
    }

    @Override
    public void onClick(View v) {
        this.iRegistroUsuario.operar(v);
    }
}
