package lab.midterm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Surgery {

    private int surgeryId;
    private String name;
    private String locationAddress;
    private String telephoneNumber;
    private String city;
    private String state;
    private List<Appointment> appointments = new ArrayList<>();

    public Surgery() {}

    public Surgery(int surgeryId, String name, String locationAddress,
                   String telephoneNumber, String city, String state) {
        this.surgeryId       = surgeryId;
        this.name            = name;
        this.locationAddress = locationAddress;
        this.telephoneNumber = telephoneNumber;
        this.city            = city;
        this.state           = state;
    }

    public int getSurgeryId()          { return surgeryId; }
    public String getName()            { return name; }
    public String getLocationAddress() { return locationAddress; }
    public String getTelephoneNumber() { return telephoneNumber; }
    public String getCity()            { return city; }
    public String getState()           { return state; }
    @JsonIgnore
    public List<Appointment> getAppointments() { return appointments; }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
