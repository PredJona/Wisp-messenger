package com.wisp.modelo;

/**
 * Representa una conversación entre dos usuarios.
 */
public class Conversacion {

    private int idConversacion;
    private Usuario participanteUno;
    private Usuario participanteDos;
    private Mensaje ultimoMensaje;

    /**
     * Crea una conversación entre dos participantes.
     *
     * @param idConversacion identificador de la conversación
     * @param participanteUno primer participante
     * @param participanteDos segundo participante
     */
    public Conversacion(int idConversacion, Usuario participanteUno,
            Usuario participanteDos) {
        this.idConversacion = idConversacion;
        this.participanteUno = participanteUno;
        this.participanteDos = participanteDos;
    }

    /**
     * Registra el último mensaje de la conversación.
     *
     * @param mensaje mensaje que se registrará
     * @return resultado del registro
     */
    public boolean registrarUltimoMensaje(Mensaje mensaje) {
        // TODO: registrar el mensaje en una etapa posterior.
        return false;
    }

    /**
     * Muestra un resumen de la conversación.
     */
    public void mostrarResumen() {
        // TODO: mostrar el resumen en una etapa posterior.
    }

    /**
     * Comprueba si un usuario participa en la conversación.
     *
     * @param usuario usuario que se comprobará
     * @return resultado de la comprobación
     */
    public boolean contieneParticipante(Usuario usuario) {
        // TODO: comprobar el participante en una etapa posterior.
        return false;
    }
}
