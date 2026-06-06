package lab.midterm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class OfficeClerk extends Employee {

    private int clerkId;
    private String employeeNumber;
    private List<Appointment> appointments = new ArrayList<>();

    public OfficeClerk() {}

    public OfficeClerk(int clerkId, String firstName, String lastName,
                       String employeeNumber, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
        this.clerkId        = clerkId;
        this.employeeNumber = employeeNumber;
    }

    public int getClerkId()           { return clerkId; }
    public String getEmployeeNumber() { return employeeNumber; }

    @JsonIgnore
    public List<Appointment> getAppointments() { return appointments; }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
