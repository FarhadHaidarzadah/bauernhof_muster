package bauernhof_muster;

public class Kartoffel extends AGemuese {
    //Attribute
    private int knollenanzahl;

    //Konstuktor
    public Kartoffel(int knollenanzahl) {
        this.setKnollenanzahl(knollenanzahl);
    }
    public Kartoffel() {
        this.setKnollenanzahl(15);
    }

    //Methoden
    @Override
    public void wirdGefressen(int menge) {
        this.setKnollenanzahl(this.getKnollenanzahl() - menge);
    }

    //GetterSetter
    public int getKnollenanzahl() {
        return knollenanzahl;
    }
    public void setKnollenanzahl(int knollenanzahl) {
        this.knollenanzahl = knollenanzahl;
    }
}
