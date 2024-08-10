package com.axioma.controlesdeseguridad.application;

public class UsuarioNoEncontradoException extends RuntimeException {
    public UsuarioNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}