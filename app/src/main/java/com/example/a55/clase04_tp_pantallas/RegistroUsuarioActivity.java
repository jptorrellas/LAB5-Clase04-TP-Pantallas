package com.example.a55.clase04_tp_pantallas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a55.clase04_tp_pantallas.Controllers.RegistroUsuarioCtrl;
import com.example.a55.clase04_tp_pantallas.Models.RegistroUsuarioModel;
import com.example.a55.clase04_tp_pantallas.Views.RegistroUsuarioView;

public class RegistroUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Ocultar ActionBar
        getSupportActionBar().hide();

        RegistroUsuarioModel registroUsuarioModel = new RegistroUsuarioModel();
        RegistroUsuarioView registroUsuarioView = new RegistroUsuarioView(this, registroUsuarioModel);
        RegistroUsuarioCtrl registroUsuarioCtrl = new RegistroUsuarioCtrl(registroUsuarioView);
    }
}
