package Case_study.Parking_lot.controllers;

import Case_study.Parking_lot.services.TicketService;

public class TicketControllers {
    private TicketService ticketService;

    public TicketControllers(TicketService ticketService) {
        this.ticketService = ticketService;
    }
}
