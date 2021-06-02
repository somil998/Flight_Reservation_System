package com.company.fr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight();
        //Ticket ticket=new Ticket("cbd4b4",";lko","del",10,4);
        Passenger passenger = new Passenger("Indira Nagar", "Lucknow", "UP", "Somil", "90444848484", "somil@gmail.com");
        TouristTicket touristTicket = new TouristTicket("dbwys1", "LKO", "DEL", "12:00", "13:00", "13A", 2300f, "Gomti nagar", false);
        RegularTicket regularTicket = new RegularTicket("eneo3q","DEL","LKO","4:00","5:00","19A",1500f,"NA",false);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
        public static void printTicketDetails(Ticket ticket){
            System.out.println(ticket.getPnr());
        }
}
