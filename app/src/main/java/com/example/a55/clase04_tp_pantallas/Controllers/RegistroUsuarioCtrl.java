package com.example.a55.clase04_tp_pantallas.Controllers;

import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.a55.clase04_tp_pantallas.Interfaces.IRegistroUsuario;
import com.example.a55.clase04_tp_pantallas.Listeners.RegistroUsuarioListener;
import com.example.a55.clase04_tp_pantallas.R;
import com.example.a55.clase04_tp_pantallas.Validaciones.Validaciones;
import com.example.a55.clase04_tp_pantallas.Views.RegistroUsuarioView;

/**
 * Created by A55 on 25/04/2017.
 */

public class RegistroUsuarioCtrl implements IRegistroUsuario {

    /**
     * Atributos
     */
    RegistroUsuarioView registroUsuarioView;
    RegistroUsuarioListener registroUsuarioListener;


    /**
     * Constructor
     * @param registroUsuarioView
     */
    public RegistroUsuarioCtrl(RegistroUsuarioView registroUsuarioView) {

        this.registroUsuarioView = registroUsuarioView;
        this.registroUsuarioListener = new RegistroUsuarioListener(this);

        this.registroUsuarioView.btnRegistrarme.setOnClickListener(registroUsuarioListener);
    }

    @Override
    public void operar(View v) {

        switch (v.getId()) {

            case R.id.btnRegistrarme:

                String nombre   = this.registroUsuarioView.etNombre.getText().toString();
                String apellido = this.registroUsuarioView.etApellido.getText().toString();
                String dni      = this.registroUsuarioView.etDni.getText().toString();
                String email    = this.registroUsuarioView.etEmail.getText().toString();
                String clave1   = this.registroUsuarioView.etClave1.getText().toString();
                String clave2   = this.registroUsuarioView.etClave2.getText().toString();

                //Validaciones
                if(!Validaciones.validarInputVacio(nombre)) {
                    this.registroUsuarioView.etNombre.setError("Ingrese nombre");
                    break;
                }

                if(!Validaciones.validarInputVacio(apellido)) {
                    this.registroUsuarioView.etApellido.setError("Ingrese apellido");
                    break;
                }

                if(!Validaciones.validarInputVacio(dni)) {
                    this.registroUsuarioView.etDni.setError("Ingrese DNI");
                    break;
                }

                if(!Validaciones.validarDniLenght(dni)) {
                    this.registroUsuarioView.etDni.setError("DNI invalido");
                    break;
                }

                if(!Validaciones.validarInputVacio(email)) {
                    this.registroUsuarioView.etEmail.setError("Ingrese email");
                    break;
                }

                if(!Validaciones.validarInputEmail(email)) {
                    this.registroUsuarioView.etEmail.setError("Email invalido");
                    break;
                }

                if(!Validaciones.validarInputVacio(clave1)) {
                    this.registroUsuarioView.etClave1.setError("Ingrese clave");
                    break;
                }

                if(!Validaciones.validarInputVacio(clave2)) {
                    this.registroUsuarioView.etClave2.setError("Reingrese clave");
                    break;
                }

                if(!Validaciones.validarClavesRegistro(clave1, clave2)) {
                    this.registroUsuarioView.etClave1.setError("Las claves no coinciden");
                    this.registroUsuarioView.etClave2.setError("Las claves no coinciden");
                    break;
                }

                this.registrar(nombre, apellido, dni, email, clave1);
                break;

            default:
                Toast.makeText(this.registroUsuarioView.registroUsuarioActivity, "SWITCH DEFAULT", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void registrar(String nombre, String apellido, String dni, String email, String clave) {
        Toast toast = Toast.makeText(this.registroUsuarioView.registroUsuarioActivity, "REGISTRO OK!!! :)", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
