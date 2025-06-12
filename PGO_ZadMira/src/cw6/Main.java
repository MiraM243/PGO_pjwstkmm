package cw6;

public class Main {
    public static void main(String[] args) {
        Ssak lew = new Ssak("Lew", 10) {
            @Override
            public String wydajDzwiek() {
                return "Roar";
            }

            @Override
            public String poruszajSie() {
                return "Gonie antylope";
            }

            @Override
            public void wyswietlInformacje() {
                System.out.println("Jestem " + nazwa + " krzycze: " + wydajDzwiek() + " jem mieso");
            }
        };

        Ptak orzel = new Ptak("Orzel", 3) {
            @Override
            public String wydajDzwiek() {
                return "ARGGGHH";
            }

            @Override
            public String poruszajSie() {
                return "Latam nad mysza";
            }

            @Override
            public void wyswietlInformacje() {
                System.out.println("Jestem " + nazwa + " krzycze: " + wydajDzwiek() + " jem myszy");
            }
        };

        Gad krokodyl = new Gad("Krokodyl", 15) {
            @Override
            public String wydajDzwiek() {
                return "grrrr";
            }

            @Override
            public String poruszajSie() {
                return "Leze";
            }

            @Override
            public void wyswietlInformacje() {
                System.out.println("Jestem " + nazwa + " krzycze: " + wydajDzwiek() + " jestem leniwy");
            }
        };

        Zwierze[] zoo = new Zwierze[3];
        zoo[0] = lew;
        zoo[1] = orzel;
        zoo[2] = krokodyl;

        for (Zwierze zwierze : zoo) {
            zwierze.wyswietlInformacje();
            System.out.println("Dźwięk: " + zwierze.wydajDzwiek());
            System.out.println("Ruch: " + zwierze.poruszajSie());
            System.out.println("---------------");
        }
    }
}
