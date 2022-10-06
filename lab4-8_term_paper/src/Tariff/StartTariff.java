package Tariff;

public class StartTariff extends BaseTariff {

    double numberMinutesOtherNetwork;

    double numberMinutesOtherCountries;

    StartTariff(String nameTariff, int SMSNumber, double numberMinutesThisOperator, int priceTariff, String tariffID) {
        super(nameTariff, SMSNumber, numberMinutesThisOperator, priceTariff, tariffID);
    }
}
