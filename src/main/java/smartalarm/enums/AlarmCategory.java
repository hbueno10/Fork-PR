package smartalarm.enums;

/**
 * Enum que define las categorías de alarmas.
 * Permite organizar y filtrar alarmas por tipo.
 */
public enum AlarmCategory {
    TRABAJO("Trabajo", "🏢"),
    ESTUDIO("Estudio", "📚"),
    DEPORTE("Deporte", "⚽"),
    MEDICINA("Medicina", "💊"),
    PERSONAL("Personal", "👤");

    private final String nombre;
    private final String emoji;

    AlarmCategory(String nombre, String emoji) {
        this.nombre = nombre;
        this.emoji = emoji;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmoji() {
        return emoji;
    }

    @Override
    public String toString() {
        return emoji + " " + nombre;
    }
}
