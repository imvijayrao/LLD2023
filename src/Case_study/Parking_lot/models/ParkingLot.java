package Case_study.Parking_lot.models;

import Case_study.Parking_lot.Strategies.AllotmentStrategy;
import Case_study.Parking_lot.Strategies.BillingStrategy;

import java.util.List;

public class ParkingLot extends BaseModels{
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private ParkingLotStatus Status;
    private AllotmentStrategy allotmentStrategy;
    private BillingStrategy billingStrategy;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getStatus() {
        return Status;
    }

    public void setStatus(ParkingLotStatus status) {
        Status = status;
    }

    public ParkingLot(List<ParkingFloor> floors, List<Gate> gates, ParkingLotStatus status, AllotmentStrategy allotmentStrategy, BillingStrategy billingStrategy) {
        this.floors = floors;
        this.gates = gates;
        Status = status;
        this.allotmentStrategy = allotmentStrategy;
        this.billingStrategy = billingStrategy;
    }

    public AllotmentStrategy getAllotmentStrategy() {
        return allotmentStrategy;
    }

    public void setAllotmentStrategy(AllotmentStrategy allotmentStrategy) {
        this.allotmentStrategy = allotmentStrategy;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
