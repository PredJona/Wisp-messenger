package com.wisp.modelo;

/**
 * Representa a una persona que participa en conversaciones de Wisp.
 */
public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String estadoConexion;

    /**
     * Crea un usuario con sus datos básicos.
     *
     * @param idUsuario identificador del usuario
     * @param nombreUsuario nombre del usuario
     */
    public Usuario(int idUsuario, String nombreUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.estadoConexion = "Desconectado";
    }

    /**
     * Muestra los datos del usuario.
     */
    public void mostrarDatos() {
        // TODO: mostrar los datos del usuario en una etapa posterior.
    }

    /**
     * Cambia el estado de conexión del usuario.
     *
     * @param nuevoEstado nuevo estado de conexión
     */
    public void cambiarEstadoConexion(String nuevoEstado) {
        // TODO: actualizar el estado de conexión en una etapa posterior.
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return nombre del usuario
     */
    public String obtenerNombreUsuario() {
        // TODO: proporcionar el nombre del usuario en una etapa posterior.
        return null;
    }
}
