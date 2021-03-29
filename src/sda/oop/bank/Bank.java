package sda.oop.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    public String name;
    public String address;
    public String city;
    public String country;
    public Integer numberOfCustomer;
    public int numberOfActiveCustomer;
    public Integer numberOfEmployee;
    public LocalDate establishedDate;

    private String [] someNewField;

//    public Customer[] customerArrays = new Customer[2]; AVOID USING ARRAYS DO TO IT HAS FIXED LENGTH
//    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 2
    public List <Customer>customers = new ArrayList<>();

public String toString (){
    return String.format("Bank name: %s, City: %s, Country: %s, Customers: %s", this.name, this.city, this.country, this.customers);
}


}

