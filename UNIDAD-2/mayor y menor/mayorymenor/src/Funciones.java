public class Funciones {
    public static int encontrarMayor(int[] numeros) {

    int mayor = numeros[0];

    for (int i = 1; i < numeros.length; i++) {

        if (numeros[i] > mayor) {
            mayor = numeros[i];
        }
    }
        return mayor;
    }

public static int encontrarMenor(int[] numeros) {

    int menor = numeros[0];

    for (int i = 1; i < numeros.length; i++) {

        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }

    return menor;
}

}
