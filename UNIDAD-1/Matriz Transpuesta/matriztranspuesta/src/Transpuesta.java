import java.util.Scanner;
public class Transpuesta {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al programa santi");
        System.out.println("En este sistema se hallara la matriz transpuesta de una matriz");
        // para hacerlo mas interesante, que el usuario escoja el tamaño de la matriz :p
        System.out.println("Ingresa el tamaño de tu matriz en filas x columnas");
        int filas = teclado.nextInt();
        int columnas = teclado.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ahora rellena los valores de tu matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=teclado.nextInt();
            }
        }
        System.out.println("Tu matriz original es");
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" "); 
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        System.out.println("Tu matriz transpuesta es");
        System.out.println("");

         for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                System.out.print(matriz[j][i]+" "); 
            }
            System.out.println(" ");
        }
        
// no esta terminado








        teclado.close();
    }
}
