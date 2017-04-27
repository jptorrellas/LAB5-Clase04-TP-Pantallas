package com.example.a55.clase04_tp_pantallas.Views;


import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.example.a55.clase04_tp_pantallas.Models.LoginModel;
import com.example.a55.clase04_tp_pantallas.R;

/**
 * Created by A55 on 25/04/2017.
 */

public class LoginView {

    /**
     * Atributos
     */

    public LoginModel loginModel;
    public Activity loginActivity;

    public EditText etEmail;
    public EditText etClave;
    public Button btnIngresar;
    public Button btnRegistrarme;

    /**
     * Contructor
     * @param loginActivity
     * @param loginModel
     */
    public LoginView(Activity loginActivity, LoginModel loginModel) {

        this.loginActivity = loginActivity;
        this.loginModel = loginModel;

        this.etEmail = (EditText)loginActivity.findViewById(R.id.etEmail);
        this.etClave = (EditText)loginActivity.findViewById(R.id.etClave);
        this.btnIngresar = (Button)loginActivity.findViewById(R.id.btnIngresar);
        this.btnRegistrarme = (Button)loginActivity.findViewById(R.id.btnRegistrarme);
    }

}
