package com.wisp.red;

import com.wisp.modelo.Mensaje;
import com.wisp.modelo.Usuario;

/**
 * Representa el futuro componente de red que dirigirá mensajes.
 */
public class ServidorMensajeria {

    private String direccionServidor;
    private int puerto;

    /**
     * Crea la representación de un servidor de mensajería.
     *
     * @param direccionServidor dirección del servidor
     * @param puerto puerto del servidor
     */
    public ServidorMensajeria(String direccionServidor, int puerto) {
        this.direccionServidor = direccionServidor;
        this.puerto = puerto;
    }

    /**
     * Inicia el servidor en una etapa futura.
     */
    public void iniciarServidor() {
        // TODO: implementar en la fase de red.
    }

    /**
     * Registra un usuario en una etapa futura.
     *
     * @param usuario usuario que se registrará
     */
    public void registrarUsuario(Usuario usuario) {
        // TODO: implementar en la fase de red.
    }

    /**
     * Reenvía un mensaje en una etapa futura.
     *
     * @param mensaje mensaje que se reenviará
     */
    public void reenviarMensaje(Mensaje mensaje) {
        // TODO: implementar en la fase de red.
    }
}
