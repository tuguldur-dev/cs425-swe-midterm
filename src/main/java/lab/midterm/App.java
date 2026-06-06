package lab.midterm;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lab.midterm.model.Appointment;
import lab.midterm.repository.AppointmentRepository;
import lab.midterm.service.AppointmentService;

import java.time.LocalDate;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        List<Appointment> allAppointments = AppointmentRepository.getAllAppointments();
        AppointmentService service        = new AppointmentService();

        printBanner();

        System.out.println("=".repeat(70));
        System.out.println("  4.2.1  ALL APPOINTMENTS");
        System.out.println("         Sorted by Appointment Date & Time [ DESCENDING ]");
        System.out.println("=".repeat(70));
        System.out.println();

        List<Appointment> sortedDescending =
                service.getAllAppointmentsSortedDescending(allAppointments);

        String allAppointmentsJson = objectMapper.writeValueAsString(sortedDescending);
        System.out.println(allAppointmentsJson);

        System.out.println();

        System.out.println("=".repeat(70));
        System.out.println("  4.2.2  QUARTERLY UPCOMING APPOINTMENTS");
        System.out.println("         Sorted by Appointment Date & Time [ ASCENDING ]");
        System.out.println("=".repeat(70));
        System.out.println();

        List<Appointment> quarterlyAppointments =
                service.getQuarterlyUpcomingAppointments(allAppointments);

        if (quarterlyAppointments.isEmpty()) {
            System.out.println("  [ No appointments found for the next quarter. ]");
        } else {
            String quarterlyJson = objectMapper.writeValueAsString(quarterlyAppointments);
            System.out.println(quarterlyJson);
        }

        System.out.println();
        System.out.println("=".repeat(70));
        System.out.println("  End of ADS Dental Management System Report");
        System.out.println("=".repeat(70));
    }

    private static void printBanner() {
        System.out.println();
        System.out.println("=".repeat(70));
        System.out.println("   ADVENTIST DENTAL SURGERIES (ADS), LLC");
        System.out.println("   Dental Management System  -  CLI Application");
        System.out.println("   Current Date : " + LocalDate.now());
        System.out.println("=".repeat(70));
        System.out.println();
    }
}
