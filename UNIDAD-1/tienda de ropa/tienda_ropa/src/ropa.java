public class ropa {
    public static void main(String[] args) throws Exception {
        final float CAMISA = 25;
        final float PANTALON = 30;

        Double DesCam = CAMISA - (CAMISA*0.15);
        double DesPan = PANTALON - (PANTALON*0.15);

        System.out.println("Precio total camisa "+ DesCam);
        System.out.println("Precio total Pantalon " + DesPan);

        double DesCamDoble = DesCam - (DesCam*0.05);

        System.out.println("Precio del descuento de dos camisas");
        System.out.println("camisa 1 "+DesCam);
        System.out.println("precio camisa 2 "+ DesCamDoble);
        double TotalCam = DesCamDoble+DesCam;
        
        
        System.out.println("Total a pagar por las camisas "+TotalCam);

    }
}