import java.util.Scanner;

public class Parqueadero {
public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);

    String[] placas = new String[5];

    int opcion;

    do {

        System.out.println("1. Registrar vehiculo");
        System.out.println("2. Buscar vehiculo");
        System.out.println("3. Mostrar parqueadero");
        System.out.println("4. Salir");

        opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {

            case 1:

                System.out.println("Ingrese la placa:");
                String nuevaPlaca = leer.nextLine();

                if (Funciones.buscarPlaca(placas, nuevaPlaca)) {
                    System.out.println("El vehiculo ya esta registrado");
                    break;
                }

                boolean registrado = false;

                for (int i = 0; i < placas.length; i++) {

                    if (placas[i] == null) {
                        placas[i] = nuevaPlaca;
                        registrado = true;
                        break;
                    }
                }

                if (registrado) {
                    System.out.println("Vehiculo registrado");
                } else {
                    System.out.println("Parqueadero lleno");
                }

                break;

            case 2:

                System.out.println("Ingrese la placa:");
                String placa = leer.nextLine();

                if (Funciones.buscarPlaca(placas, placa)) {
                    System.out.println("Vehiculo encontrado");
                } else {
                    System.out.println("Vehiculo no encontrado");
                }

                break;

            case 3:
                Funciones.mostrarVehiculos(placas);
                break;

            case 4:
                System.out.println("Cerrando sistema");
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

    } while (opcion != 4);

    leer.close();
}
}