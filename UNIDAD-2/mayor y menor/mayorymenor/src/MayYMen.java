import java.util.Scanner;

public class MayYMen {
public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++) {

        System.out.println("Ingrese un numero:");
        numeros[i] = leer.nextInt();
    }
    System.out.println("Mayor: " + Funciones.encontrarMayor(numeros));
    System.out.println("Menor: " + Funciones.encontrarMenor(numeros));

    leer.close();
    }
}