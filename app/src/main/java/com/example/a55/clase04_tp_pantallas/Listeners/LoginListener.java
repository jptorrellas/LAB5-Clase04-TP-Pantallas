package com.example.a55.clase04_tp_pantallas.Listeners;

import android.view.View;

import com.example.a55.clase04_tp_pantallas.Interfaces.ILogin;

/**
 * Created by A55 on 25/04/2017.
 */

public class LoginListener implements View.OnClickListener {

    /**
     * Atributos
     */
    public ILogin iLogin;

    /**
     * Constructor
     */
    public LoginListener(ILogin iLogin) {
        this.iLogin = iLogin;
    }


    @Override
    public void onClick(View v) {
        this.iLogin.operar(v);
    }
}
