package net.demo.Entity;

public class Customer {
    int customerID;
    String customerName;
    String customerContractID;

    public Customer(){}

    public Customer(int customerID, String customerName, String customerContractID) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerContractID = customerContractID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContractID() {
        return customerContractID;
    }

    public void setCustomerContractID(String customerContractID) {
        this.customerContractID = customerContractID;
    }
}
