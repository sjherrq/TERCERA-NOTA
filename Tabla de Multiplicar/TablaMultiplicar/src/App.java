    import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a la tabla de multiplicar de santi");
        System.out.println("Ingresa un numero para ver su tabla");
        int Numero = teclado.nextInt();
        System.out.println("Ingresa por cuanto quieres multiplicar tu numero");
        int hallar = teclado.nextInt();
        for (int i = 1; i <= hallar; i++) {
            int resultado = Numero*i;

            System.out.println(Numero+" x "+i+ " = " + resultado);
        }













        teclado.close();


    }
}
