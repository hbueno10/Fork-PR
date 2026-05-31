package smartalarm.enums;

/**
 * Enum que define los tipos de sonidos disponibles para las alarmas.
 */
public enum SoundType {
    GENTLE("Suave", 0.3),
    ALARM("Alarma clásica", 0.8),
    NATURE("Sonidos naturaleza", 0.5),
    MUSIC("Música", 0.6),
    BELL("Campana", 0.7);

    private final String descripcion;
    private final double volumenDefault;

    SoundType(String descripcion, double volumenDefault) {
        this.descripcion = descripcion;
        this.volumenDefault = volumenDefault;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getVolumenDefault() {
        return volumenDefault;
    }
}
