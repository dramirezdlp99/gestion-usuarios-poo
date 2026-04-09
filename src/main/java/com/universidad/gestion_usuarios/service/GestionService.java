package com.universidad.gestion_usuarios.service;

import com.universidad.gestion_usuarios.model.Estudiante;
import com.universidad.gestion_usuarios.model.Administrativo;
import org.springframework.stereotype.Service;

@Service
public class GestionService {

    private Estudiante estudiantePrueba = new Estudiante("David Ramirez", "david@universidad.edu.co", "UCC-2026");
    private Administrativo adminPrueba = new Administrativo("Admin Central", "admin@universidad.edu.co", "Registro");

    public String procesarNotificacion(String mensaje) {
        return estudiantePrueba.enviarNotificacion(mensaje);
    }

    public String procesarLogin(String user, String pass) {
        // Ahora valida tanto si es estudiante como si es admin
        if (estudiantePrueba.login(user, pass) || adminPrueba.login(user, pass)) {
            return "acceso correcto";
        } else {
            return "acceso incorrecto, error al entrar";
        }
    }
}