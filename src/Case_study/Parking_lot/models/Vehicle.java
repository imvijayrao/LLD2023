package Case_study.Parking_lot.models;

public class Vehicle extends BaseModels{
    private String VehicleNumber;
    private VehicleType type;
    private String OwnerName;

    public Vehicle(String vehicleNumber, VehicleType type, String ownerName) {
        VehicleNumber = vehicleNumber;
        this.type = type;
        OwnerName = ownerName;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

}