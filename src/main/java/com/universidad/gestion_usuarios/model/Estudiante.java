package com.universidad.gestion_usuarios.model;

public class Estudiante extends Persona implements Notificable, Autenticable {
    private String codigo;

    public Estudiante(String nombre, String correo, String codigo) {
        super(nombre, correo);
        this.codigo = codigo;
    }

    @Override
    public String enviarNotificacion(String mensaje) {
        return "Correo enviado con éxito a " + this.correo + ": " + mensaje;
    }

    @Override
    public boolean login(String usuario, String password) {
        // Lógica simple para la API
        return "admin".equals(usuario) && "1234".equals(password);
    }
}