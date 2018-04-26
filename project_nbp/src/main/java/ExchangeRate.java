import com.google.gson.annotations.SerializedName;

class ExchangeRate {
    @SerializedName("no")
    String no;

    @SerializedName("effectiveDate")
    String effectiveDate;

    @SerializedName("mid")
    double mid;

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", mid=" + mid +
                '}';
    }
}
