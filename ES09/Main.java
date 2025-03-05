public interface Shape2D {
    double calcolaArea();
    double calcolaPerimetro();
}

public interface Shape3D {
    double calcolaVolume();
    double calcolaSuperficie();
}

public class Cerchio implements Shape2D {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return calcolaPi() * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * calcolaPi() * raggio;
    }

    private double calcolaPi() {
        return 3.14; 
    }
}

public class Rettangolo implements Shape2D {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    @Override
    public double calcolaArea() {
        return lunghezza * larghezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (lunghezza + larghezza);
    }
}

public class Sfera implements Shape3D {
    private double raggio;

    public Sfera(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcolaVolume() {
        return (4 / 3.0) * calcolaPi() * calcolaPotenza(raggio, 3);
    }

    @Override
    public double calcolaSuperficie() {
        return 4 * calcolaPi() * calcolaPotenza(raggio, 2);
    }

    private double calcolaPi() {
        return 3.14; 
    }

    private double calcolaPotenza(double base, int esponente) {
        double risultato = 1;
        for (int i = 0; i < esponente; i++) {
            risultato *= base;
        }
        return risultato;
    }
}

public class Cuboide implements Shape3D {
    private double lunghezza;
    private double larghezza;
    private double altezza;

    public Cuboide(double lunghezza, double larghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    @Override
    public double calcolaVolume() {
        return lunghezza * larghezza * altezza;
    }

    @Override
    public double calcolaSuperficie() {
        return 2 * (lunghezza * larghezza + lunghezza * altezza + larghezza * altezza);
    }
}

public class CalcolatoreGeometrico {

    public void stampaProprietàShape2D(Shape2D forma) {
        System.out.println("Area: " + forma.calcolaArea());
        System.out.println("Perimetro: " + forma.calcolaPerimetro());
    }

    public void stampaProprietàShape3D(Shape3D forma) {
        System.out.println("Volume: " + forma.calcolaVolume());
        System.out.println("Superficie: " + forma.calcolaSuperficie());
    }
}

public class Main {
    public static void main(String[] args) {
        Shape2D cerchio = new Cerchio(5);
        Shape2D rettangolo = new Rettangolo(4, 7);

        Shape3D sfera = new Sfera(5);
        Shape3D cuboide = new Cuboide(4, 7, 3);

        CalcolatoreGeometrico calcolatore = new CalcolatoreGeometrico();

        System.out.println("Proprietà del cerchio:");
        calcolatore.stampaProprietàShape2D(cerchio);

        System.out.println("\nProprietà del rettangolo:");
        calcolatore.stampaProprietàShape2D(rettangolo);

        System.out.println("\nProprietà della sfera:");
        calcolatore.stampaProprietàShape3D(sfera);

        System.out.println("\nProprietà del cuboide:");
        calcolatore.stampaProprietàShape3D(cuboide);
    }
}
