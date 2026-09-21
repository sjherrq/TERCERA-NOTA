import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvendio a la calculadora de Santi");

        System.out.println(" ");
        System.out.println("ingresa los dos numeros de la operacion");
        float a = teclado.nextInt();
        float b = teclado.nextInt();

        System.out.println("Ahora selecciona la operacion que deseas realizar");
        System.out.println("+ ");
        System.out.println("- ");
        System.out.println("* ");
        System.out.println("/ ");

        char operacion = teclado.next().charAt(0);

        switch (operacion) {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;



            default:
            System.out.println("Ecuacion no valida");
            break;
        }






        teclado.close();


    }
}
