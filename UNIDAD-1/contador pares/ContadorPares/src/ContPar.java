public class ContPar {
    public static void main(String[] args) throws Exception {
       
    //### **Ejercicio 2: Contador de Números Pares**
    //**Instrucción:**
    //Crea un programa que cuente cuántos números pares hay entre 1 y 100 utilizando un ciclo `for`.

    int cont=0;
    
    for (int i = 1; i <= 100; i++) {

        if (i % 2 == 0){
            cont++;
        }

    }

    System.out.println("Hay "+cont+" numeros pares del 1 al 100");

    }
}
