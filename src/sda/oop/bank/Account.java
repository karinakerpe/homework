package sda.oop.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
    public String getName() {
        if (!this.name.isEmpty()) {
            return name;
        } else {
            System.out.println("The name field is null");
            return "";
        }
    }
//full argument constractor
    public Account(String name, String number, String currency, BigDecimal balance, List<Transactions> transaction) {
//        if () vai ir tukši
        this.name = name;
        this.number = number;
        this.currency = currency;
        this.balance = balance;
        this.transaction = transaction;
    }

    public Account(){
//default constructor
}
    public Account (String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String number;
    private String currency;
    private BigDecimal balance;
    private List<Transactions> transaction = new ArrayList<>();

    public void setNumber(String number) {
        if (!number.isEmpty()) {
            this.number = number;
        } else {
            System.out.println("Please enter a valid number!!!");
        }
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setTransaction(List<Transactions> transaction) {
        this.transaction = transaction;
    }

    public String getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Transactions> getTransaction() {
        return transaction;
    }

    public String toString() {
        return String.format("Name: %s, Number: %s, Currency: %s, Balance: %s", this.name, this.number, this.currency, this.balance);
    }
}
