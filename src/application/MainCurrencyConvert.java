package application;

import entities.CurrencyConvert;

import java.util.Scanner;

public class MainCurrencyConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value in dollar");
        double valorDollar = scanner.nextDouble();

        double dollar = CurrencyConvert.convertReal(valorDollar);

        System.out.println("What is dollar price: " + CurrencyConvert.DOLLAR_PRICE);
        System.out.printf("How many dollars will be bought: %.2f%n", valorDollar);
        System.out.printf("Value the IOF: %.2f%n", CurrencyConvert.IOF);
        System.out.printf("Amont to be in reais: %.2f%n", dollar);


    }

}
