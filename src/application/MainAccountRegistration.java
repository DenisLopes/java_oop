package application;

import entities.AccountRegistration;

import java.util.Scanner;

public class MainAccountRegistration {

    public static void main(String[] args) {

        String accountHolderName;
        int accountNumber;
        char response;
        AccountRegistration registration;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accountHolderName: ");
        accountHolderName = scanner.nextLine();

        System.out.print("Enter the accountNumber: ");
        accountNumber = scanner.nextInt();

        System.out.print("Is there an initial deposit (y/n)? ");
        response = scanner.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            registration = new AccountRegistration(accountHolderName, accountNumber, initialDeposit);
        }
        else {
            registration = new AccountRegistration(accountHolderName,accountNumber);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(registration);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        registration.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(registration);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        registration.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(registration);

    }
}
