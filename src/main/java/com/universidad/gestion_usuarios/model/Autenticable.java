package com.universidad.gestion_usuarios.model;

public interface Autenticable {
    boolean login(String usuario, String password);
}