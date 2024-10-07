package ssatr.lab1.exercise4;

import com.google.zxing.NotFoundException;

import java.io.IOException;
import java.time.LocalDateTime;

public class Exercise4 {
    public static void main(String[] args) throws NotFoundException, IOException {
        TicketsManager tm = new TicketsManager();

        Ticket ticket1 = tm.generateTicket("Opera", LocalDateTime.now(), "VIP", 120, 2, 4, 2);
        Buyer buyer1 = new Buyer("John", "Doe", "john.doe@gmail.com", "0264986758", "Ceva Street No. 25", ticket1, "20/09/1998");
        
        System.out.println(buyer1.getTicket().getEventName());
    }
}
