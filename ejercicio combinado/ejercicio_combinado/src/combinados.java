import java.util.Scanner;

public class combinados {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Instrucción: Crea un programa que solicite al usuario su nombre,
        //edad, y altura, y luego muestre un mensaje personalizado que incluya todos esos datos.

        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        byte edad = leer.nextByte();
        System.out.println("Ingrese su tamaño en cm");
        short tamaño = leer.nextShort();

        System.out.println("Bienvenido "+nombre+" tienes "+edad+" años y mides "+tamaño+"cm");

        leer.close();


    }
}
