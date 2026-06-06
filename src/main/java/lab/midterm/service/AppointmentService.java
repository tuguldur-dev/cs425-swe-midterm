package lab.midterm.service;

import lab.midterm.model.Appointment;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentService {

    public List<Appointment> getAllAppointmentsSortedDescending(List<Appointment> appointments) {
        return appointments.stream()
                .sorted(Comparator
                        .comparing(Appointment::getAppointmentDate)
                        .thenComparing(Appointment::getAppointmentTime)
                        .reversed())
                .collect(Collectors.toList());
    }

    public List<Appointment> getQuarterlyUpcomingAppointments(List<Appointment> appointments) {
        LocalDate today          = LocalDate.now();
        int       currentQuarter = getQuarter(today.getMonth());
        int       currentYear    = today.getYear();

        int nextQuarter;
        int nextQuarterYear;

        if (currentQuarter == 4) {
            nextQuarter     = 1;
            nextQuarterYear = currentYear + 1;
        } else {
            nextQuarter     = currentQuarter + 1;
            nextQuarterYear = currentYear;
        }

        LocalDate nextQuarterStart = getQuarterStartDate(nextQuarter, nextQuarterYear);
        LocalDate nextQuarterEnd   = getQuarterEndDate(nextQuarter, nextQuarterYear);

        return appointments.stream()
                .filter(a -> {
                    LocalDate d = a.getAppointmentDate();
                    return !d.isBefore(nextQuarterStart) && !d.isAfter(nextQuarterEnd);
                })
                .sorted(Comparator
                        .comparing(Appointment::getAppointmentDate)
                        .thenComparing(Appointment::getAppointmentTime))
                .collect(Collectors.toList());
    }

    public int getQuarter(Month month) {
        return (month.getValue() - 1) / 3 + 1;
    }

    public LocalDate getQuarterStartDate(int quarter, int year) {
        int startMonth = (quarter - 1) * 3 + 1;
        return LocalDate.of(year, startMonth, 1);
    }

    public LocalDate getQuarterEndDate(int quarter, int year) {
        int endMonth = quarter * 3;
        LocalDate firstOfEndMonth = LocalDate.of(year, endMonth, 1);
        return firstOfEndMonth.withDayOfMonth(firstOfEndMonth.lengthOfMonth());
    }
}
