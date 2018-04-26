package model;

import java.time.LocalDate;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private double waga;
    private int wzrost;
    private int pensja;
    private String adres;
    private String miejscowosc;
    private String kodPocztowy;
    private String przegladarka;
    private Samochod samochod;
    private Plec plec;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, double waga, int wzrost, int pensja, String adres, String miejscowosc, String kodPocztowy, String przegladarka, Samochod samochod, Plec plec, LocalDate dataUrodzenia, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.waga = waga;
        this.wzrost = wzrost;
        this.pensja = pensja;
        this.adres = adres;
        this.miejscowosc = miejscowosc;
        this.kodPocztowy = kodPocztowy;
        this.przegladarka = przegladarka;
        this.samochod = samochod;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = wiek;
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

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getPrzegladarka() {
        return przegladarka;
    }

    public void setPrzegladarka(String przegladarka) {
        this.przegladarka = przegladarka;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", waga=" + waga +
                ", wzrost=" + wzrost +
                ", pensja=" + pensja +
                ", adres='" + adres + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", przegladarka='" + przegladarka + '\'' +
                ", samochod=" + samochod +
                ", plec=" + plec +
                ", dataUrodzenia=" + dataUrodzenia +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pracownik pracownik = (Pracownik) o;

        if (Double.compare(pracownik.waga, waga) != 0) return false;
        if (wzrost != pracownik.wzrost) return false;
        if (pensja != pracownik.pensja) return false;
        if (wiek != pracownik.wiek) return false;
        if (imie != null ? !imie.equals(pracownik.imie) : pracownik.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(pracownik.nazwisko) : pracownik.nazwisko != null) return false;
        if (adres != null ? !adres.equals(pracownik.adres) : pracownik.adres != null) return false;
        if (miejscowosc != null ? !miejscowosc.equals(pracownik.miejscowosc) : pracownik.miejscowosc != null)
            return false;
        if (kodPocztowy != null ? !kodPocztowy.equals(pracownik.kodPocztowy) : pracownik.kodPocztowy != null)
            return false;
        if (przegladarka != null ? !przegladarka.equals(pracownik.przegladarka) : pracownik.przegladarka != null)
            return false;
        if (samochod != null ? !samochod.equals(pracownik.samochod) : pracownik.samochod != null) return false;
        if (plec != pracownik.plec) return false;
        return dataUrodzenia != null ? dataUrodzenia.equals(pracownik.dataUrodzenia) : pracownik.dataUrodzenia == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        temp = Double.doubleToLongBits(waga);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + wzrost;
        result = 31 * result + pensja;
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        result = 31 * result + (miejscowosc != null ? miejscowosc.hashCode() : 0);
        result = 31 * result + (kodPocztowy != null ? kodPocztowy.hashCode() : 0);
        result = 31 * result + (przegladarka != null ? przegladarka.hashCode() : 0);
        result = 31 * result + (samochod != null ? samochod.hashCode() : 0);
        result = 31 * result + (plec != null ? plec.hashCode() : 0);
        result = 31 * result + (dataUrodzenia != null ? dataUrodzenia.hashCode() : 0);
        result = 31 * result + wiek;
        return result;
    }
}