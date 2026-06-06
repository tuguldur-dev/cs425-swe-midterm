package lab.midterm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

public class Bill {

    private int billId;
    private double amountDue;
    private double amountPaid;
    private LocalDate billDate;
    private LocalDate dueDate;
    private boolean isPaid;
    private BillStatus billStatus;
    private Patient patient;

    public Bill() {}

    public Bill(int billId, double amountDue, double amountPaid,
                LocalDate billDate, LocalDate dueDate,
                boolean isPaid, BillStatus billStatus, Patient patient) {
        this.billId     = billId;
        this.amountDue  = amountDue;
        this.amountPaid = amountPaid;
        this.billDate   = billDate;
        this.dueDate    = dueDate;
        this.isPaid     = isPaid;
        this.billStatus = billStatus;
        this.patient    = patient;
    }

    public int getBillId()           { return billId; }
    public double getAmountDue()     { return amountDue; }
    public double getAmountPaid()    { return amountPaid; }
    public LocalDate getBillDate()   { return billDate; }
    public LocalDate getDueDate()    { return dueDate; }
    public boolean isPaid()          { return isPaid; }
    public BillStatus getBillStatus(){ return billStatus; }
    @JsonIgnore
    public Patient getPatient()      { return patient; }
}
