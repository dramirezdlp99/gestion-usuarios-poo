package com.universidad.gestion_usuarios.controller;

import com.universidad.gestion_usuarios.service.GestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/universidad")
public class UniversidadController {

    private final GestionService gestionService;

    public UniversidadController(GestionService gestionService) {
        this.gestionService = gestionService;
    }

    @GetMapping("/notificar")
    public String getNotificacion(@RequestParam(defaultValue = "Prueba de sistema") String mensaje) {
        return gestionService.procesarNotificacion(mensaje);
    }

    @GetMapping("/login")
    public String getLogin(@RequestParam String user, @RequestParam String pass) {
        return gestionService.procesarLogin(user, pass);
    }
}