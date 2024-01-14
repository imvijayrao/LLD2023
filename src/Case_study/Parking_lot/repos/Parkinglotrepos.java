package Case_study.Parking_lot.repos;

import Case_study.Parking_lot.exceptions.ParkingLotNotFoundException;
import Case_study.Parking_lot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class Parkinglotrepos {

    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    public ParkingLot getParkingLotbyId(Long ParkingLotId) throws ParkingLotNotFoundException {
        if(parkingLotMap.containsKey(ParkingLotId)){
            return parkingLotMap.get(ParkingLotId);
        }
        throw new ParkingLotNotFoundException();
    }
}
