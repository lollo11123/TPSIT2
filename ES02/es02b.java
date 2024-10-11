public class es02b {
    

 
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Inserisci una sequenza di numeri.");
            return;
        }

        final int A = 999999;
        final int B = -999999;

        int somma = 0;
        int massimo = B;
        int minimo = A;
        int conteggio = 0;

        for (int indice = 0; indice < args.length; indice++) {
            int numero;

            try {
                numero = Integer.parseInt(args[indice]);
            } catch (NumberFormatException e) {
                System.out.println("Errore: '" + args[indice] + "' non è un numero valido.");
                continue;
            }

            if (numero >= 0) {
                somma += numero;
                if (numero > massimo) massimo = numero;
                if (numero < minimo) minimo = numero;
                conteggio++;
            }
        }

        if (conteggio > 0) {
            System.out.println("Somma: " + somma);
            System.out.println("Media: " + (double) somma / conteggio);
            System.out.println("Numero massimo: " + massimo);
            System.out.println("Numero minimo: " + minimo);
        } else {
            System.out.println("Nessun numero valido inserito.");
        }
    }
}

