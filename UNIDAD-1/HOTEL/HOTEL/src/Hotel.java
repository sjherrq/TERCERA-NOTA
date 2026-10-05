import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) throws Exception {
        //Definir las variables
        Scanner teclado = new Scanner(System.in);
        String[] Nombre = new String[10];
        Short[] Habitacion = {101, 102, 103, 104, 105};
        Byte[] Noches = new Byte[5];
        int[] Precio = new int[5];
        int[] Total = new int[5];
        int CantHabit = Habitacion.length;
        
        System.out.println("Hotel Santi S.A");
        byte CantClient = 0; 
        long TotalTotal = 0;
        String respuesta;
        Short[] HabitacionCliente = new Short[5];
// todo lo vital

        do {
            //ingresar el nombre del cliente
            System.out.print("Ingrese nombre del cliente:  ");
            Nombre[CantClient] = teclado.nextLine();
            

            boolean disponible = false;
            boolean repetir = true;


            //escoger la habitacion
            while (repetir == true) {
                System.out.print("Ingrese una habitacion:  ");
                short habitacion =teclado.nextShort();
            
                // comprobar que la habitacion este disponible

                for (int j = 0; j < CantHabit; j++) {
                     if (Habitacion[j] != null && Habitacion[j] == habitacion) {
                        disponible = true;
                    }
                }

                  for (int j = 0; j < CantClient; j++) {

                    if (HabitacionCliente[j] != null && HabitacionCliente[j] == habitacion) {
                        disponible = false;
                    }
                }
//habitacion  disponible o no
                if (disponible) {

                    HabitacionCliente[CantClient] = habitacion;

                    System.out.println("Habitacion disponible");
                    repetir = false;

                } else {

                    System.out.println("Habitacion no disponible");
                    System.out.println("Ingrese otra habitacion");
                }
            }
// numeros de noches y precio 
            System.out.print("Ingrese cantidad de noches: ");
            Noches[CantClient]= teclado.nextByte();
            System.out.print("Ingrese precio por noche: ");
            Precio[CantClient]= teclado.nextInt();
            teclado.nextLine();

            Total[CantClient] = (Noches[CantClient]*Precio[CantClient]);
            System.out.println("El valor total del cliente son: "+Total[CantClient]+" COP");
            System.out.println("------------------");
            System.out.println(" ");
           

            System.out.println("Cliente: "+Nombre[CantClient]+" En la habitacion "+HabitacionCliente[CantClient]+" Un total de "+Total[CantClient]+" COP");
          
            System.out.println("Hay nuevo cliente?");
            respuesta = teclado.next();
         
            
            

            
            if (respuesta.equals("si")) {
                CantClient++;
            }
           
            teclado.nextLine();
         
        } while (respuesta.equals("si") && CantClient<5);



        //sumar todo lo ganado
        for (int i = 0; i < 5; i++) {
            TotalTotal = TotalTotal + Total[i];
        }



// mostrar informe final
        System.out.println("");
        System.out.print("-------------------------");
        System.out.println(" ");
        System.out.print("    INFORME FINAL     ");
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Total clientes :"+(CantClient));
        System.out.println("Total generado :"+TotalTotal);
        System.out.println("-------------------------");


//este programa me llevo demaciado tiempo


        teclado.close();
    }
}
