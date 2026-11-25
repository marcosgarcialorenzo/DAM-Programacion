package HundirLaFlota;

public class Jugador { // Clase que representa a un jugador en el juego
    String nombre;
    int barcos;
    int id;

    Jugador(String nombre, int id) { // Constructor de la clase Jugador
        this.id = id;
        this.nombre = nombre;
        this.barcos = 1;
    }

    boolean hayBarcos() {
        if (this.barcos <= 0) {
            return true;
        }
        return false;
    }
}