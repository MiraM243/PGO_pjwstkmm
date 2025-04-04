package Cw2;

public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public void setCena(double cena){
        if(cena < 0){
            this.cena = -cena;
        }
        this.cena = cena;
    }

    public double getCena(){
        return this.cena;
    }

    public void wyswietlInformacje(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Produkt: " + nazwa + " | Kategoria: " + kategoria + " | Cena: " + cena + " zł | Ilość w magazynie: " + iloscWMagazynie;
    }
}
