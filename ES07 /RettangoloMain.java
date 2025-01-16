class Rettangolo {
    private  int base; // Attributo immutabile
    private  int altezza; // Attributo immutabile

    // Costruttore
    public int Area() {
        return base * altezza;
    }
public void setBase(int base) {
    this.base = base;
    }
public void setAltezza(int altezza) {
    this.altezza = altezza;
        }
    }

   public class RettangoloMain {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo();
        r.setBase (10);
        r.setAltezza (20);
        }
    }