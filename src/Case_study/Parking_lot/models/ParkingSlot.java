package Case_study.Parking_lot.models;

public class ParkingSlot extends BaseModels{
    private VehicleType type;
    private ParkingStatus Status;
    private String SlotNumber;
    private ParkingFloor floor;

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public ParkingStatus getStatus() {
        return Status;
    }

    public void setStatus(ParkingStatus status) {
        Status = status;
    }

    public String getSlotNumber() {
        return SlotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        SlotNumber = slotNumber;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }
}
