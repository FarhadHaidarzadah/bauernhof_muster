package bauernhof_muster;

public class Schaf extends ATier {
    //Konstruktor
    public Schaf() {
        super("Musterschaf", 80);
    }

    public Schaf(String name, int gewicht) {
        super(name, gewicht);
    }

    //Methoden

    @Override
    public void lautGeben() {
        System.out.println("Bl�k!");
    }

    public void karate() {
        System.out.println("Huha!");
    }

    //GetterSetter



}
