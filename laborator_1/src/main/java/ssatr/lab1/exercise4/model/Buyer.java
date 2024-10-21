/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.exercise4.model;

/**
 *
 * @author User
 */
public class Buyer {
    private String name;
    private String surename;
    private String email;
    private String phoneNumber;
    private String address;
    private Ticket ticket;
    private String purchaseDate;

    public Buyer(String name, String surename, String email, String phoneNumber, String address, Ticket ticket, String purchaseDate) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ticket = ticket;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Buyer{" + "name=" + name + ", surename=" + surename + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", ticket=" + ticket + ", purchaseDate=" + purchaseDate + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
