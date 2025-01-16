public class Prodotto {
    // Attributi privati
    private String nome;
    private double prezzo;
    private int quantità;

    public Prodotto(String nome, double prezzo, int quantità) {
        setNome(nome);
        setPrezzo(prezzo);
        setQuantità(quantità);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Il prezzo deve essere maggiore di zero.");
        }
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        if (quantità >= 0) {
            this.quantità = quantità;
        } else {
            System.out.println("La quantità deve essere maggiore o uguale a zero.");
        }
    }

    public double calcolaValoreTotale() {
        return prezzo * quantità;
    }

    public static void main(String[] args) {
        Prodotto p = new Prodotto("PC", 500 , 5);

        System.out.println("Il valore totale del prodotto è: " + p.calcolaValoreTotale());
        
        p.setPrezzo(1000);
        p.setQuantità(5);

        System.out.println("Il nuovo valore totale del prodotto è: " + p.calcolaValoreTotale());
    }
}