 interface Animali {
    void verso();
    void muoviti();
}

 interface Parlante {
    void parla();
    void saluta();
}

 class Pappagallo implements Animali, Parlante {

    public void verso() {
        System.out.println("Il pappagallo fischia");
    }

    public void muoviti() {
        System.out.println("Il pappagallo vola");
    }

    public void parla() {
        System.out.println("Il pappagallo dice: Ciao!");
    }

    public void saluta() {
        System.out.println("Il pappagallo saluta con un battito d'ali");
    }
}

 class Cane implements Animali {

    public void verso() {
        System.out.println("Il cane abbaia");
    }

    public void muoviti() {
        System.out.println("Il cane corre");
    }
}

 class Gatto implements Animali {

    public void verso() {
        System.out.println("Il gatto miagola");
    }

    public void muoviti() {
        System.out.println("Il gatto cammina silenziosamente");
    }
}

public class AnimaliMain {

    public static void main(String[] args) {
        Animali pappagallo = new Pappagallo();
        Animali cane = new Cane();
        Animali gatto = new Gatto();

        System.out.println("Pappagallo:");
        pappagallo.verso();
        pappagallo.muoviti();

        System.out.println("\nCane:");
        cane.verso();
        cane.muoviti();

        System.out.println("\nGatto:");
        gatto.verso();
        gatto.muoviti();

        if (pappagallo instanceof Parlante) {
            Parlante parlante = (Parlante) pappagallo;
            parlante.parla();
            parlante.saluta();
        }
    }
}
