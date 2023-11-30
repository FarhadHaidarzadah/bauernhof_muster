package bauernhof_muster;

public class Handgranate implements IFressbar {
    public void zuenden() {
        System.out.println("Boom!");
    }

    @Override
    public void wirdGefressen(int menge) {
        zuenden();
    }
}