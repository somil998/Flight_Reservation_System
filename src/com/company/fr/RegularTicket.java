package com.company.fr;

public class RegularTicket extends Ticket {
    public RegularTicket(String pnrNumber,String departure,String Destination,float departureTime,String specialService){
        super(pnrNumber, departure, Destination,departureTime);
        this.specialService = getSpecialService();
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

