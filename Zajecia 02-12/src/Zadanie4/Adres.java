package Zadanie4;

public class Adres{
    private String miejscowosc;
    private String ulica;
    private String kodPocztowy;
    private int nrBudynku;

    public Adres(String miejscowosc, String ulica, String kodPocztowy, int nrBudynku) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.nrBudynku = nrBudynku;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public int getNrBudynku() {
        return nrBudynku;
    }

    public void setNrBudynku(int nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adres adres = (Adres) o;

        if (nrBudynku != adres.nrBudynku) return false;
        if (miejscowosc != null ? !miejscowosc.equals(adres.miejscowosc) : adres.miejscowosc != null) return false;
        if (ulica != null ? !ulica.equals(adres.ulica) : adres.ulica != null) return false;
        return kodPocztowy != null ? kodPocztowy.equals(adres.kodPocztowy) : adres.kodPocztowy == null;
    }

    @Override
    public int hashCode() {
        int result = miejscowosc != null ? miejscowosc.hashCode() : 0;
        result = 31 * result + (ulica != null ? ulica.hashCode() : 0);
        result = 31 * result + (kodPocztowy != null ? kodPocztowy.hashCode() : 0);
        result = 31 * result + nrBudynku;
        return result;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miejscowosc='" + miejscowosc + '\'' +
                ", ulica='" + ulica + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", nrBudynku=" + nrBudynku +
                '}';
    }
}