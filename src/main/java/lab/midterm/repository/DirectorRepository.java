package lab.midterm.repository;

import lab.midterm.model.Director;

import java.util.List;

public class DirectorRepository {

    private static final List<Director> DIRECTORS = List.of(
            new Director(1,
                    "Margaret",
                    "Harrison",
                    "DIR-2001",
                    "Executive Director",
                    "m.harrison@ads.com",
                    "(641) 472-2000"),
            new Director(2,
                    "Robert",
                    "Chen",
                    "DIR-2002",
                    "Operations Director",
                    "r.chen@ads.com",
                    "(515) 243-2000")
    );

    public static List<Director> getAllDirectors() {
        return DIRECTORS;
    }

    public static Director findById(int directorId) {
        return DIRECTORS.stream()
                .filter(d -> d.getDirectorId() == directorId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Director not found: " + directorId));
    }
}
