package Tariff;

public class SuperNetTariff extends BaseTariff {

    double numberMinutesOtherNetwork;
    double numberMinutesOtherCountries;
    double mobileInternet;

    SuperNetTariff(String nameTariff, int SMSNumber, double numberMinutesThisOperator, int priceTariff,
                   String tariffID, double numberMinutesOtherNetwork, double numberMinutesOtherCountries,
                   double mobileInternet) {
        super(nameTariff, SMSNumber, numberMinutesThisOperator, priceTariff, tariffID);
        this.numberMinutesOtherNetwork = numberMinutesOtherNetwork;
        this.numberMinutesOtherCountries = numberMinutesOtherCountries;
        this.mobileInternet = mobileInternet;
    }

    @Override
    public String toString() {
        return "Super Net Tariff (" + super.toString() +
                " number of minutes on other network: " + numberMinutesOtherNetwork +
                ", number of minutes on other countries: " + numberMinutesOtherCountries +
                ", GB of mobile Internet: " + mobileInternet + ")";
    }
}
