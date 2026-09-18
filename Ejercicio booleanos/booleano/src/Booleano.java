import java.util.Scanner;



public class Booleano {
    public static void main(String[] args) throws Exception {
        
        //Crea un programa en Java que solicite al usuario tres números
        //y determine si el primero es mayor que el segundo y menor que el tercero. 
        //El programa debe utilizar tanto operadores de comparación como operadores lógicos.

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Porfavor ingresa un numero");
        byte num1 = Teclado.nextByte();

        System.out.println("Porfavor ingresa un numero");
        byte num2 = Teclado.nextByte();

        System.out.println("Porfavor ingresa un numero");
        byte num3 = Teclado.nextByte();

        boolean resultado = (num1 > num2) && (num1 < num3);

        System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);


        Teclado.close();













    }
}
