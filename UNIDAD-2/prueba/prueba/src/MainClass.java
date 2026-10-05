import java.util.Scanner;
public class MainClass {
   
   public static int enconMayor(int a, int b, int c) {
    int mayor = a;
    if( b>mayor){
      mayor=b;
    }
    if (c>mayor){
      mayor=c;
    }

      return Math.max(a, Math.max(b, c));

   }


public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int a;
  int b;
  int c;
  System.out.println("ingrese a");
  a = teclado.nextInt();
  System.out.println("ingrese b");
  b = teclado.nextInt();
  System.out.println("ingrese c");
  c = teclado.nextInt();
  
  
  
  
  
  int resultado = enconMayor( a,  b,  c);
  
  System.out.println("el mayor es "+ resultado);
  
   teclado.close();
  }
}