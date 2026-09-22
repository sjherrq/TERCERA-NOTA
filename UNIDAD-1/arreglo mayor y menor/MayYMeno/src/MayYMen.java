import java.util.Scanner;
public class MayYMen {
    public static void main(String[] args) throws Exception {
    Scanner teclado= new Scanner(System.in);
    System.out.println("Bienvenido al programa santi");
    System.out.println("Introduce los valores de una matriz 4x4 para hallar su numero mayot y menor");
    int[][] matriz = new int[4][4];
    int CANTFILAS=4;
    int CANTCOLUM=4;   
    int mayor=0;
    int menor=0;
    int[] PosMay=new int[2];
    int[] PosMeno=new int[2];
    for (int filas = 0; filas < CANTFILAS; filas++)  {
        for (int columnas = 0; columnas < CANTCOLUM; columnas++)  {
            System.out.println("Ingrsa los valores de la fila "+ (filas+1)+ " y columna "+(columnas+1));
            matriz[filas][columnas] = teclado.nextInt(); 
            

            if (mayor<matriz[filas][columnas]) {
                mayor=matriz[filas][columnas];
                PosMay[0]=(filas+1);
                PosMay[1]=(columnas+1);
            }
           
            
             if (matriz[filas][columnas]<menor) {
                menor=matriz[filas][columnas];
                PosMeno[0]=(filas+1);
                PosMeno[1]=(columnas+1);
            }
        }
    }
for (int filas = 0; filas < CANTFILAS; filas++) {
    for (int columnas = 0; columnas < CANTCOLUM;    columnas++) {
        System.out.print(matriz[filas][columnas]+" ");
    }
    System.out.println();
}
    System.out.println("el mayor es "+ mayor+ " en la fila "+PosMay[0]+" y columna "+PosMay[1]);
    System.out.println("el menor es "+ menor+ " en la fila "+PosMeno[0]+" y columna "+PosMeno[1] );
    teclado.close();
    }
}
