package sda.oop.bank;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String firstName;
    public String lastName;
    public String idCode;
    public BigDecimal salary;
    public String occupation;
    public LocalDate dateOfBirth;
    public Bank bank;
    public Boolean isActive;
    public List <Account> accounts = new ArrayList<>();



    public Integer getAge() {
        if (this.dateOfBirth != null) {
            return Long.valueOf(dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS)).intValue();
        } else {
            System.out.println("Please enter customer date of birth first");
            return 0;
        }

    }
    public String toString(){
        return String.format("First name: %s, Last name: %s, Occupation: %s, account number: %s ", this.firstName, this.lastName, this.occupation, this.accounts);
    }


}
