import java.util.Scanner;


public class Juego {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int saludJugador = 100;
        int saludEnemigo = 100;
        int ataqueJugador = 20;

        while (saludJugador > 0 && saludEnemigo > 0) {

            System.out.println("Tu salud: " + saludJugador);
            System.out.println("Salud enemigo: " + saludEnemigo);

            System.out.println("1. Atacar");
            System.out.println("2. Curar");

            int opcion = leer.nextInt();

            if (opcion == 1) {

                saludEnemigo -= Funciones.atacar(ataqueJugador);

            } else if (opcion == 2) {

                saludJugador = Math.min(100, Funciones.curar(saludJugador));

            } else {

                System.out.println("Opcion incorrecta");
                continue;
            }

            if (saludEnemigo > 0) {
                saludJugador -= Funciones.atacarEnemigo();
            }
        }

        if (saludJugador <= 0) {
            System.out.println("Perdiste");
        } else {
            System.out.println("Ganaste");
        }

        leer.close();
    }
}