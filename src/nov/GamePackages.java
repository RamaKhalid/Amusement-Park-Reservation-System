package nov;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static nov.Admin.getType;
import static nov.Admin.username;



public class GamePackages {
    
    private String type;
    private int minAge;
    private int age;
    private static double price;
    private static int totalNumOfGames;
     static int minimum;
     
    public GamePackages(){}
    
    public GamePackages(String type, int minAge, double price){ this.type = type; this.minAge = minAge; this.price = price;}
    
      
      public static int getAge(String type){
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                PreparedStatement sta=con.prepareStatement("SELECT minAge FROM gamespackages WHERE packageType = ? "); 
                sta.setString(1, type);
                ResultSet res = sta.executeQuery();
                while(res.next())
                    minimum =  res.getInt("minAge");    
        }
        
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured. ","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        return minimum;
    }
      
      
     public static int checkMinimum(int value, String type){
        int  mini = getAge(type);
        if(value < mini ) {JOptionPane.showMessageDialog(null,"Minimum age for this package is not met" + "\n(Minimum age is: " + mini + ")" ,"Warning Message ",JOptionPane.ERROR_MESSAGE);
                            return 0;}
        else return 1;}
     
     public static double getPrice(String type){
     try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                PreparedStatement sta=con.prepareStatement("SELECT price FROM gamespackages WHERE packageType = ? "); 
                sta.setString(1, type);
                ResultSet res = sta.executeQuery();
                while(res.next())
                    price =  res.getDouble("price");       
        }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured. ","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
              return price;
     }
     
     public static int getGameCount(){
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                String Q="SELECT COUNT(*) AS gameCount FROM gamesnames";
                Statement sta=con.createStatement(); 
                ResultSet rs = sta.executeQuery(Q);
                rs.next(); 
                totalNumOfGames = rs.getInt("gameCount");
                Nov.closeDB(con, rs, sta);}
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database to get game count.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        return totalNumOfGames;
    }
     
     
     
     public static ArrayList<String> getGuide(){
        String fname, lname;
        String fullName;
        ArrayList<String> guides = new ArrayList<>();
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                Statement sta=con.createStatement(); 
                ResultSet res = sta.executeQuery("SELECT fName, lName FROM guide");
                while (res.next()){
                    fname = res.getString("fName");
                    lname = res.getString("lName");
                    fullName = fname + " " + lname;
                    guides.add(fullName);}
        }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        
        return guides;
    }
    
     public static void deleteGame(JTable view,String viewOp){
        String type;
        String name;
        String q = null;
        DefaultTableModel model = (DefaultTableModel) view.getModel();

       try{       
           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);
       int SelectedRowIndex = view.getSelectedRow();
       if(SelectedRowIndex==-1){JOptionPane.showMessageDialog(null,"Please select the row you want to delete :)");}
       else{
       type =  model.getValueAt(SelectedRowIndex, 0).toString();
       name =  model.getValueAt(SelectedRowIndex, 1).toString();
      
      if("Avaliable reservation dates".equals(viewOp)){
          if(cheekRESdate( name)==false)
          {JOptionPane.showMessageDialog(null, "You can't delete It, It's already booked!");
          }else { PreparedStatement sta=con.prepareStatement("delete from res_date where packID= ? And date= ?");
          sta.setString(1, type); 
          sta.setString(2, name ); 
          sta.execute();
          model.removeRow(SelectedRowIndex);}
          }
      
      else{PreparedStatement sta=con.prepareStatement("delete from amusement.gamesnames where pckgType= ? And gameName= ?");
        sta.setString(1, type); 
        sta.setString(2, name ); 
        sta.execute();
      model.removeRow(SelectedRowIndex);}
        
        }
       
       }
       catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database to delete.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
       
       catch(Exception ex)
       {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, ex);
       }
     }
     
     public static void UpdateGamepack(double p, int a){
         
         String type=Admin.getType(username);
         
         String q="UPDATE `amusement`.`gamespackages` SET `price` = ? , `minAge` = ? WHERE (`packageType` =  '"+type+"')";
         try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
               PreparedStatement pt=con.prepareStatement(q);
                pt.setDouble(1, p); 
                pt.setInt(2, a); 
                pt.executeUpdate();
        }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
     }
      public static void UpdatedateGame(String old,String Game){
         
         String type=Admin.getType(username);
         if(Game == null){JOptionPane.showMessageDialog(null,"You have to enter a string. "); return;}
         String q="UPDATE `amusement`.`gamesnames` SET  `gameName` = ? WHERE (`pckgType` =  '"+type+"')and (`gameName` = '"+old+"')";
         try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                try{Integer.parseInt(Game);}catch(NumberFormatException e){
                PreparedStatement pt=con.prepareStatement(q);
                pt.setString(1, Game);  
                pt.executeUpdate();
                return;
                }
                JOptionPane.showMessageDialog(null,"You have to enter a string.");       
        }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
      
     }
      public static void UpdatedateDate(String old,String date){
         
         String type=Admin.getType(username);
        if(date == null){JOptionPane.showMessageDialog(null,"You have to enter a string. "); return;}
         String q="UPDATE `amusement`.`res_date` SET  `date` = ? WHERE (`packID` =  '"+type+"')and (`date` = '"+old+"')";
         try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
               PreparedStatement pt=con.prepareStatement(q);
                pt.setString(1, date);  
                pt.executeUpdate();
        }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        // else{JOptionPane.showMessageDialog(null, "you can update this date itis alrady pooked");}
     }
      public static boolean cheekRESdate(String old){
          String type=Admin.getType(username);
          String resdate="";
          boolean b=false;
          ResultSet res;
          try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                //String r="select date from amusement.res_date where exists (select res_date from amusement.reservations where res_date=date and pckg_Type='"+type+"')";
                String rd="select res_date from reservations where pckg_Type='"+type+"'";
                
                PreparedStatement sta=con.prepareStatement(rd);
                res = sta.executeQuery();
             if (res.next())
             {resdate = res.getString("res_date"); 
             if((resdate.equalsIgnoreCase(old))){
             b=false;}
             else{b= true;}
             res.close();
             sta.close();
             }
          }
          catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
         return b;
      }
     
     
     
    public void setPrice(int price){this.price = price;}
    public String getType(){return type;}
    public int getMinAge(){return minAge;}
    public void checkAge(int age){}
    public void displayGameStatistics(){}
    
    
}