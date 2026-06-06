package lab.midterm.repository;

import lab.midterm.model.Patient;

import java.time.LocalDate;
import java.util.List;

public class PatientRepository {

    private static final List<Patient> PATIENTS = List.of(
            new Patient(1,
                    "John",
                    "Smith",
                    "101 Oak Lane, Fairfield, IA 52556",
                    "(641) 001-1234",
                    "john.smith@email.com",
                    LocalDate.of(1987, 1, 19)),
            new Patient(2,
                    "Anna",
                    "Jones",
                    "202 Elm Street, Iowa City, IA 52240",
                    "(319) 716-1987",
                    "anna.jones@email.com",
                    LocalDate.of(2001, 7, 26)),
            new Patient(3,
                    "Carlos",
                    "Jimenez",
                    "303 Pine Avenue, Des Moines, IA 50309",
                    "(319) 098-7711",
                    "carlos.jimenez@email.com",
                    LocalDate.of(1969, 11, 5)),
            new Patient(4,
                    "Albert",
                    "Einstein",
                    "404 Theory Road, Iowa City, IA 52240",
                    "(641) 119-6142",
                    "albert.einstein@email.com",
                    LocalDate.of(1955, 12, 28))
    );

    public static List<Patient> getAllPatients() {
        return PATIENTS;
    }

    public static Patient findById(int patientId) {
        return PATIENTS.stream()
                .filter(p -> p.getPatientId() == patientId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Patient not found: " + patientId));
    }
}
