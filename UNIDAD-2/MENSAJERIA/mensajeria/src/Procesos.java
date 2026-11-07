import java.util.Random;
public class Procesos {
    public static int Entregas(int entregas){
        Random aleatorio = new Random();
        entregas= aleatorio.nextInt(40)+1;
        return entregas;
    }
    public static int[] Tiempos(int entregas){
        int ArregloTiempos[] = new int[entregas];
        Random aleatorio = new Random();
        for (int i = 0; i < entregas; i++) {
            ArregloTiempos[i]=aleatorio.nextInt(111)+10;
            
        }
        return ArregloTiempos;
    }







}





