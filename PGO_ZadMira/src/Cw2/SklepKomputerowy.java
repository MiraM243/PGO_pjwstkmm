package Cw2;

import java.time.LocalDate;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public void dodajProdukt(Produkt produkt1) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt1;
        } else {
            System.out.println("Nie można dodać więcej produktów.");
        }
    }

    public void dodajKlienta(Klient klient1) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient1;
        } else {
            System.out.println("Nie można dodać więcej klientów.");
        }
    }

    public Zamowienie utworzZamowienie(
            Klient klient1,
            Produkt[] produktyZamowienia1,
            int[] ilosciZamowienia1) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(liczbaZamowien);
        zamowienia[liczbaZamowien++] = zamowienie;
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.setIlosci(ilosciZamowienia1);
        zamowienie.setDataZamowienia(LocalDate.now().toString());
        zamowienie.setStatus("Nowe");

        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        if (zamowienie == null) return;

        Produkt[] produktyZamowienia = zamowienie.getProdukty();
        int[] ilosciZamowienia = zamowienie.getIlosci();

        for (int i = 0; i < produktyZamowienia.length; i++) {
            for (Produkt produkt : produkty) {
                if (produkt != null && produkt.getId() == produktyZamowienia[i].getId()) {
                    if (produkt.getIloscWMagazynie() >= ilosciZamowienia[i]) {
                        produkt.setIloscWMagazynie(produkt.getIloscWMagazynie() - ilosciZamowienia[i]);
                    } else {
                        System.out.println("Brak wystarczającej ilości produktu: " + produkt.getNazwa());
                    }
                }
            }
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie != null && zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
                return;
            }
        }
        System.out.println("Nie znaleziono zamówienia o ID: " + idZamowienia);
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        System.out.println("\nProdukty w kategorii: " + kategoria);
        boolean znaleziono = false;

        for (Produkt produkt : produkty) {
            if (produkt != null && produkt.getKategoria().equalsIgnoreCase(kategoria)) {
                System.out.println(produkt);
                znaleziono = true;
            }
        }

        if (!znaleziono) {
            System.out.println("Brak produktów w tej kategorii.");
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("\nZamówienia klienta o ID: " + idKlienta);
        boolean znaleziono = false;

        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie != null && zamowienie.getKlient().getId() == idKlienta) {
                System.out.println(zamowienie);
                znaleziono = true;
            }
        }

        if (!znaleziono) {
            System.out.println("Brak zamówień dla tego klienta.");
        }
    }
}
