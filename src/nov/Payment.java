
package nov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Payment {
    int billNum;
    int cvv;
    int amount;
    String cardNumber;
    
    
     public Payment(){}
        
    
    
    public Payment(int bill, int cvv, String card){
        this.billNum=bill;
        this.cvv=cvv;
        this.cardNumber=card;
    }
    
    public static double getRev(){ 
        double total = 0;
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){ 
                String Q="SELECT SUM(amount) AS Revenue FROM payment";
                Statement sta=con.createStatement(); 
                ResultSet rs = sta.executeQuery(Q);
                rs.next(); 
                total = rs.getInt("Revenue");
                Nov.closeDB(con, rs, sta);}
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database to get reservation count.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        return total;}
    public double getAmount(){
        return this.amount;
    }
    
   
    public void setAmount(){
        
    }
    
    public String getCard(){
        return this.cardNumber;
    }
    
    
    public void setCard(String card){
        this.cardNumber=card;
    }
    public int getCvv(){
        return cvv;
    }
    public void setCvv(int cvv)
    {
        this.cvv=cvv;
    }
   
   
    
}
    

