package lab.midterm.repository;

import lab.midterm.model.Bill;
import lab.midterm.model.BillStatus;
import lab.midterm.model.Patient;

import java.time.LocalDate;
import java.util.List;

public class BillRepository {

    private static final List<Bill> BILLS = createBills();

    private static List<Bill> createBills() {
        Patient patient1 = PatientRepository.findById(1);
        Patient patient2 = PatientRepository.findById(2);
        Patient patient3 = PatientRepository.findById(3);

        Bill bill1 = new Bill(1, 250.00, 250.00,
                LocalDate.of(2026, 1, 15), LocalDate.of(2026, 2, 15),
                true, BillStatus.PAID, patient1);
        Bill bill2 = new Bill(2, 180.00, 90.00,
                LocalDate.of(2026, 3, 1), LocalDate.of(2026, 4, 1),
                false, BillStatus.PARTIALLY_PAID, patient2);
        Bill bill3 = new Bill(3, 420.00, 0.00,
                LocalDate.of(2026, 4, 10), LocalDate.of(2026, 5, 10),
                false, BillStatus.UNPAID, patient3);

        patient1.addBill(bill1);
        patient2.addBill(bill2);
        patient3.addBill(bill3);

        return List.of(bill1, bill2, bill3);
    }

    public static List<Bill> getAllBills() {
        return BILLS;
    }
}
