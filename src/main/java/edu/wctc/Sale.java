package edu.wctc;

public class Sale
{

    private String customer;
    private String country;
    private double amount;

    private double tax;

    private double shipping = 0;


    public Sale (String customer, String country, double amount, double tax)
    {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public void setShipping(double shipping) {
        this.shipping = Math.max(shipping, 0);
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public double getShipping() {
        return shipping;
    }

}
