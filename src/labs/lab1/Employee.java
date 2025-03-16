package labs.lab1;

import labs.lab1.Exception.*;

public class Employee {
    private int id;
    private static int nextId = 1;
    private static final int MAX_NAME_LENGTH = 15;
    private String name;
    private String surname;
    private double salary;

    public Employee () {}

    public Employee(String name, String surname, double salary) throws EmployeeException {
        this.id = nextId++;
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }

    public void setName(String name) throws EmployeeException {
        lengthCheck(name);
        this.name = name;
    }

    public void setSurname(String surname) throws EmployeeException {
        lengthCheck(surname);
        this.surname = surname;
    }

    public void setSalary(double salary) throws EmployeeException{
        this.salary = salary;
        if (this.salary < 0) {
            throw new IncorectSalaryException("Salary must be positive value");
        }
    }

    public void lengthCheck(String str) throws EmployeeException {
        if (str.length() > MAX_NAME_LENGTH) {
            throw new FieldLengthLimitException('\"' + str + '\"' + " is so long, max length is " + MAX_NAME_LENGTH);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }
}
