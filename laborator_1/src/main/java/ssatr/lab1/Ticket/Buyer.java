/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.Ticket;

/**
 *
 * @author User
 */
public class Buyer {
    private String name;
    private String surename;
    private String email;
    private String phoneNumber;
    private Ticket ticket;
    private String purchaseDate;

    public Buyer(String name, String surename, String email, String phoneNumber, Ticket ticket, String purchaseDate) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.ticket = ticket;
        this.purchaseDate = purchaseDate;
    }

    
    
}
