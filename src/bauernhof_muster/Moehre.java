package bauernhof_muster;

public class Moehre extends AGemuese {
    //Attribute
    private int ruebenlaenge;

    //Konstuktor
    public Moehre(int ruebenlaenge) {
        this.setRuebenlaenge(ruebenlaenge);
    }
    public Moehre() {
        this.setRuebenlaenge(15);
    }

    //Methoden
    @Override
    public void wirdGefressen(int menge) {
        this.setRuebenlaenge(this.getRuebenlaenge() - menge);
    }

    //GetterSetter
    public int getRuebenlaenge() {
        return ruebenlaenge;
    }
    public void setRuebenlaenge(int ruebenlaenge) {
        this.ruebenlaenge = ruebenlaenge;
    }

}
