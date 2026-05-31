package smartalarm.enums;

/**
 * Enum que representa los días de la semana.
 * Utilizado para configurar la repetición de alarmas.
 */
public enum DayOfWeek {
    LUNES("Lunes", 1),
    MARTES("Martes", 2),
    MIERCOLES("Miércoles", 3),
    JUEVES("Jueves", 4),
    VIERNES("Viernes", 5),
    SABADO("Sábado", 6),
    DOMINGO("Domingo", 7);

    private final String nombre;
    private final int valor;

    DayOfWeek(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public boolean esFinDeSemana() {
        return this == SABADO || this == DOMINGO;
    }

    public boolean esDiaLaboral() {
        return !esFinDeSemana();
    }
}
