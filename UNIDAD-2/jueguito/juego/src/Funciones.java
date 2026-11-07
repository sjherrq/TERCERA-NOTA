import java.util.Random;

public class Funciones {
    
    public static int atacar(int ataque) {
        return ataque;
    }

    public static int curar(int salud) {
        return salud + 20;
    }

    public static int atacarEnemigo() {
        Random aleatorio = new Random();
        return aleatorio.nextInt(11) + 5;
    }

}
