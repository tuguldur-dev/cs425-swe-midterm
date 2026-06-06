package lab.midterm.model;

public abstract class Employee extends Person {

    public Employee() {}

    public Employee(String firstName, String lastName, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
    }
}
