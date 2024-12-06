public class array3 {
    public static void main(String[] args) {
        int[][] tabella = new int[12][12];




        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                tabella[i][j] = (i + 1) * (j + 1);
            }
        }


        System.out.println("\nTabella Pitagorica:");
        for (int[] riga : tabella) {
            for (int valore : riga) {
                System.out.print(String.format("%4d", valore)); // Allineamento della stampa
            }
            System.out.println();
        }
    }
}


