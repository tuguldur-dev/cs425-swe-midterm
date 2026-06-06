package lab.midterm.repository;

import lab.midterm.model.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AppointmentRepository {

    private static final List<Appointment> APPOINTMENTS = createAppointments();

    private static List<Appointment> createAppointments() {
        BillRepository.getAllBills();

        Patient patient1 = PatientRepository.findById(1);
        Patient patient2 = PatientRepository.findById(2);
        Patient patient3 = PatientRepository.findById(3);
        Patient patient4 = PatientRepository.findById(4);

        Dentist dentist1 = DentistRepository.getAllDentists().get(0);
        Dentist dentist2 = DentistRepository.getAllDentists().get(1);
        Dentist dentist3 = DentistRepository.getAllDentists().get(2);

        Surgery surgery1 = SurgeryRepository.getAllSurgeries().get(0);
        Surgery surgery2 = SurgeryRepository.getAllSurgeries().get(1);
        Surgery surgery3 = SurgeryRepository.getAllSurgeries().get(2);

        OfficeClerk clerk1 = OfficeClerkRepository.getAllOfficeClerks().get(0);
        OfficeClerk clerk2 = OfficeClerkRepository.getAllOfficeClerks().get(1);

        Appointment appointment1 = new Appointment(1,
                LocalDate.of(2026, 2, 28),
                LocalTime.of(10, 5),
                AppointmentStatus.CONFIRMED,
                patient1, dentist1, surgery1, clerk1);

        Appointment appointment2 = new Appointment(2,
                LocalDate.of(2025, 12, 31),
                LocalTime.of(13, 45),
                AppointmentStatus.COMPLETED,
                patient2, dentist2, surgery2, clerk2);

        Appointment appointment3 = new Appointment(3,
                LocalDate.of(2027, 5, 4),
                LocalTime.of(14, 0),
                AppointmentStatus.SCHEDULED,
                patient3, dentist3, surgery3, clerk1);

        Appointment appointment4 = new Appointment(4,
                LocalDate.of(2026, 9, 16),
                LocalTime.of(11, 15),
                AppointmentStatus.CONFIRMED,
                patient4, dentist1, surgery1, clerk2);

        linkAppointment(appointment1, patient1, dentist1, surgery1, clerk1);
        linkAppointment(appointment2, patient2, dentist2, surgery2, clerk2);
        linkAppointment(appointment3, patient3, dentist3, surgery3, clerk1);
        linkAppointment(appointment4, patient4, dentist1, surgery1, clerk2);

        return List.of(appointment1, appointment2, appointment3, appointment4);
    }

    private static void linkAppointment(Appointment appointment, Patient patient,
                                        Dentist dentist, Surgery surgery, OfficeClerk clerk) {
        patient.addAppointment(appointment);
        dentist.addAppointment(appointment);
        surgery.addAppointment(appointment);
        clerk.addAppointment(appointment);
    }

    public static List<Appointment> getAllAppointments() {
        return APPOINTMENTS;
    }
}
