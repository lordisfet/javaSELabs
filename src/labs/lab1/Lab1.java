package labs.lab1;

import labs.lab1.Exception.EmployeeException;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Employee emp = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for choose case of code(1 - 4): ");
        int blockOfCode = scanner.nextInt();

        switch (blockOfCode) {
            case 1 -> {
                // This block of code don't throw exception
                try {
                    emp = new Employee("Max", "Savchenko", 999999.99);
                } catch (EmployeeException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
                System.out.println("emp: " + emp.getName() + "  |  " + emp.getSurname() + "  |  " + emp.getSalary());
            }
            case 2 -> {
                // This block of code throw exception because SuperPuperLongName has length more then MAX_NAME_LENGTH
                try {
                    emp = new Employee("SuperPuperLongName", "NormalSurname", 123456);
                } catch (EmployeeException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
            case 3 -> {
                // This block of code throw exception because SuperPuperLongSurname has length more then MAX_NAME_LENGTH
                try {
                    emp = new Employee("NormalName", "SuperPuperLongSurname", 123456);
                } catch (EmployeeException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
            case 4 -> {
                // This block of code throw exception because -123456 non-positive number
                try {
                    emp = new Employee("NormalName", "NormalSurname", -123456);
                } catch (EmployeeException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
        }
    }
}
