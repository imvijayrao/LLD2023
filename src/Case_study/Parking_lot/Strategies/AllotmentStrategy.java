package Case_study.Parking_lot.Strategies;

import Case_study.Parking_lot.exceptions.ParkingLotFullException;
import Case_study.Parking_lot.models.ParkingSlot;
import Case_study.Parking_lot.models.VehicleType;

public interface AllotmentStrategy {
    ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLot) throws ParkingLotFullException;
}
