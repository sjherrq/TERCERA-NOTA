public class Funciones {
    
    public static double depositar(double saldo, double cantidad) {
        return saldo + cantidad;
    }

    public static double retirar(double saldo, double cantidad) {

        if (cantidad > saldo || cantidad <= 0) {
            System.out.println("Cantidad no valida");
            return saldo;
        }

        return saldo - cantidad;
    }

}
