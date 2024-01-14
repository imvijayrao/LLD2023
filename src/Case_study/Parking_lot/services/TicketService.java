package Case_study.Parking_lot.services;

import Case_study.Parking_lot.Strategies.AllotmentStartegyFactory;
import Case_study.Parking_lot.Strategies.AllotmentStrategy;
import Case_study.Parking_lot.dtos.IssueTicketRequest;
import Case_study.Parking_lot.exceptions.ParkingLotFullException;
import Case_study.Parking_lot.exceptions.ParkingLotNotFoundException;
import Case_study.Parking_lot.models.ParkingLot;
import Case_study.Parking_lot.models.ParkingSlot;
import Case_study.Parking_lot.models.Ticket;
import Case_study.Parking_lot.models.Vehicle;
import Case_study.Parking_lot.repos.Gaterepos;
import Case_study.Parking_lot.repos.Parkinglotrepos;
import Case_study.Parking_lot.repos.Ticketrepos;
import Case_study.Parking_lot.repos.Vehiclerepos;

import java.util.Date;
import java.util.UUID;

public class TicketService {

    private Gaterepos gaterepos;
    private Vehiclerepos vehiclerepos;
    private Parkinglotrepos parkinglotrepos;
    private Ticketrepos ticketrepos;

    public TicketService(Gaterepos gaterepos, Vehiclerepos vehiclerepos, Parkinglotrepos parkinglotrepos, Ticketrepos ticketrepos) {
        this.gaterepos = gaterepos;
        this.vehiclerepos = vehiclerepos;
        this.parkinglotrepos = parkinglotrepos;
        this.ticketrepos = ticketrepos;
    }

    public Ticket issueTicket(IssueTicketRequest ticketRequest) throws ParkingLotFullException, ParkingLotNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        //2.set vehicle for tiket
        ticket.setVehicle(getVehicleForNumber(ticketRequest));

        //3.set parking slot for that vehicle
        ticket.setParkingSlot(getParkingSlot(ticketRequest));

        //4.ticket number
        ticket.setNumber(ticketRequest.getOwnerName() + UUID.randomUUID());

        return ticketrepos.save(ticket);
    }

    private Vehicle getVehicleForNumber(IssueTicketRequest ticketRequest){
        Vehicle vehicle = vehiclerepos.getVehicleByNumber(ticketRequest.getVehicleNumber());
        if(vehicle == null){
            vehicle = new Vehicle(ticketRequest.getVehicleNumber(), ticketRequest.getVehicleType(), ticketRequest.getOwnerName());
            vehiclerepos.save(vehicle);
        }
        return vehicle;
    }

    private ParkingSlot getParkingSlot(IssueTicketRequest ticketRequest) throws ParkingLotNotFoundException, ParkingLotFullException {
        ParkingLot parkinglot = parkinglotrepos.getParkingLotbyId(ticketRequest.getParkingLotId());
        AllotmentStrategy parkingallotmentStrategy = parkinglot.getAllotmentStrategy();

        AllotmentStrategy allotmentStrategy = AllotmentStartegyFactory.getParkingAllotmentStartegy(parkingallotmentStrategy);

        ParkingSlot parkingSlot = parkinglot.getAllotmentStrategy().getParkingSlot(ticketRequest.getVehicleType(), ticketRequest.getParkingLotId());

        return parkingSlot;
    }

}
