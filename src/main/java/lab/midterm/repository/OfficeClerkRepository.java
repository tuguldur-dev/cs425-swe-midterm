package lab.midterm.repository;

import lab.midterm.model.OfficeClerk;

import java.util.List;

public class OfficeClerkRepository {

    private static final List<OfficeClerk> CLERKS = List.of(
            new OfficeClerk(1,
                    "Emily",
                    "Carter",
                    "EMP-1001",
                    "e.carter@ads.com",
                    "(641) 472-1010"),
            new OfficeClerk(2,
                    "David",
                    "Nguyen",
                    "EMP-1002",
                    "d.nguyen@ads.com",
                    "(319) 338-1010")
    );

    public static List<OfficeClerk> getAllOfficeClerks() {
        return CLERKS;
    }
}
