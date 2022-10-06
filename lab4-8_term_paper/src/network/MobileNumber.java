package network;

import Tariff.BaseTariff;

public class MobileNumber {
    String number;
    BaseTariff tariff;
    Customer user;

    public MobileNumber(String number, BaseTariff tariff, Customer user) {
        this.number = number;
        this.tariff = tariff;
        this.user = user;

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
}
