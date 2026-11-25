package org.example.account;// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Main Menu:");
            System.out.println("1. View Account Balances");
            System.out.println("2. Deposit to Account");
            System.out.println("3. Withdraw from Account");
            System.out.println("4. Exit");
            System.out.println("5. Transfer Between Accounts");
            System.out.print("Enter your choice: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    // Display balances
                    System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                    System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
                    break;
                case 2:
                    // Deposit to account
                    System.out.print("Enter deposit amount for account1: "); // prompt
                    double depositAmount = input.nextDouble(); // obtain user input
                    System.out.printf("%nadding %.2f to account1 balance%n%n",
                            depositAmount);
                    account1.deposit(depositAmount); // add to account1's balance

                    System.out.print("Enter deposit amount for account2: "); // prompt
                    depositAmount = input.nextDouble(); // obtain user input
                    System.out.printf("%nadding %.2f to account2 balance%n%n",
                            depositAmount);
                    account2.deposit(depositAmount); // add to account2's balance
                    break;
                case 3:
                    // Withdraw from account
                    System.out.print("Enter withdrawal amount for account1: ");
                    double withdrawalAmount = input.nextDouble();
                    if (account1.getBalance() >= withdrawalAmount) {
                        account1.withdraw(withdrawalAmount);
                        System.out.printf("%nWithdrew %.2f from account1 balance%n%n", withdrawalAmount);
                    } else {
                        System.out.println("Insufficient funds in account1.\n");
                    }

                    System.out.print("Enter withdrawal amount for account2: ");
                    withdrawalAmount = input.nextDouble();
                    if (account2.getBalance() >= withdrawalAmount) {
                        account2.withdraw(withdrawalAmount);
                        System.out.printf("%nWithdrew %.2f from account2 balance%n%n", withdrawalAmount);
                    } else {
                        System.out.println("Insufficient funds in account2.\n");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                case 5:
                    // Transfer between accounts
                    System.out.print("Enter transfer amount from account1 to account2: ");
                    double transferAmount = input.nextDouble();
                    account1.transfer(account2, transferAmount);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        } while (option != 4);

        input.close();
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