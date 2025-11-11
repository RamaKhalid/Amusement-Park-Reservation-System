
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

public class KidsPackage extends GamePackages {
    public static int numOfEscorts;
    private static int ESCORT_FEE = 40;
    
    KidsPackage(int numOfEscorts){ this.numOfEscorts = numOfEscorts;}
    
    public static double totalCost(int numTickets){
        double totalCost;
        totalCost = (GamePackages.getPrice("kids") * numTickets) +  (numOfEscorts * ESCORT_FEE); 
        return totalCost;
    }

    public static int getESCORT_FEE() {
        return ESCORT_FEE;
    }

    public void setESCORT_FEE(int ESCORT_FEE) {
        this.ESCORT_FEE = ESCORT_FEE;
    }
     public static void viewKidsPackage(Icon icon){
        String game ;
        String type="kids";
        ArrayList<String> gameList = new ArrayList<>();
        
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                Statement sta=con.createStatement(); 
                ResultSet res = sta.executeQuery("SELECT gameName FROM gamesnames WHERE pckgType = '"+ type+ "'");
                
                while (res.next()){
                   game = res.getString("gameName");  
                   gameList.add(game);}
                
                String Desc= "Kids package:\nHere where you and your Kids can have fun together with only " +getPrice(type)+ "SR :)\nMinimum age is: "+ getAge("kids")+"\nIt contains  the following games \n"+gameList;
                JOptionPane.showMessageDialog(null,Desc, "Kids package info", HEIGHT,icon);
                 Nov.closeDB(con, res, sta);
                
               }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured. ","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
    }
   
    
    
}
