import java.util.Scanner;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] productos = {"Arroz", "Leche", "Huevos", "Pan", "Cafe"};
        double[] precios = {3000, 4500, 12000, 2000, 8000};
        int[] cantidades = new int[5];

        for (int i = 0; i < productos.length; i++) {

            System.out.println(productos[i] + " - $" + precios[i]);
            System.out.println("Cantidad:");

            cantidades[i] = leer.nextInt();
        }

        double total = Funciones.calcularTotal(precios, cantidades);
        double finalPagar = Funciones.aplicarDescuento(total);

        System.out.println("Total: $" + total);
        System.out.println("Total con descuento: $" + finalPagar);

        leer.close();
    }
