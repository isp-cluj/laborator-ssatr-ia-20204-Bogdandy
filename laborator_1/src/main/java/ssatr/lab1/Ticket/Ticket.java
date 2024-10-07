/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.Ticket;

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
    private int Seat;
    private int Row;
    private int numberOfEntries;

    public Ticket(String eventName, LocalDateTime eventDate, String ticketType, double ticketPrice, int Seat, int Row, int numberOfEntries) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.Seat = Seat;
        this.Row = Row;
        this.numberOfEntries = numberOfEntries;
    }
}
