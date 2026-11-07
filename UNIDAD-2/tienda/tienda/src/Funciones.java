public class Funciones {

    public static double calcularTotal(double[] precios, int[] cantidades) {

        double total = 0;

        for (int i = 0; i < precios.length; i++) {
            total += precios[i] * cantidades[i];
        }

        return total;
    }

    public static double aplicarDescuento(double total) {

        if (total >= 100000) {
            return total * 0.90;
        }

        return total;
    }

}
