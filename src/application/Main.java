package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

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
*/

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Paulo");
        list.add("Adriana");
        list.add("Mariana");
        list.add("Marco");
        list.add("Denis");

        for (String value : list){
            System.out.println(value);
        }

        System.out.println(list.size());
        System.out.println("---------------------------------------");

        list.removeIf(value -> value.charAt(0) == 'M');
        for (String value : list){
            System.out.println(value);
        }

        System.out.println("---------------------------------------");

        System.out.println("Index of Paulo: " + list.indexOf("Paulo"));
        System.out.println("Index of Paulo: " + list.indexOf("Denis"));

        System.out.println("---------------------------------------");

        List<String> result = list.stream().filter(value -> value.charAt(0) == 'A').toList();
        for (String value : result){
            System.out.println(value);
        }

        System.out.println("---------------------------------------");

        String name = list.stream().filter(value -> value.charAt(0) == 'X').findFirst().orElse(null);
        System.out.println(name);
    }
}
