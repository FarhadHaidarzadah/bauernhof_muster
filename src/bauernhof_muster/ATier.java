package bauernhof_muster;

import java.util.Objects;

public abstract class ATier {
    //Attribute
    private String name;
    private int gewicht;

    public ATier(String name, int gewicht) {
        this.setName(name);
        this.setGewicht(gewicht);
    }

    public ATier() {
        this.setName("Mustertier");
        this.setGewicht(50);
    }

    //Methoden
    public void fressen(int menge, IFressbar f) {
        this.setGewicht(this.getGewicht() + menge);
        f.wirdGefressen(menge);
    }

    public void laufen(int schritte) {
        this.setGewicht(this.getGewicht() - schritte);
    }

    public abstract void lautGeben();

    //GetterSetter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGewicht() {
        return gewicht;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }


    @Override
    public String toString() {
        return "name" + name + ", gewicht=" + gewicht ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj  == null)
        return false;
        if (getClass() != obj.getClass());
        ATier other = (ATier) obj;
        return gewicht == other.gewicht && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gewicht);
    }
}
