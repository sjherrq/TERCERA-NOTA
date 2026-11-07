public class Mensajeria {
    public static void main(String[] args) throws Exception {
        int entregas = Procesos.Entregas(0);
        int Arreglo[] = Procesos.Tiempos(entregas);
        int Entre10y60=0;
        int Mas60=0;
        int TotalTiempo=0;
        double Promedio;
        int MayorTiempo=Arreglo[0];
        for (int i = 0; i < entregas; i++) { 
            if (MayorTiempo<Arreglo[i]) {
                MayorTiempo=Arreglo[i];
            }
            if (Arreglo[i]>= 10 && Arreglo[i]<= 60) {
                Entre10y60++;
            } else {
                Mas60++;
            }
            TotalTiempo=TotalTiempo+Arreglo[i];
        }
        Promedio = (double)(TotalTiempo)/(entregas);
        System.out.println("Total entregas realizadas en la jornada: "+ entregas);
        System.out.println("Numero de entregas que tardaron entre 10 y 60 minutos: "+Entre10y60);
        System.out.println("Numero de entregas que tardaron mas de 60 minutos: "+Mas60);
        System.out.println("Tiempo total de entregas: "+TotalTiempo+" min");
        System.out.println("tiempo promedio de entregas: "+Promedio);
        System.out.println("mayor tiempo de entrega: "+MayorTiempo+" min");
    }
}
