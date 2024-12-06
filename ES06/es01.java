import java.util.Random;


public class es01 {
    public static void main(String[] args) {
        if (args.length != 2 || (!args[0].equals("-a") && !args[0].equals("-m")) || !args[1].matches("-?\\d+")) {
            System.out.println("Errore: devi scrivere -a ed un valore oppure -m ed un valore");
            return;
        }


        int[] array = new Random().ints(10, 0, 21).toArray();
        int valore = Integer.parseInt(args[1]);
        boolean somma = args[0].equals("-a");


        for (int i = 0; i < array.length; i++) array[i] = somma ? array[i] + valore : array[i] * valore;


        for (int num : array) System.out.print(num + " ");
        System.out.println();
    }
}


