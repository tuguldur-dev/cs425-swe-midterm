package lab.midterm.repository;

import lab.midterm.model.Dentist;

import java.util.List;

public class DentistRepository {

    private static final List<Dentist> DENTISTS = List.of(
            new Dentist(1,
                    "Dr. Michael",
                    "Thompson",
                    "General Dentistry",
                    "m.thompson@ads.com",
                    "(641) 472-1001"),
            new Dentist(2,
                    "Dr. Sarah",
                    "Williams",
                    "Orthodontics",
                    "s.williams@ads.com",
                    "(319) 338-2001"),
            new Dentist(3,
                    "Dr. James",
                    "Rodriguez",
                    "Oral Surgery",
                    "j.rodriguez@ads.com",
                    "(515) 243-3001")
    );

    public static List<Dentist> getAllDentists() {
        return DENTISTS;
    }
}
