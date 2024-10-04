package application;

import entities.ProductArray;

import java.util.Scanner;

public class MainProductArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ProductArray[] vetor = new ProductArray[n];

        for (int i=0; i<vetor.length; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vetor[i] = new ProductArray(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vetor.length; i++){
            sum += vetor[i].getPrice();
        }
        double result = sum / n;

        System.out.printf("Average: %.2f%n", result);


    }

}
