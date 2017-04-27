package com.example.a55.clase04_tp_pantallas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a55.clase04_tp_pantallas.Controllers.LoginCtrl;
import com.example.a55.clase04_tp_pantallas.Models.LoginModel;
import com.example.a55.clase04_tp_pantallas.Views.LoginView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Ocultar ActionBar
        getSupportActionBar().hide();

        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView(this, loginModel);
        LoginCtrl loginCtrl = new LoginCtrl(loginView);
    }
}
