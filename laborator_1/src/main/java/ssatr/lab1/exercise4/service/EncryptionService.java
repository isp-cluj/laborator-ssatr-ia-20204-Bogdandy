/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.exercise4.service;

import java.time.LocalDateTime;
import ssatr.lab1.exercise4.model.Ticket;

/**
 *
 * @author mihai
 */
public class EncryptionService {
    
    public String encryptTicket(Ticket ticket){
        //apply some encryption algorithm
        return "encrypted tickte....!@#!@#!@#QWDEQWEWE";
    }
    
    public Ticket decrypt(String encryptedTicket){
        //decode string 
        //convert decoded string in ticket object
        // retrun object
        return new Ticket("Opera", LocalDateTime.now(), "VIP", 120);
    }
    
}