import java.util.Scanner;

public class Calcolatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il primo numero: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Inserisci il secondo numero: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Inserisci l'operazione (somma, sottrazione, moltiplicazione, divisione): ");
            String operazione = scanner.nextLine();

            double risultato = 0;
            switch (operazione.toLowerCase()) {
                case "somma":
                    risultato = num1 + num2;
                    break;
                case "sottrazione":
                    risultato = num1 - num2;
                    break;
                case "moltiplicazione":
                    risultato = num1 * num2;
                    break;
                case "divisione":
                    if (num2 == 0) {
                        throw new ArithmeticException("Errore: Divisione per zero.");
                    }
                    risultato = num1 / num2;
                    break;
                default:
                    System.out.println("Operazione non valida.");
                    return;
            }

            System.out.println("Il risultato è: " + risultato);

        } catch (NumberFormatException e) {
            System.out.println("Errore: Devi inserire un numero valido.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore imprevisto: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}