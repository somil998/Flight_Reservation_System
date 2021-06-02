package com.company.fr;

public class RegularTicket extends Ticket {
    public RegularTicket(String pnrNumber, String departure, String arrival, String departureDateTime, String arrivalDateTime, String seatNo, float price, String specialService, boolean cancelled){
        super(pnrNumber,arrival,departureDateTime,arrivalDateTime,seatNo,price,cancelled);
        this.specialService = getSpecialService();
    }

    void printTicketDetail(){
        System.out.println(getPnr());
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public  Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    private  String specialService;

    Flight flight;
    Flight flight(){
        return flight;
    }
    String getSpecialService(){
        return specialService;
    }
    void updateSpecialService(String specialService){
        System.out.println("Special Service:"+specialService);

    }
}

