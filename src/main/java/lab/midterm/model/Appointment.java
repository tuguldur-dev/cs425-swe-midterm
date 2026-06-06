package lab.midterm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

    private int appointmentId;

    private LocalDate appointmentDate;

    private LocalTime appointmentTime;

    private AppointmentStatus status;
    private Patient patient;
    private Dentist dentist;
    private Surgery surgery;
    private OfficeClerk officeClerk;

    public Appointment() {}

    public Appointment(int appointmentId, LocalDate appointmentDate, LocalTime appointmentTime,
                       AppointmentStatus status, Patient patient, Dentist dentist,
                       Surgery surgery, OfficeClerk officeClerk) {
        this.appointmentId   = appointmentId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status          = status;
        this.patient         = patient;
        this.dentist         = dentist;
        this.surgery         = surgery;
        this.officeClerk     = officeClerk;
    }

    public int getAppointmentId()              { return appointmentId; }
    public LocalDate getAppointmentDate()      { return appointmentDate; }
    public LocalTime getAppointmentTime()      { return appointmentTime; }
    public AppointmentStatus getStatus()       { return status; }
    public Patient getPatient()                { return patient; }
    public Dentist getDentist()                { return dentist; }
    public Surgery getSurgery()                { return surgery; }
    public OfficeClerk getOfficeClerk()        { return officeClerk; }
}
