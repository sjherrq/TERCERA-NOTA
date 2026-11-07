import java.util.Scanner;
public class Notas {
    public static void Main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Ingrese la nota " + (i + 1));
            notas[i] = leer.nextDouble();

            while (notas[i] < 0 || notas[i] > 5) {
                System.out.println("Nota incorrecta. Ingrese otra:");
                notas[i] = leer.nextDouble();
            }
        }

        double promedio = Funciones.calcularPromedio(notas);

        Funciones.mostrarNotas(notas);

        System.out.println("Promedio: " + promedio);

        if (Funciones.aprobo(promedio)) {
            System.out.println("El estudiante aprobo");
        } else {
            System.out.println("El estudiante reprobo");
        }

        leer.close();
    }
}