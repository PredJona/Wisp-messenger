package com.wisp.modelo;

/**
 * Representa un archivo adjunto previsto para una etapa futura.
 */
public class ArchivoAdjunto {

    private String nombreArchivo;
    private String tipoArchivo;
    private double tamanioBytes;
    private Usuario remitente;
    private Usuario destinatario;
    private String estadoTransferencia;

    /**
     * Crea la representación de un archivo adjunto.
     *
     * @param nombreArchivo nombre del archivo
     * @param tipoArchivo tipo del archivo
     * @param tamanioBytes tamaño del archivo en bytes
     * @param remitente usuario que envía el archivo
     * @param destinatario usuario que recibe el archivo
     */
    public ArchivoAdjunto(String nombreArchivo, String tipoArchivo,
            double tamanioBytes, Usuario remitente, Usuario destinatario) {
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
        this.tamanioBytes = tamanioBytes;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    /**
     * Valida el archivo adjunto.
     *
     * @return resultado de la validación
     */
    public boolean validarArchivo() {
        // TODO: implementar en la fase de transferencia de archivos.
        return false;
    }

    /**
     * Actualiza el progreso de una transferencia futura.
     */
    public void actualizarProgreso() {
        // TODO: implementar en la fase de transferencia de archivos.
    }

    /**
     * Indica si la transferencia futura se completó.
     *
     * @return estado de finalización de la transferencia
     */
    public boolean estaCompleto() {
        // TODO: implementar en la fase de transferencia de archivos.
        return false;
    }
}
