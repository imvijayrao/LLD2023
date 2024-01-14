package Case_study.Parking_lot.repos;

import Case_study.Parking_lot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Vehiclerepos {

    Map<String, Vehicle> vehicleMap = new HashMap<>();
    Long vehicleId = 0l;

    public Vehicle getVehicleByNumber(String vehicleNumber){
        if(vehicleMap.containsKey(vehicleNumber)){
            return vehicleMap.get(vehicleNumber);
        }
        return null;
    }

    public Vehicle save(Vehicle vehicle){
        vehicleId+=1;
        vehicle.setId(vehicleId);
        vehicleMap.putIfAbsent(vehicle.getVehicleNumber(), vehicle);
        return vehicleMap.get(vehicle.getVehicleNumber());
    }
}