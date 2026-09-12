import java.util.Scanner;


public class operaciones {
    public static void main(String[] args) throws Exception {
        
        Scanner Leer = new Scanner(System.in);

        System.out.println("escribe los numeros a sumar");
        float A = Leer.nextInt();
        float B = Leer.nextInt();
        float Resultado = A+B;

        System.out.println("tus numeros suman "+ Resultado);

        System.out.println("escribe los numeros a restar");

        A = Leer.nextInt();
        B = Leer.nextInt();
        Resultado = A-B;

        System.out.println("tus numeros restan "+ Resultado);


        System.out.println("escribe los numeros a multiplicar");

        A = Leer.nextInt();
        B = Leer.nextInt();
        Resultado = A*B;

        System.out.println("tus numeros multiplican "+ Resultado);


        System.out.println("escribe los numeros a dividir");

        A = Leer.nextInt();
        B = Leer.nextInt();
        Resultado = A/B;

        System.out.println("tus numeros dividen "+ Resultado);

        System.out.println("escribe los numeros que seas saber su residuo al dividir");

        A = Leer.nextInt();
        B = Leer.nextInt();
        Resultado = A%B;

        System.out.println("el residuo de tus numeros es "+ Resultado);



        Leer.close();
    }
}
