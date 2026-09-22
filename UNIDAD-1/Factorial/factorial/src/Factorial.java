import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);

        System.out.println("Porfavor ingresa un numero para calcular su factorial.");
        int entrada = teclado.nextInt();

        int factorial = 1;
        int i = 1;



        while (i <= entrada) {
            factorial *= i;
            i++;

            
        }

           System.out.println(factorial);



        teclado.close();

    }
}
