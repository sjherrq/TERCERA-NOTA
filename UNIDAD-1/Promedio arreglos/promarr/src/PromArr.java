import java.util.Scanner;
public class PromArr {
    public static void main(String[] args) throws Exception {
        int[] arreglo = new int[5];
        System.out.println("Hola, bienvenido al programa de Santi");
        System.out.println("Ingresa 5 numeros para hallar su promedio");
        Scanner teclado = new Scanner(System.in);
        arreglo[0]= teclado.nextInt();
        arreglo[1]= teclado.nextInt();
        arreglo[2]= teclado.nextInt();
        arreglo[3]= teclado.nextInt();
        arreglo[4]= teclado.nextInt();
        double suma = 0;
        int longitud = arreglo.length;
        for (int i = 0; i < longitud;) {
            
        suma += arreglo[i];
        i++;
        }
        double promedio = (suma/longitud);

        System.out.println("El promedio de los valores de tu matriz es: "+promedio);





        teclado.close();





    }
}
