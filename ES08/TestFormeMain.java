class Forme {
    private String nome;

    public Forme(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("Forma: " + nome);
    }
}

class Cerchio extends Forme {
    private double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return raggio * raggio * 3.14;
    }

    public double calcolaPerimetro() {
        return 2 * 3.14 * raggio;
    }
}
class Rettangolo extends Forme {
    private double base, altezza;
    
    public Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }
    

    public double calcolaArea() {
        return base * altezza;
    }
    
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}
class Triangolo extends Forme {
    private double base, altezza, lato1, lato2, lato3;
    
    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
    
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}


public class TestFormeMain{
    public static void main (String[] args){
        Forme oggForme= new Forme("nome forme:");
        oggForme.calcolaArea();
        oggForme.calcolaPerimetro();
        oggForme.descrizione();

        Cerchio cerchio = new Cerchio(2);
        cerchio.calcolaArea();
        cerchio.calcolaPerimetro();
        cerchio.descrizione();

        Rettangolo rettangolo = new Rettangolo(2,3);
        rettangolo.calcolaArea();
        rettangolo.calcolaPerimetro();
        rettangolo.descrizione();

        Triangolo triangolo = new Triangolo(2,3);
        triangolo.calcolaArea();
        triangolo.calcolaPerimetro();
        triangolo.descrizione();
    }
}
