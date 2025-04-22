package cw4;

import java.util.ArrayList;

public class Playlista {
    private String nazwa;
    private ArrayList<String> listaUtworow = new ArrayList<>();

    public Playlista(String nazwa){
        this.nazwa = nazwa;
    }

    //TODO Getter, Setter do nazwy

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajUtwor(String nazwaUtworu){
        if(nazwaUtworu == null || nazwaUtworu.isBlank()){
            return;
        }
        if(listaUtworow.contains(nazwaUtworu)){
            return;
        }
        listaUtworow.add(nazwaUtworu);
    }

    public void usunUtwor(String nazwaUtworu){
        listaUtworow.remove(nazwaUtworu);
    }

    public void wyswietlUtwory(){
        System.out.println("Playlista: " + nazwa);
        for (int i = 0; i < listaUtworow.size(); i++) {
            System.out.println("Utwor: " + (i+1) + ": " + listaUtworow.get(i));
        }
    }

    public void wyszukajUtwory(String opis){
        if (opis == null) {
            opis="";
        }
        System.out.println("Playlista: " + nazwa);
        System.out.println("Nazwa utworu zawiera: " + opis);
        for (int i = 0; i < listaUtworow.size(); i++) {
            if(listaUtworow.get(i).contains(opis)){
                System.out.println("Utwor: " + (i+1) + ": " + listaUtworow.get(i));
            }
        }
    }
}
