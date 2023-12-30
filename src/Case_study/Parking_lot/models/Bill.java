package Case_study.Parking_lot.models;

import Case_study.Parking_lot.Strategies.BillingStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {
    private Ticket ticket;
    private LocalDateTime ExitTime;
    private Gate Exitgate;
    private Operator operator;
    private Float amount;
    private BillStatus billStatus;
    private List<Payment> payment;
    private BillingStrategy billingStrategy;


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return ExitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        ExitTime = exitTime;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Gate getExitgate() {
        return Exitgate;
    }

    public void setExitgate(Gate exitgate) {
        this.Exitgate = exitgate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
