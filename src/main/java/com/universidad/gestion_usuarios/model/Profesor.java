package com.universidad.gestion_usuarios.model;

public class Profesor extends Persona implements Notificable, Evaluador {
    private String especialidad;

    public Profesor(String nombre, String correo, String especialidad) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    @Override
    public String enviarNotificacion(String mensaje) {
        return "Notificación docente enviada a: " + this.correo;
    }

    @Override
    public void evaluar(Estudiante estudiante, double nota) {
        // Lógica para poner nota
        System.out.println("Evaluando a " + estudiante.getNombre() + " con nota: " + nota);
    }
}