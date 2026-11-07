import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        Byte calculadora;
        
        System.out.println("Calculadora");
        System.out.println("");
        System.out.println("ingresa el primer numero");
        while (!leer.hasNextDouble()) {
            System.out.println("Error, debes escribir un numero");
            leer.next();
        }
        double a = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
         while (!leer.hasNextDouble()) {
            System.out.println("Error, debes escribir un numero");
            leer.next();
        }
        double b=leer.nextDouble();
        System.out.println("");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");

        System.out.println("");
        System.out.println("Que accion desea realizar");
        while (!leer.hasNextByte()) {
            System.out.println("Error, debes escribir un numero");
            leer.next();
        }
        calculadora = leer.nextByte();
        switch (calculadora) {
            case 1:
                System.out.println("el resultado es: "+ Operaciones.sumar(a,b));
                break;
            case 2:
                System.out.println("el resultado es: "+ Operaciones.restar(a, b));
                break;
            case 3:
                System.out.println("el resultado es: "+ Operaciones.multiplicar(a, b));

                break;
            case 4:
                System.out.println("el resultado es: "+ Operaciones.dividir(a, b));
                break;
            default:
                System.out.println("Valor fuera del rango");
                break;
        }

        leer.close();
    }
}
