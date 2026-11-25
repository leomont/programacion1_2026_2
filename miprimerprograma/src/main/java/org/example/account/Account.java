package org.example.account;

// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Account {
    private String cedula;
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // method that withdraws (subtracts) only a valid amount from the balance
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0.0 && withdrawalAmount <= balance) { // if the withdrawalAmount is valid
            balance = balance - withdrawalAmount; // subtract it from the balance
        } else {
            System.out.println("Withdrawal amount exceeds balance or is invalid.");
        }
    }

    // method to perform an internal transfer between two accounts
    public void transfer(Account targetAccount, double amount) {
        if (amount > 0.0 && amount <= this.balance) { // validate transfer amount
            this.withdraw(amount); // withdraw from the current account
            targetAccount.deposit(amount); // deposit into the target account
            System.out.printf("Successfully transferred %.2f to %s%n", amount, targetAccount.getName());
        } else {
            System.out.println("Transfer amount exceeds balance or is invalid.");
        }
    }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/