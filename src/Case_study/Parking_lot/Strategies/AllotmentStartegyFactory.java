package Case_study.Parking_lot.Strategies;

public class AllotmentStartegyFactory {

    public static AllotmentStrategy getParkingAllotmentStartegy(AllotmentStrategy allotmentStrategy){
        return new ParkingSlotStrategy();
    }
}
