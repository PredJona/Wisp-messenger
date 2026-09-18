package com.wisp.servicio;

import com.wisp.modelo.Conversacion;
import com.wisp.modelo.Usuario;

/**
 * Coordina la prueba local de usuarios, conversación y mensajes.
 */
public class SistemaMensajeria {

    private Usuario usuarioActual;
    private Usuario destinatarioActual;
    private Conversacion conversacionActiva;

    /**
     * Crea el coordinador de mensajería sin datos iniciales.
     */
    public SistemaMensajeria() {
        // TODO: asignar referencias durante la prueba desde Main.
    }

    /**
     * Inicia una sesión local para un usuario.
     *
     * @param usuario usuario que inicia sesión
     */
    public void iniciarSesion(Usuario usuario) {
        // TODO: implementar la prueba local en una etapa posterior.
    }

    /**
     * Selecciona un destinatario para la conversación.
     *
     * @param usuario usuario seleccionado como destinatario
     */
    public void seleccionarDestinatario(Usuario usuario) {
        // TODO: implementar la prueba local en una etapa posterior.
    }

    /**
     * Crea la conversación activa.
     */
    public void crearConversacion() {
        // TODO: implementar la prueba local en una etapa posterior.
    }

    /**
     * Envía un mensaje dentro de la conversación activa.
     *
     * @param contenido contenido del mensaje
     * @return resultado del envío
     */
    public boolean enviarMensaje(String contenido) {
        // TODO: implementar la prueba local en una etapa posterior.
        return false;
    }
}
