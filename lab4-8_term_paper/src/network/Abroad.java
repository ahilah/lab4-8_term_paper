package network;

public class Abroad {

    private String country;

    private double pricePerMinute;

    public Abroad(String country, double pricePerMinute) {
        this.country = country;
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public String toString() {
        return "Abroad{" +
                "country='" + country + '\'' +
                ", pricePerMinute=" + pricePerMinute +
                '}';
    }
}
