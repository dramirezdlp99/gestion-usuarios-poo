package com.universidad.gestion_usuarios.model;

public class Administrativo extends Persona implements Notificable, Autenticable, Aprobador {
    private String area;

    public Administrativo(String nombre, String correo, String area) {
        super(nombre, correo);
        this.area = area;
    }

    @Override
    public String enviarNotificacion(String mensaje) {
        return "Correo administrativo enviado con éxito";
    }

    @Override
    public boolean login(String usuario, String password) {
        return "admin_root".equals(usuario) && "root123".equals(password);
    }

    @Override
    public void aprobarSolicitud(String codigoSolicitud) {
        System.out.println("Solicitud " + codigoSolicitud + " aprobada por el área de " + area);
    }
}