package Case_study.Parking_lot.models;

import java.time.LocalDateTime;

public class Payment extends BaseModels{
    private Float amount;
    private int refNumber;
    private LocalDateTime time;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

}
