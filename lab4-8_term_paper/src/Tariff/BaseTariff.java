package Tariff;

public abstract class BaseTariff {
    String nameTariff;
    int SMSNumber;
    double numberMinutesThisOperator;
    int priceTariff;
    String tariffID;
    int numberOfUsers = 0;

    BaseTariff(String nameTariff, int SMSNumber, double numberMinutesThisOperator, int priceTariff, String tariffID) {
        System.out.println("");
    }
}
