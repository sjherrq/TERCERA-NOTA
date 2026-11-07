import java.util.Random;
import java.util.Scanner;

public class Funciones {
    
    public static boolean comprobar(int numero, int secreto) {
        return numero == secreto;
    }

    public static void jugar() {

        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();

        int secreto = aleatorio.nextInt(10) + 1;
        int numero = 0;
        int intentos = 0;

        while (numero != secreto) {

            System.out.println("Adivina un numero del 1 al 10:");
            numero = leer.nextInt();

            intentos++;

            if (comprobar(numero, secreto)) {
                System.out.println("¡Correcto!");
            } else if (numero < secreto) {
                System.out.println("El numero secreto es mayor");
            } else {
                System.out.println("El numero secreto es menor");
            }
        }

        System.out.println("Intentos: " + intentos);
        leer.close();
    }
}
