package com.company.fr;


public class Flight {
    private static int idCounter;
    private int id;
    private String flightNumber;
    private String airlineName;
    private int capacity;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTotalNumberOfBookedSeats() {
        return totalNumberOfBookedSeats;
    }

    public void setTotalNumberOfBookedSeats(int totalNumberOfBookedSeats) {
        this.totalNumberOfBookedSeats = totalNumberOfBookedSeats;
    }

    private int totalNumberOfBookedSeats;

    String getFlightDetails(String flightNumber,String airlineName,int capacity,int totalNumberOfBookedSeats){

        return flightNumber +" , "+airlineName+" , "+capacity+" , "+totalNumberOfBookedSeats;
    }
    int getSeatAvailability()
    {
        return capacity-totalNumberOfBookedSeats ;
    }
    int getTotalBookedSeats(){
        return totalNumberOfBookedSeats;
    }
    static {
        idCounter=0;
    }
    public int getPassengerCount() {
        return this.id;

    }
}
