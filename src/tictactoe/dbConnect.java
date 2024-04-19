package tictactoe;

import java.sql.*;
import javax.swing.*;

public class dbConnect { // This class handles the database connection for the TicTacToe game

    private final static String DB_URL = "jdbc:mysql://localhost:3306/tictactoe";
    private final static String DB_USER = "root";
    private final static String DB_PASS = "";
    
    public static Connection connectDB(){
        try{
            
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection successful!");
            return conn;
                    
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Connection failed!");
            return null;
        }
    }
    
    public static void main(String[] args){
        connectDB();
    }
    
}
