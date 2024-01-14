package Case_study.Parking_lot.models;

import java.util.List;

public class ParkingFloor extends BaseModels{
    private int FloorNumber;
    private List<ParkingSlot> parkingSlotList;

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }
}
