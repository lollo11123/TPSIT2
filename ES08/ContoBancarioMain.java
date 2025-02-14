import java.io.*;

class ContoBancario {
    protected String titolare;
    protected double saldo;

    public ContoBancario(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public void preleva(double importo) {
        if (importo < 0) {
            System.out.println("Errore: L'importo del prelievo non può essere negativo.");
        } else if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato.");
        } else {
            System.out.println("Saldo insufficiente per il prelievo.");
        }
    }

    public void deposita(double importo) {
        if (importo < 0) {
            System.out.println("Errore: L'importo del deposito non può essere negativo.");
        } else {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato.");
        }
    }

    public void stampaSaldo() {
        System.out.println("Saldo attuale: " + saldo);
    }
}

class ContoCorrente extends ContoBancario {
    private double limiteSpesa;

    public ContoCorrente(String titolare, double saldo, double limiteSpesa) {
        super(titolare, saldo);
        this.limiteSpesa = limiteSpesa;
    }

    public void preleva(double importo) {
        if (importo < 0) {
            System.out.println("Errore: L'importo del prelievo non può essere negativo.");
        } else if (importo <= saldo + limiteSpesa) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato.");
        } else {
            System.out.println("Saldo insufficiente o limite di spesa superato.");
        }
    }
}

class ContoRisparmio extends ContoBancario {
    private double tassoInteresse;

    public ContoRisparmio(String titolare, double saldo, double tassoInteresse) {
        super(titolare, saldo);
        this.tassoInteresse = tassoInteresse;
    }

    public void calcolaInteressi() {
        double interessi = saldo * tassoInteresse / 100;
        saldo += interessi;
        System.out.println("Interessi di " + interessi + " aggiunti al saldo.");
    }
}

public class ContoBancarioMain {
    public static void main(String[] args) {
        ContoCorrente contoCorrente = new ContoCorrente("Nardella", 1000.0, 500.0);
        ContoRisparmio contoRisparmio = new ContoRisparmio("Maria", 2000.0, 2.5);

        System.out.println("Operazioni su ContoCorrente:");
        contoCorrente.deposita(500);
        contoCorrente.preleva(1200);
        contoCorrente.preleva(700);
        contoCorrente.preleva(-100);
        contoCorrente.stampaSaldo();

        System.out.println();

        System.out.println("Operazioni su ContoRisparmio:");
        contoRisparmio.deposita(300);
        contoRisparmio.calcolaInteressi();
        contoRisparmio.deposita(-50);
        contoRisparmio.stampaSaldo();
    }
}