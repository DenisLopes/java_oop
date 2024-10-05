package application;

import java.util.Scanner;

public class MainAlturaMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();

        System.out.println();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();
            System.out.print("idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }
        double mediaAltura = soma / n;

        System.out.println();
        System.out.printf("Altura media: %.2f%n", mediaAltura);

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                cont = cont  + 1;
            }
        }

        double percent = cont * 100.0 / n;

        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }

}
