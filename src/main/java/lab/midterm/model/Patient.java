package lab.midterm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    private int patientId;
    private String mailingAddress;
    private LocalDate dateOfBirth;
    private List<Bill> bills = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public Patient() {}

    public Patient(int patientId, String firstName, String lastName, String mailingAddress,
                   String phoneNumber, String email, LocalDate dateOfBirth) {
        super(firstName, lastName, email, phoneNumber);
        this.patientId      = patientId;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth    = dateOfBirth;
    }

    public int getPatientId()         { return patientId; }
    public String getMailingAddress() { return mailingAddress; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }

    @JsonIgnore
    public List<Bill> getBills() { return bills; }

    @JsonIgnore
    public List<Appointment> getAppointments() { return appointments; }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
