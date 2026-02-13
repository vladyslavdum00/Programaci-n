package JuegoUno;

public enum Color {
    ROJO("\u001B[31m", "Rojo"),        // ANSI rojo
    AZUL("\u001B[34m", "Azul"),        // ANSI azul
    VERDE("\u001B[32m", "Verde"),      // ANSI verde
    AMARILLO("\u001B[33m", "Amarillo"),// ANSI amarillo
    NEGRO("\u001B[30m", "Negro");      // ANSI negro

    private final String ansi;
    private final String nombre;

    Color(String ansi, String nombre) {
        this.ansi = ansi;
        this.nombre = nombre;
    }

    public String getAnsi() {
        return ansi;
    }

    public String getNombre() {
        return nombre;
    }
}
