package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vetor = new double[n];

        for (int i=0; i<n; i++){
            vetor[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vetor[i];
        }
        double result = sum / n;

        System.out.printf("Average: %.2f%n", result);

    }
}
