package network;

public class Customer {
    String name;
    String CustomerID;

    public Customer(String name, String CustomerID) {
        this.name = name;
        this.CustomerID = CustomerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                '}';
    }
}
