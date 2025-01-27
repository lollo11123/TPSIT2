class Veicolo {
    // Attributi
    String marca;
    String modello;

    // Costruttore
    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public void stampaDettagli() {
        System.out.println("Marca: " + marca);
        System.out.println("Modello: " + modello);
    }
}

/
class Auto extends Veicolo {
    
    int numeroPorte;

    public Auto(String marca, String modello, int numeroPorte) {
        super(marca, modello); 
        this.numeroPorte = numeroPorte;
    }

   
    public void stampaDettagli() {
        super.stampaDettagli(); 
        System.out.println("Numero Porte: " + numeroPorte);
    }
}


class Moto extends Veicolo {
    
    boolean haSidecar;

    public Moto(String marca, String modello, boolean haSidecar) {
        super(marca, modello); 
        this.haSidecar = haSidecar;
    }

    public void stampaDettagli() {
        super.stampaDettagli(); 
        System.out.println("Ha Sidecar: " + (haSidecar ? "Sì" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", "500", 5);
        Moto moto1 = new Moto("Harley-Davidson", "Iron 883", true);

        
        System.out.println("Dettagli Auto:");
        auto1.stampaDettagli();

        System.out.println("\nDettagli Moto:");
        moto1.stampaDettagli();
    }
}