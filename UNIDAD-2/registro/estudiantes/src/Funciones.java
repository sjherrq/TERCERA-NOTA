public class Funciones {
    
public static void mostrarEstudiantes(String[] nombres, double[] notas) {

    for (int i = 0; i < nombres.length; i++) {

        System.out.println("Estudiante: " + nombres[i]);
        System.out.println("Nota: " + notas[i]);

    }
}

public static int contarAprobados(double[] notas) {

    int aprobados = 0;

    for (int i = 0; i < notas.length; i++) {

        if (notas[i] >= 3.0) {
            aprobados++;
        }
    }

    return aprobados;
    }

}
