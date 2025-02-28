abstract class Animale {

    public abstract void emettiVerso();

    public void dormi() {
        System.out.println("Zzz...");
    }
}

class Cane extends Animale {

    public void emettiVerso() {
        System.out.println("Bau!");
    }
}

class Gatto extends Animale {

    public void emettiVerso() {
        System.out.println("Miao!");
    }
}

public class AnimaleMain {
    public static void main(String[] args) {

        Animale[] animali = { new Cane(), new Gatto(), new Cane(), new Gatto() };

        for (Animale animale : animali) {
            animale.emettiVerso();
        }
    }
}
