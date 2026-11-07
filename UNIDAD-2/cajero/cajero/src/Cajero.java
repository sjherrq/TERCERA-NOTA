import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double saldo = 500000;
        int opcion;

        do {

            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Saldo: $" + saldo);
                    break;

                case 2:
                    System.out.println("Cantidad a depositar:");
                    double deposito = leer.nextDouble();

                    if (deposito > 0) {
                        saldo = Funciones.depositar(saldo, deposito);
                    }
                    break;

                case 3:
                    System.out.println("Cantidad a retirar:");
                    double retiro = leer.nextDouble();

                    saldo = Funciones.retirar(saldo, retiro);
                    break;

                case 4:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4);

        leer.close();
    }
}