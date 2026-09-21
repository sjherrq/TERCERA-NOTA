import java.util.Scanner;


public class Mini_proyecto {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido, este es un programa para calcular la media de 3 numeros");
        System.out.println("Ingrese los numeros que desea promediar");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int divisor = 3;


        float Promedio = (num1+num2+num3)/divisor;

        System.out.println("el promedio de sus tres numeros es: "+Promedio);



        leer.close();





    }
}
