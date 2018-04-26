package model;

public class Samochod {

    private String marka;
    private String model;
    private int rocznik;

    public Samochod(String marka, String model, int rocznik) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rocznik=" + rocznik +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Samochod samochod = (Samochod) o;

        if (rocznik != samochod.rocznik) return false;
        if (marka != null ? !marka.equals(samochod.marka) : samochod.marka != null) return false;
        return model != null ? model.equals(samochod.model) : samochod.model == null;
    }

    @Override
    public int hashCode() {
        int result = marka != null ? marka.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + rocznik;
        return result;
    }


}