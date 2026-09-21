import java.util.Scanner;
public class NumMayor {
    public static void main(String[] args) throws Exception {
        
     //### **Ejercicio 1: Determinar el Mayor de Tres Números**

     //**Instrucción:**
     //Escribe un programa que lea tres números del usuario y determine cuál es el mayor de los tres utilizando una estructura `if-else`.

        Scanner Teclado = new Scanner(System.in);


        System.out.println("Porfavor ingresa tres numeros para hallar el mayor");
        int num1 = Teclado.nextInt();
        int num2 = Teclado.nextInt();
        int num3 = Teclado.nextInt();

       

        if (num1>num2 && num1>num3){
            System.out.println("El numero mayor es: "+num1);
        } else if (num2>num1 && num2>num3){
            System.out.println("El numero mayor es: "+num2);
        } else {
            System.out.println("El numero mayor es: "+num3);
            }   
        
        


        





        Teclado.close();


   }
}