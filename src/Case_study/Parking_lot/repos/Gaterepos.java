package Case_study.Parking_lot.repos;

import Case_study.Parking_lot.exceptions.GateNotFoundException;
import Case_study.Parking_lot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class Gaterepos {

    Map<Long, Gate> gates = new HashMap<>();

    public Gate findGatebygateId(Long gateId) throws GateNotFoundException {
        if(gates.containsKey(gateId)){
            return gates.get(gateId);
        }
        throw new GateNotFoundException();
    }
}
