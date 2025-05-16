import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen = new ArrayList<>();
    private ArrayList<Klient> listaKlientow = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena) {
        listaWydarzen.add(new Wydarzenie(nazwa, cena));
    }

    public void dodajKlienta(Klient klient) {
        listaKlientow.add(klient);
    }

    public void dodajKlienta(String imie, String nazwisko, String email) {
        listaKlientow.add(new Klient(imie, nazwisko, email));
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostepneMiejsca() > 0) {
            klient.dodajRezerwacje(wydarzenie);
            wydarzenie.zarezerwujMiejsce();
        }
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzen) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : listaKlientow) {
            if (k.getNazwisko().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie w = znajdzWydarzenie(nazwa);
        if (w != null) {
            w.setCena(nowaCena);
        }
    }
}