package Case_study.Parking_lot.Strategies;

import Case_study.Parking_lot.exceptions.ParkingLotFullException;
import Case_study.Parking_lot.models.ParkingSlot;
import Case_study.Parking_lot.models.VehicleType;

public class ParkingSlotStrategy implements AllotmentStrategy{
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLot) throws ParkingLotFullException {
        return null;
    }
}
