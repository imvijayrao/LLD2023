package Case_study.Parking_lot.repos;

import Case_study.Parking_lot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class Ticketrepos {
    
    Map<Long, Ticket> tickets = new HashMap<>();
    Long TicketId = 0l;

    public Ticket save(Ticket ticket){
        TicketId+=1;
        ticket.setId(TicketId);
        tickets.putIfAbsent(TicketId, ticket);
        return ticket;
    }
}
