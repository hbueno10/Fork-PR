package smartalarm.enums;

/**
 * Enum que representa los estados posibles de una alarma.
 */
public enum AlarmStatus {
    INACTIVA("Inactiva"),
    ACTIVA("Activa"),
    SONANDO("Sonando"),
    POSPUESTA("Pospuesta"),
    DESACTIVADA("Desactivada");

    private final String descripcion;

    AlarmStatus(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean puedeSnooze() {
        return this == SONANDO || this == ACTIVA;
    }

    public boolean estaSonando() {
        return this == SONANDO;
    }
}
