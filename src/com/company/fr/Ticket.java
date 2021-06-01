package com.company.fr;

public   class  Ticket {
    private  String pnrNumber;
    private String departure;
    private String Destination;
    private Flight flight;
    private  float departureTime;

    public Ticket(String pnrNumber, String departure, String destination, float departureTime,float arrivalTime) {
        //RegularTicket ticket=new RegularTicket();
        System.out.println(pnrNumber);

    }

    public Ticket(String pnrNumber, String departure, String destination, float departureTime) {
    }

    //public void ticket(String  pnrNumber, String departure, String Destination , float departureTime) {
    //  System.out.println(pnrNumber);
    // }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public Flight getFlight() {
        return flight; }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(float departureTime) {
        this.departureTime = departureTime;
    }

    public float getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(float arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return Cancelled;
    }

    public void setCancelled(boolean cancelled) {
        Cancelled = cancelled;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    private float arrivalTime;
    private float price;
    private  boolean Cancelled;

    Passenger passenger;
    Flight flight(){
        return flight;
    }
    Passenger getPassenger(){

        return passenger;
    }


    String flightStautus(){

        return flightStautus();
    }
    float getJourneyDuration() {

        return arrivalTime-departureTime;
    }
    boolean cancelTicket(){

        return Cancelled;
    }


}
