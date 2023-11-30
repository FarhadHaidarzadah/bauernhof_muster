package bauernhof_muster;

public class Bauernhof_Muster {

    public static void main(String[] args) {
        System.out.println("Anzahl Schweine: " + Schwein.schweineZaehler);

        Schwein s1 = new Schwein();
        Schwein s2 = new Schwein();
        Schwein s3 = s1;
       Schaf schaf1= new Schaf();
       Kartoffel k = new Kartoffel();

        System.out.println("Schwein: "+ s1);
        System.out.println("Schwein: "+ s3);

        if (s1== s3) {
            System.out.println("Die Schweine haben die gleiche Speicheradresse");
        }


        //Vergleich auf Speicheradresse


        //Vergleich auf werte
        if (s1.equals(s3)) {
            System.out.println("Die Schweine haben die gleich werte");
        }
//		ATier[] tierListe = new ATier[2];
//		tierListe[0] = new Schaf("Klara", 80);
//		tierListe[1] = new Schwein("Uwe", 120);
//
//		for(int i = 0; i < tierListe.length; i++) {
//			tierListe[i].lautGeben();
//			if(tierListe[i] instanceof Schaf) {
//				((Schaf) tierListe[i]).karate();
//			}
//		}

//		Schwein schwein1 = new Schwein("Klara", 80);
//		Schaf schaf1 = new Schaf("Willi", 30);
//
//		Kartoffel k1 = new Kartoffel(20);
//		Moehre m1 = new Moehre(15);
//
//		System.out.println("Gewicht vor dem Fressen. " + schaf1.getGewicht());
//		System.out.println("Knollenanzahl: " + m1.getRuebenlaenge());
//
//		schaf1.fressen(5, m1);
//		schaf1.fressen(5, k1);
//
//		schaf1.lautGeben();
//		schwein1.lautGeben();
//
//		System.out.println("Gewicht nach dem Fressen. " + schaf1.getGewicht());
//		System.out.println("Knollenanzahl: " + m1.getRuebenlaenge());


//		Schwein s1 = new Schwein("Hugo", 90);
//		Schwein s2 = new Schwein("Klara", 80);
//
//		System.out.println(s2.name + ", " + s2.gewicht);

//		String schwein1Name = "Hugo";
//		int schwein1Gewicht = 90;
//
//		int kartoffel1Knollenanzahl = 10;
//
//		System.out.println(schwein1Name);
//		System.out.println(schwein1Gewicht);
//		System.out.println(kartoffel1Knollenanzahl);
//
//		//Schwein frisst
//		schwein1Gewicht = 95;
//		kartoffel1Knollenanzahl = 5;
//
//		System.out.println(schwein1Name);
//		System.out.println(schwein1Gewicht);
//		System.out.println(kartoffel1Knollenanzahl);
    }

}
