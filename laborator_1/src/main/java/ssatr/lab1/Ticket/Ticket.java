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
    private int seat;
    private int row;
    private int numberOfEntries;

    public Ticket(String eventName, LocalDateTime eventDate, String ticketType, double ticketPrice, int seat, int row, int numberOfEntries) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.seat = seat;
        this.row = row;
        this.numberOfEntries = numberOfEntries;
    }
}
