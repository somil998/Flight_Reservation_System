package com.company.fr;


public class TouristTicket extends Ticket {
    private  String hotelAddress;
    public TouristTicket(String pnrNumber, String departure, String arrival, String departureDateTime, String arrivalDateTime, String seatNo, float price, String hotelAddress, boolean cancelled){
        super(pnrNumber,arrival,departureDateTime,arrivalDateTime,seatNo,price,cancelled);
        this.hotelAddress = getHotelAddress();
        this.locations=getTouristLocation();
    }
    void printTicketDetial(){
        System.out.println(getPnr());
    }

    public void setHotelAddress(String hotelAddress) {

        this.hotelAddress = hotelAddress;
    }

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    private   String[]locations;

    private  Flight flight;
    Flight flight(){

        return flight;
    }

    String getHotelAddress(){
        return hotelAddress;
    }
    String[] getTouristLocation(){
        return locations;
    }
    void removeLocation(String location){
        System.out.println();
    }
    void addLocation(String location){

    }
}
