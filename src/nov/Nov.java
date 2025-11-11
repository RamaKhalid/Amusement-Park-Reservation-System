package nov;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;

public class Nov {
    public static String DBPassword = "12345678";
    
    public static void main(String[] args) {
        
        NovemberLand Test = new NovemberLand();
        Test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Test.setSize(600, 500);
        Test.setLocationRelativeTo(null);
        Test.setVisible(true);
        Test.setResizable(false);
    }

public static void closeDB(Connection con, ResultSet res, PreparedStatement sta){
        try{
         if(res != null) res.close(); 
         if(sta != null) sta.close(); 
         if(con != null) con.close();}
        catch (SQLException e){
         JOptionPane.showMessageDialog(null,"Error occured while closing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
        System.exit(1);}
    }


    public static void closeDB(Connection con, ResultSet res, Statement sta){
        try{
         if(res != null)res.close(); 
         if(sta != null) sta.close(); 
         if(con != null) con.close();}
        catch (SQLException e){
         JOptionPane.showMessageDialog(null,"Error occured while closing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
         System.exit(1);}
    }
    
    public static void closeDB(Connection con, PreparedStatement sta){
        try{
          if(sta != null) sta.close(); 
          if(con != null) con.close();}
        catch (SQLException e){
         JOptionPane.showMessageDialog(null,"Error occured while closing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
         System.exit(1);}
    }
    
    public static void closeDB(PreparedStatement sta){
        try{
         if(sta != null) sta.close();}
        catch (SQLException e){
         JOptionPane.showMessageDialog(null,"Error occured while closing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
         System.exit(1);}
    }}
