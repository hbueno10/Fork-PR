package smartalarm.model;

/**
 * Clase que implementa el modo circadiano.
 * Permite activación progresiva de alarmas con aumento gradual de volumen y brillo.
 */
public class CircadianMode {
    private boolean activo;
    private int duracionActivacionMinutos; // duración total de la activación progresiva
    private double brilloInicial; // 0.0 a 1.0
    private double brilloFinal; // 0.0 a 1.0
    private int tiempoTranscurrido; // en segundos

    /**
     * Constructor de CircadianMode.
     */
    public CircadianMode() {
        this.activo = false;
        this.duracionActivacionMinutos = 30; // 30 minutos por defecto
        this.brilloInicial = 0.1; // 10% brillo inicial
        this.brilloFinal = 1.0; // 100% brillo final
        this.tiempoTranscurrido = 0;
    }

    /**
     * Constructor personalizado.
     */
    public CircadianMode(int duracionMinutos, double brilloInicial, double brilloFinal) {
        this.activo = false;
        this.duracionActivacionMinutos = duracionMinutos;
        this.brilloInicial = brilloInicial;
        this.brilloFinal = brilloFinal;
        this.tiempoTranscurrido = 0;
    }

    // ========== Getters ==========
    public boolean isActivo() {
        return activo;
    }

    public int getDuracionActivacionMinutos() {
        return duracionActivacionMinutos;
    }

    public double getBrilloInicial() {
        return brilloInicial;
    }

    public double getBrilloFinal() {
        return brilloFinal;
    }

    public int getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    // ========== Setters ==========
    public void setDuracionActivacionMinutos(int minutos) {
        this.duracionActivacionMinutos = minutos;
    }

    public void setBrilloInicial(double brillo) {
        this.brilloInicial = Math.max(0.0, Math.min(brillo, 1.0));
    }

    public void setBrilloFinal(double brillo) {
        this.brilloFinal = Math.max(0.0, Math.min(brillo, 1.0));
    }

    /**
     * Activa el modo circadiano.
     */
    public void activar() {
        this.activo = true;
        this.tiempoTranscurrido = 0;
    }

    /**
     * Desactiva el modo circadiano.
     */
    public void desactivar() {
        this.activo = false;
        this.tiempoTranscurrido = 0;
    }

    /**
     * Calcula el brillo actual basado en el tiempo transcurrido.
     * Interpolación lineal entre brilloInicial y brilloFinal.
     */
    public double getBrilloActual() {
        if (!activo) {
            return brilloFinal;
        }

        int duracionSegundos = duracionActivacionMinutos * 60;
        if (tiempoTranscurrido >= duracionSegundos) {
            return brilloFinal;
        }

        // Interpolación lineal
        double progreso = (double) tiempoTranscurrido / duracionSegundos;
        return brilloInicial + (brilloFinal - brilloInicial) * progreso;
    }

    /**
     * Calcula el volumen actual (paralelo al brillo).
     */
    public double getVolumenActual(double volumenInicial, double volumenFinal) {
        if (!activo) {
            return volumenFinal;
        }

        int duracionSegundos = duracionActivacionMinutos * 60;
        if (tiempoTranscurrido >= duracionSegundos) {
            return volumenFinal;
        }

        // Interpolación lineal
        double progreso = (double) tiempoTranscurrido / duracionSegundos;
        return volumenInicial + (volumenFinal - volumenInicial) * progreso;
    }

    /**
     * Incrementa el tiempo transcurrido (llamar cada segundo).
     */
    public void incrementarTiempo() {
        if (activo) {
            tiempoTranscurrido++;
        }
    }

    /**
     * Verifica si la activación circadiana ha completado.
     */
    public boolean haCompletado() {
        return tiempoTranscurrido >= (duracionActivacionMinutos * 60);
    }

    /**
     * Obtiene el progreso en porcentaje.
     */
    public double getProgresoActivacion() {
        if (!activo) {
            return 0.0;
        }
        int duracionSegundos = duracionActivacionMinutos * 60;
        return Math.min(100.0, (double) tiempoTranscurrido / duracionSegundos * 100);
    }

    @Override
    public String toString() {
        return String.format("🌅 Modo Circadiano | Duración: %d min | Brillo: %.0f%% → %.0f%% | Progreso: %.0f%%",
                duracionActivacionMinutos,
                brilloInicial * 100,
                brilloFinal * 100,
                getProgresoActivacion());
    }
}
