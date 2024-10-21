/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssatr.lab1.exercise4.data;

import java.sql.*;
import ssatr.lab1.exercise4.model.Buyer;
import ssatr.lab1.exercise4.model.Ticket;
/**
 *
 * @author User
 */
public class DBConnector{
    private static Connection connection;
    private static String url = "";
    
    public DBConnector() throws SQLException{
        connection = DriverManager.getConnection(url);
    }
    
    public void insertNewSale(Buyer buyer, Ticket ticket) throws SQLException{
        try ( Statement s = connection.createStatement()) {
            s.executeUpdate("INSERT INTO BuyerData() VALUES()");
            s.executeUpdate("INSERT INTO TicketData() VALUES()");
        }
    }
}
