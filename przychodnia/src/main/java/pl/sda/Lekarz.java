package pl.sda;

public class Lekarz {

    String id;
    String imie;
    String nazwisko;
    String tytul;

    public Lekarz (){};

    public Lekarz (String i, String im, String naz, String t) {
        id=i;
        imie=im;
        nazwisko=naz;
        tytul=t;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
}
