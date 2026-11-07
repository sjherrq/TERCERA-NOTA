import java.util.Scanner;

public class EstRegis {

public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    String[] nombres = new String[3];
    double[] notas = new double[3];

    for (int i = 0; i < nombres.length; i++) {

        System.out.println("Nombre del estudiante:");
        nombres[i] = leer.nextLine();

        System.out.println("Nota:");
        notas[i] = leer.nextDouble();
        leer.nextLine();
    }

    Funciones.mostrarEstudiantes(nombres, notas);

    System.out.println("Aprobados: " + Funciones.contarAprobados(notas));

    leer.close();
    }
}