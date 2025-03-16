package labs.lab1;

import labs.lab1.Exception.EmployeeException;
import labs.lab1.Exception.FieldLengthLimitException;
import labs.lab1.Exception.IncorectSalaryException;

public class Lab1 {
    public static void main(String[] args) {
        Employee emp;

        // This block of code don't throw exception
        try {
            emp = new Employee("Max", "Savchenko", 999999.99);
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // This block of code throw exception because SuperPuperLongName has length more then MAX_NAME_LENGTH
        try {
            emp = new Employee("SuperPuperLongName", "NormalSurname", 123456);
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // This block of code throw exception because SuperPuperLongSurname has length more then MAX_NAME_LENGTH
        try {
            emp = new Employee("NormalName", "SuperPuperLongSurname", 123456);
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
