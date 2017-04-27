package com.example.a55.clase04_tp_pantallas.Validaciones;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by A55 on 27/04/2017.
 */

public class Validaciones {

    public Validaciones() {}

    public static boolean validarInputVacio(String string) {

        return !TextUtils.isEmpty(string);
    }

    public static boolean validarInputEmail(String email) {

        Pattern pattern = Patterns.EMAIL_ADDRESS;

        return pattern.matcher(email).matches();
    }

    public static boolean validarClavesRegistro(String clave1, String clave2) {

        return clave1.equals(clave2);
    }

    public static boolean validarDniLenght(String dni) {

        if ( dni.length() < 7 || dni.length() > 8 ) {
            return false;
        }
        else {
            return true;
        }
    }
}
