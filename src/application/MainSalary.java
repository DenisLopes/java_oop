package application;

import entities.Salary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSalary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Salary> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken! try again");
                System.out.print("Id: ");
                id = scanner.nextInt();
            }
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Salary employee = new Salary(id, name, salary);

            list.add(employee);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = scanner.nextInt();

        Salary emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        //Integer emp = idPosition (list, idSalary);

        if (emp == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employees: ");
        for (Salary e : list){
            System.out.println(e);
        }

    }

    public static Integer idPosition(List<Salary> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId (List<Salary> list, int id){
        Salary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
