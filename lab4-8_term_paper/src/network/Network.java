package network;

import Tariff.BaseTariff;

import java.util.List;

public class Network {

    // контакти моб оператору
    private String companyName;
    private String companyNumber;
    private String companyEmail;

    private List<BaseTariff> operatorAvailableTariffs;
    private List<BaseTariff> operatorArchiveTariffs;

    private List<Customer> operatorCustomers;

    private List<MobileNumber> operatorNumbers;

    private List<Abroad> operatorListAbroad;


    public void addTariff(/*BaseTariff tariff*/) {
        /*operatorAvailableTariffs.add(tariff);*/
    }

    public void archiveTariff(/*BaseTariff tariff*/) {
        /*operatorArchiveTariffs.add(tariff);*/
    }

    public void showTariffs() {

    }

    public void deleteTariff() {

    }

    public void addNumber() {

    }

    public void addCustomer() {

    }

    public void addAbroad() {

    }

    public void showAbroad() {

    }

    public void numberCustomers() {

    }

    public void sortTariffs() {

    }

    public void getTariff() {

    }

    public List<BaseTariff> getOperatorAvailableTariffs() {
        return operatorAvailableTariffs;
    }
}
