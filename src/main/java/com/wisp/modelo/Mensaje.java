package com.wisp.modelo;

/**
 * Representa un mensaje de texto enviado entre dos usuarios.
 */
public class Mensaje {

    private int idMensaje;
    private Usuario remitente;
    private Usuario destinatario;
    private String contenido;
    private String fechaHora;
    private String estadoEnvio;

    /**
     * Crea un mensaje con sus datos iniciales.
     *
     * @param idMensaje identificador del mensaje
     * @param remitente usuario que envía el mensaje
     * @param destinatario usuario que recibe el mensaje
     * @param contenido texto del mensaje
     * @param fechaHora fecha y hora del envío
     */
    public Mensaje(int idMensaje, Usuario remitente, Usuario destinatario,
            String contenido, String fechaHora) {
        this.idMensaje = idMensaje;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.contenido = contenido;
        this.fechaHora = fechaHora;
    }

    /**
     * Valida el contenido del mensaje.
     *
     * @return resultado de la validación
     */
    public boolean validarContenido() {
        // TODO: validar el contenido en una etapa posterior.
        return false;
    }

    /**
     * Muestra el mensaje.
     */
    public void mostrarMensaje() {
        // TODO: mostrar el mensaje en una etapa posterior.
    }

    /**
     * Obtiene una representación legible del mensaje.
     *
     * @return resumen del mensaje
     */
    public String obtenerResumen() {
        // TODO: construir el resumen en una etapa posterior.
        return null;
    }
}
