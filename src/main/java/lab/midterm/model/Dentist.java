package lab.midterm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Dentist extends Employee {

    private int dentistId;
    private String specialization;
    private List<Appointment> appointments = new ArrayList<>();

    public Dentist() {}

    public Dentist(int dentistId, String firstName, String lastName,
                   String specialization, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
        this.dentistId      = dentistId;
        this.specialization = specialization;
    }

    public int getDentistId()         { return dentistId; }
    public String getSpecialization() { return specialization; }

    @JsonIgnore
    public List<Appointment> getAppointments() { return appointments; }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
