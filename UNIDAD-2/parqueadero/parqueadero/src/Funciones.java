public class Funciones {
    
public static boolean buscarPlaca(String[] placas, String placa) {

    for (int i = 0; i < placas.length; i++) {

        if (placas[i] != null && placas[i].equalsIgnoreCase(placa)) {
            return true;
        }
    }

    return false;
}

public static void mostrarVehiculos(String[] placas) {

    for (int i = 0; i < placas.length; i++) {

        if (placas[i] != null) {
            System.out.println("Espacio " + (i + 1) + ": " + placas[i]);
        } else {
            System.out.println("Espacio " + (i + 1) + ": Disponible");
        }
    }
}

}
