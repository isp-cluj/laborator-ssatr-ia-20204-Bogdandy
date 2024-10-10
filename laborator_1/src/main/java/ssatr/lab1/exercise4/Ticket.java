/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.exercise4;

import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Ticket {
    private String eventName;
    private LocalDateTime eventDate;
    private String ticketType;
    private double ticketPrice;

    public Ticket(String eventName, LocalDateTime eventDate, String ticketType, double ticketPrice) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
    }
    
    @Override
    public String toString() {
        return "Ticket{" + "eventName=" + eventName + ", eventDate=" + eventDate + ", ticketType=" + ticketType + ", ticketPrice=" + ticketPrice + '}';
    }
    
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
