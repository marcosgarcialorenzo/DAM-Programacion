package E.HundirLaFlota;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tablero tablero = new Tablero();
        Teclado teclado = new Teclado();
        Jugador jugador1 = new Jugador("Juan", 0);
        Jugador jugador2 = new Jugador("Ana", 1);

        int opcion;
        System.out.println("Menú de juego:");
        System.out.println("1. Rellenar tablero de manera aleatoria");
        System.out.println("2. Rellenar tablero de manera manual");
        System.out.println("Elige una opción (1 o 2):");
        opcion = teclado.leerInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("Rellenando tableros de ambos jugadores de manera aleatoria...");
                tablero.rellenarAleatorio();
                System.out.println("¡Comienza el juego!");
                System.out.println("Leyenda: 🔴 = tocado, 🔵 = agua disparada, ⬜ = oculto");
            }
            case 2 -> {
                System.out.println("Rellenar tablero del Jugador 1:");
                tablero.rellenar(0);
                System.out.println("Rellenar tablero del Jugador 2:");
                tablero.rellenar(1);
                System.out.println("Comienza el juego!");
            }
            default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
        }

        boolean fin = false;
        while (!fin) {
            System.out.println("Turno de " + jugador1.nombre);
            tablero.mostrarTableroOculto(jugador2);
            tablero.disparar(jugador2, jugador1); // jugador1 ataca jugador2
            if (jugador2.hayBarcos()) {
                System.out.println("¡" + jugador1.nombre + " ha ganado!");
                fin = true;
            }
            System.out.println("Turno de " + jugador2.nombre);
            tablero.mostrarTableroOculto(jugador1);
            tablero.disparar(jugador1, jugador2);
            if (jugador1.hayBarcos()) {
                System.out.println("¡" + jugador2.nombre + " ha ganado!");
                fin = true;
            }
        }

    }
}