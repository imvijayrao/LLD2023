package Case_study.Parking_lot.models;

import java.util.Date;

public class Ticket extends BaseModels{
    private String Number;
    private Date EntryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private Gate entrygate;
    private Operator operator;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.EntryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Gate getEntrygate() {
        return entrygate;
    }

    public void setEntrygate(Gate entrygate) {
        this.entrygate = entrygate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

}
