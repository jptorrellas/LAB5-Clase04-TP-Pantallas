package com.example.a55.clase04_tp_pantallas.Models;

/**
 * Created by A55 on 25/04/2017.
 */

public class LoginModel {

    /**
     * Atributos
     */

    private String email;
    private String clave;

    /**
     * Contructor
     */
    public LoginModel() {
        //this.email = "prueba@prueba.com";
        //this.clave = "123";
    }

    /**
     * Getters and Setters
     */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
