package com.company.fr;

import java.time.LocalDateTime;

public abstract class Ticket {
    private String pnr;
    private String departure;
    private String arrival;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnrNumber, String arrival, float departureDateTime, String arrivalDateTime,String seatNo,float price,boolean cancelled) {

    }


    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return departure;
    }

    public void setFrom(String departure) {
        this.departure= departure;
    }

    public String getTo() {
        return arrival;
    }

    public void setTo(String arrival) {
        this.arrival = arrival;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket(String pnr, String departure, String arrival, String departureDateTime,
                  String arrivalDateTime, float price, boolean cancelled) {
        this.pnr = pnr;
        this.departure = departure;
        this.arrival = arrival;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }
    public void cancel() {
        cancelled = true;
    }

    public String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }

    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "pnr='" + pnr + '\'' +
                ", from='" + departure + '\'' +
                ", to='" + arrival + '\'' +
                ", departureDateTime='" + departureDateTime + '\'' +
                ", arrivalDateTime='" + arrivalDateTime + '\'' +
                ", seatNo='" + seatNo + '\'' +
                ", price=" + price +
                ", cancelled=" + cancelled +
                ", flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}