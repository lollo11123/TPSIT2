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

public class VeicoloMain {
    public static void main(String[] args) {
        Veicolo toyota1 = new Veicolo("Toyota", "Yaris");
        Veicolo lancia1 = new Veicolo("Lancia", "Delta");

        System.out.println("\nDettagli Veicolo:");
        toyota1.stampaDettagli();
        System.out.println("\nDettagli Veicolo:");
        lancia1.stampaDettagli();
    }
}


