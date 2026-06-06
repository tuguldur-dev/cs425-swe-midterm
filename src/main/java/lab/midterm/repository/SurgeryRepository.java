package lab.midterm.repository;

import lab.midterm.model.Surgery;

import java.util.List;

public class SurgeryRepository {

    private static final List<Surgery> SURGERIES = List.of(
            new Surgery(1,
                    "ADS Fairfield Dental Surgery",
                    "123 Main Street, Fairfield, IA 52556",
                    "(641) 472-1000",
                    "Fairfield",
                    "IA"),
            new Surgery(2,
                    "ADS Iowa City Dental Surgery",
                    "456 College Street, Iowa City, IA 52240",
                    "(319) 338-2000",
                    "Iowa City",
                    "IA"),
            new Surgery(3,
                    "ADS Des Moines Dental Surgery",
                    "789 Grand Avenue, Des Moines, IA 50309",
                    "(515) 243-3000",
                    "Des Moines",
                    "IA")
    );

    public static List<Surgery> getAllSurgeries() {
        return SURGERIES;
    }
}
