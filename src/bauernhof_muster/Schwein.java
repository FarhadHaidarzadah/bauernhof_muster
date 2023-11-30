package bauernhof_muster;

public class Schwein extends ATier{
    public static int schweineZaehler = 0;
    public static final double PI = 3.1415;

    //Konstruktor
    public Schwein() {
        super("Musterschwein", 80);
        schweineZaehler++;
    }

    public Schwein(String name, int gewicht) {
        super(name, gewicht);
        schweineZaehler++;
    }

    //Methoden

    @Override
    public void lautGeben() {
        System.out.println("Grunz!");
    }

    //Getter-Setter
    public String toString() {
        return "Schwein" + super.toString();
    }

}
