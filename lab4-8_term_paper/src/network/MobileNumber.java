package network;

import Tariff.BaseTariff;

public class MobileNumber {
    String number;
    BaseTariff tariff;
    Customer user;

    double balance;

    public MobileNumber(String number, BaseTariff tariff, Customer user, double balance) {
        this.number = number;
        this.tariff = tariff;
        this.user = user;
        this.balance = balance;

    }


    @Override
    public String toString() {
        return "MobileNumber{" +
                "number='" + number + '\'' +
                ", tariff=" + tariff +
                ", user=" + user +
                '}';
    }

    public void setTariff(BaseTariff tariff) {
        this.tariff = tariff;
    }

    public void setUser(Customer user) {
        this.user = user;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
