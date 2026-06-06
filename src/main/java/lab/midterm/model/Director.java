package lab.midterm.model;

public class Director extends Employee {

    private int directorId;
    private String employeeNumber;
    private String title;

    public Director() {}

    public Director(int directorId, String firstName, String lastName,
                    String employeeNumber, String title, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
        this.directorId      = directorId;
        this.employeeNumber  = employeeNumber;
        this.title           = title;
    }

    public int getDirectorId()        { return directorId; }
    public String getEmployeeNumber() { return employeeNumber; }
    public String getTitle()          { return title; }
}
