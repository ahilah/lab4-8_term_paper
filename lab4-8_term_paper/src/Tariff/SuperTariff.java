package Tariff;

public class SuperTariff extends BaseTariff {

    double numberMinutesOtherNetwork;
    double numberMinutesOtherCountries;

    SuperTariff(String nameTariff, int SMSNumber, double numberMinutesThisOperator, int priceTariff,
                String tariffID, double numberMinutesOtherNetwork, double numberMinutesOtherCountries) {
        super(nameTariff, SMSNumber, numberMinutesThisOperator, priceTariff, tariffID);
        this.numberMinutesOtherNetwork = numberMinutesOtherNetwork;
        this.numberMinutesOtherCountries = numberMinutesOtherCountries;
    }

    public void setNumberMinutesOtherNetwork(double numberMinutesOtherNetwork) {
        this.numberMinutesOtherNetwork = numberMinutesOtherNetwork;
    }

    public void setNumberMinutesOtherCountries(double numberMinutesOtherCountries) {
        this.numberMinutesOtherCountries = numberMinutesOtherCountries;
    }

    @Override
    public String toString() {
        return "Super Tariff (" + super.toString() +
                " number of minutes on other network: " + numberMinutesOtherNetwork +
                ", number of minutes on other countries: " + numberMinutesOtherCountries + ")";
    }

}
