class Studente {

    private String nome;
    private String cognome;
    private double mediaVoti;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Sconosciuto";
            System.out.println("Errore: nome non valido.");
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if (cognome != null && !cognome.trim().isEmpty()) {
            this.cognome = cognome;
        } else {
            this.cognome = "Sconosciuto";
            System.out.println("Errore: cognome non valido.");
        }
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        if (mediaVoti >= 0 && mediaVoti <= 10) {
            this.mediaVoti = mediaVoti;
        } else {
            this.mediaVoti = 0.0;
            System.out.println("Errore: media voti non valida. Impostata a 0.0.");
        }
    }

    public void stampaDettagli() {
        System.out.println("Studente: " + nome + " " + cognome + ", Media Voti: " + mediaVoti);
    }
    public class  StudenteMain {
        public static void main(String[] args) {
        Studente studente = new Studente();

        studente.setNome("");
        studente.setCognome("Franceschini");
        studente.setMediaVoti(10); 
        studente.stampaDettagli();
        }
    
    } 
    
}
