
package nov;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static nov.Reservations.phoneNum;

public class FamilyPackage extends GamePackages {
    private static int numOfkids;
    private static int  DISCOUNT = 40;
    
    public FamilyPackage(){}
    
    public FamilyPackage(int numOfkids){ this.numOfkids = numOfkids;}

    public static int getDiscount(int numKids){return numKids * DISCOUNT;}

    public void setDiscount(int discount) {this.DISCOUNT=discount;}
    
    public static void viewFamilyPackage(Icon icon)
    {
        String game ;
        String type="family";
        ArrayList<String> gameList = new ArrayList<>();
        
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                Statement sta=con.createStatement(); 
                ResultSet res = sta.executeQuery("SELECT gameName FROM gamesnames WHERE pckgType = '"+ type+ "'");
                while (res.next()){
                   game = res.getString("gameName");  
                   gameList.add(game);}
                String Desc="Family package:\nHere where you and your family can have fun together with only " +getPrice(type)+ "SR :)\nMinimum age is: "+ getAge("family")+"\nIt contains  the following games \n"+gameList;
                JOptionPane.showMessageDialog(null,Desc, "Family package info", HEIGHT,icon);
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
