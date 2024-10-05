package application;

import entities.Rent;

import java.util.Scanner;

public class MainRent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Room: ");
            int roomNumber = scanner.nextInt();

            rents[roomNumber] = new Rent(name, email);

        }

        System.out.println();
        System.out.println("busy rooms");
        for (int i = 0; i < 10; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }

    }

}
