public class TriangoloFiglio {
    public static void main(String[] args) {
        int cateto1=3; 
        int cateto2=4;
        char Integer.parseInt(args[3]);
        char Integer.parseInt(args[4]);
        if (args.length != 2) {
            System.out.println("Devi passare due argomenti (i cateti del triangolo).");
            return;
        }

        int cateto1 = Integer.parseInt(args[3]);
        int cateto2 = Integer.parseInt(args[4]);

        double ipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        double perimetro = cateto1 + cateto2 + ipotenusa;

        System.out.println("Perimetro del triangolo: " + perimetro);
    }
}