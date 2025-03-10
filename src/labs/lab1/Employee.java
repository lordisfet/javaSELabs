package labs.lab1;

public class Employee {
    private int id;
    private static int nextId = 1;
    private String name;
    private String surname;
    private double salary;

    public Employee(){
        this.id = nextId++;
    }

    public Employee(String name, String surname){
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }
}
