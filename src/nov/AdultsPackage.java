
package nov;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import static nov.GamePackages.getPrice;

public class AdultsPackage extends GamePackages{
    
    private boolean freeTicket;
    
   
    public AdultsPackage(){}
    public AdultsPackage(String type, int minAge, double price){}
    
    public static double totalCost(int numTickets){
        double totalCost;
        totalCost = GamePackages.getPrice("adults") * numTickets; 
        if(numTickets >= 3){ totalCost =  totalCost - GamePackages.getPrice("adults");}
        return totalCost; 
    }
    
     public static void viewAdultPackage(Icon icon){
        String game ;
        String type="adults";
        ArrayList<String> gameList = new ArrayList<>();
        
    try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                Statement sta=con.createStatement(); 
                ResultSet res = sta.executeQuery("SELECT gameName FROM gamesnames WHERE pckgType = '"+ type+ "'");
                while (res.next()){
                   game = res.getString("gameName");  
                   gameList.add(game);}
                String Desc= "Adults package:\nHere where you and your friends can have fun together with only " +getPrice(type)+ "SR :)\nMinimum age is: "+ getAge("adults")+"\nIt contains  the following games \n"+gameList;
                JOptionPane.showMessageDialog(null,Desc, "Adults package info", HEIGHT,icon);
                 Nov.closeDB(con, res, sta);
               }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured. ","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
    }
    
    @Override
    public String toString(){ return " ";}
    
}

