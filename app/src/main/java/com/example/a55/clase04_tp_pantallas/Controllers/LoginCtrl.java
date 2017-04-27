package com.example.a55.clase04_tp_pantallas.Controllers;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.a55.clase04_tp_pantallas.Interfaces.ILogin;
import com.example.a55.clase04_tp_pantallas.Listeners.LoginListener;
import com.example.a55.clase04_tp_pantallas.R;
import com.example.a55.clase04_tp_pantallas.RegistroUsuarioActivity;
import com.example.a55.clase04_tp_pantallas.Validaciones.Validaciones;
import com.example.a55.clase04_tp_pantallas.Views.LoginView;


import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by A55 on 25/04/2017.
 */

public class LoginCtrl implements ILogin {

    /**
     * Atributos
     */

    public LoginView loginView;
    public LoginListener loginListener;

    /**
     * Constructor
     * @param loginView
     */
    public LoginCtrl(LoginView loginView) {

        this.loginView = loginView;
        this.loginListener = new LoginListener(this);

        this.loginView.btnIngresar.setOnClickListener(loginListener);
        this.loginView.btnRegistrarme.setOnClickListener(loginListener);
    }

    @Override
    public void operar(View v) {

        String email = (this.loginView.etEmail.getText()).toString();
        String clave = (this.loginView.etClave.getText()).toString();

        switch (v.getId()) {

            case R.id.btnIngresar:

                //Validaciones
                if(!Validaciones.validarInputVacio(email)) {
                    this.loginView.etEmail.setError("Ingrese email");
                    break;
                }

                if(!Validaciones.validarInputEmail(email)) {
                    this.loginView.etEmail.setError("Email invalido");
                    break;
                }

                if(!Validaciones.validarInputVacio(clave)) {
                    this.loginView.etClave.setError("Ingrese clave");
                    break;
                }

                this.ingresar(email, clave);
                break;

            case R.id.btnRegistrarme:
                this.registrar();
                break;

            default:
                Toast.makeText(this.loginView.loginActivity, "SWITCH DEFAULT", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void ingresar(String email, String clave) {

        if (email.equals("a@a.com") && clave.equals("123")) {
            Toast toast = Toast.makeText(this.loginView.loginActivity, "ENTRO!!! :) email: "+email+" clave: "+clave, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(this.loginView.loginActivity, "NO ENTRO :(", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    @Override
    public void registrar() {
        Intent intent = new Intent (this.loginView.loginActivity, RegistroUsuarioActivity.class);
        this.loginView.loginActivity.startActivity(intent);
    }
}
