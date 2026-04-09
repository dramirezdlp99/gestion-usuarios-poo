package com.universidad.gestion_usuarios.model;

public abstract class Persona {
    protected String nombre;
    protected String correo;

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
}