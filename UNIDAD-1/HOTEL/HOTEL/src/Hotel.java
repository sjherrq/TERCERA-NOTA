import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String[] Nombre = new String[10];
        Short[] Habitacion = {101, 102, 103, 104, 105};
        Byte[] Noches = new Byte[5];
        int[] Precio = new int[5];
        int[] Total = new int[5];
        int CantHabit = Habitacion.length;
        System.out.println("Hotel Santi S.A");
        byte CantClient = 0; 
        byte i = 0;
        String respuesta;
        do {
            
            System.out.print("Ingrese nombre del cliente:  ");
            Nombre[CantClient] = teclado.nextLine();
            

            boolean disponible = false;
            boolean repetir = true;

            while (repetir == true) {
                System.out.print("Ingrese una habitacion:  ");
                short habitacion =teclado.nextShort();
            


                for (int j = 0; j < CantHabit; j++) {
                    if (Habitacion[j] == habitacion) {
                        disponible= true;
                    }
                }

                if (disponible) {
                    System.out.println("Habitacion disponible");
                    System.out.println("");
                    repetir = false;
                    break;
                } else {
                    System.out.println("Habitacion no disponible");
                    System.out.println("");
                    System.out.println("Ingrese una habitacion dispónible");
                    System.out.println("");
                    repetir= true;
                   
                }

                

            }


            System.out.print("Ingrese cantidad de noches: ");
            Noches[CantClient]= teclado.nextByte();
            System.out.print("Ingrese precio por noche: ");
            Precio[CantClient]= teclado.nextInt();
            teclado.nextLine();

            Total[CantClient] = (Noches[CantClient]*Precio[CantClient]);
            System.out.println("El valor total del cliente son: "+Total[CantClient]+" COP");


    


            System.out.println("------------------");
            System.out.println(" ");





         
           
           
            System.out.println("Cliente: "+Nombre[CantClient]+" En la habitacion "+Habitacion[CantClient]+" Un total de "+Total[CantClient]+" COP");
            


           

            System.out.println("Hay nuevo cliente?");
            respuesta = teclado.next();
            
            if (respuesta.equals("si")) {
                CantClient++;
            }
           
            teclado.nextLine();
            System.out.println("hay "+(CantClient+1)+" clientes");
            i++;
        } while (CantClient>=i);

        

        teclado.close();
    }
}
