import java.util.Scanner;

public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    System.out.println("1. Celsius a Fahrenheit");
    System.out.println("2. Fahrenheit a Celsius");

    int opcion = leer.nextInt();

    System.out.println("Ingrese la temperatura:");
    double temperatura = leer.nextDouble();

    switch (opcion) {

        case 1:
            System.out.println(Funciones.celsiusAFahrenheit(temperatura));
            break;

        case 2:
            System.out.println(Funciones.fahrenheitACelsius(temperatura));
            break;

        default:
            System.out.println("Opcion incorrecta");
    }

    leer.close();
}
