package labs.lab1;

import labs.lab1.Exception.*;

import java.nio.file.FileAlreadyExistsException;

public class Employee {
    private int id;
    private static int nextId = 1;
    private static final int MAX_NAME_LENGTH = 15;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname){
        this.id = nextId++;
        setName(name);
        setSurname(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void lengthCheck(String str) throws EmployeeException {
        if (str.length() > MAX_NAME_LENGTH) {
            throw new FieldLengthLimitException(str + "Is so long, max legth is  " + MAX_NAME_LENGTH);
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
