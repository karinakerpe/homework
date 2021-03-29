package sda.oop.bank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BankApplication {

    public static void main(String[] args) {

        Account customer1Account = new Account();
        //full argument constractor
//        Account customerAccount = new Account("Salary account", "LV01KKBA1234567891234", "EUR", BigDecimal.valueOf(1500.00), null);
//        customerAccount.setName("New Salary account");
        customer1Account.setName("Salary account");
        customer1Account.setNumber("LV01KKBA1234567891234");
        customer1Account.setCurrency("EUR");
        customer1Account.setTransaction(null);
        customer1Account.setBalance(BigDecimal.valueOf(1500));


        Account customer2Account = new Account();
        customer2Account.setNumber("LV01KKBA1234567891235");
        customer2Account.setName("Nanny account");
        customer2Account.setCurrency("EUR");
        customer2Account.setBalance(BigDecimal.valueOf(30));

        Customer customer1 = new Customer();
        customer1.firstName = "Karina";
        customer1.lastName = "Kerpe";
        customer1.dateOfBirth = LocalDate.of(1984, 7, 13);
        customer1.idCode = "131313-13131";
        customer1.occupation = "Java developer";
        customer1.salary = BigDecimal.valueOf(2500.50);
        customer1.isActive = Boolean.TRUE;
        customer1.accounts.add(customer1Account);


        Customer customer2 = new Customer();
        customer2.firstName = "Emilija";
        customer2.lastName = "Princese";
        customer2.dateOfBirth = LocalDate.of(2014, 4, 1);
        customer2.idCode = "141414-14141";
        customer2.occupation = "kid";
        customer2.salary = BigDecimal.valueOf(30.05);
        customer2.isActive = Boolean.TRUE;
        customer2.accounts.add(customer2Account);

        Customer customer3 = new Customer();
        customer3.firstName = "Baby";
        customer3.lastName = "Boss";
        customer3.dateOfBirth = null;
        customer3.idCode = "010101-01011";
        customer3.occupation = null;
        customer3.salary = BigDecimal.valueOf(00.05);
        customer3.isActive = Boolean.FALSE;


        Bank bank = new Bank();
        bank.name = "Kerpe Bank";
        bank.city = "Riga";
        bank.country = "Latvia";
        bank.address = "Brivibas street 350";
        bank.establishedDate = LocalDate.of(2008, 1, 1);
        bank.numberOfCustomer = 54;
        bank.numberOfActiveCustomer = 5;
        bank.numberOfEmployee = 3;

        bank.customers.add(customer1);
        bank.customers.add(customer2);
        bank.customers.add(customer3);


        customer3.bank = bank;

        System.out.println("bank.name: " + bank.name);
//        System.out.println("bank.customer1.lastName and .firstname: " + bank.customer1.lastName + " " + bank.customer1.firstName);
        System.out.println("customer1.bank.name: " + customer3.bank.name);

        System.out.printf("Customer %s age is %d", customer3.firstName, customer3.getAge());
        System.out.println("\n" + customer3.toString());

        customer3.dateOfBirth = null;
        System.out.printf("Customer %s age is %d", customer3.firstName, customer3.getAge());
        customer3.dateOfBirth = LocalDate.of(2014, 4, 1);
        System.out.println(customer3.firstName + " " + customer3.lastName);


        System.out.printf("Name of customer 1: %s %s\n", customer1.firstName, customer1.lastName);
        System.out.printf("Name of customer 2: %s %s\n", customer3.firstName, customer3.lastName);

        System.out.println(customer1.toString());
        System.out.println(customer3.toString());

        System.out.println(bank.toString());
    }
}
