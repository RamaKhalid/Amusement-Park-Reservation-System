
package nov;
import java.util.ArrayList;
import java.sql.*;
import java.text.*;
import javax.swing.JOptionPane;
import java.util.Date; 
import static nov.Admin.username;


public class Reservations {
    private static int resID;
    private  static double totalCost;
    private  static String date;
    private  static int numOfTickets;
    public static int numOfReservations;
    static String phoneNum = User_login.loggedUser.phone;
    private static int custID;
    private static int guideID;
    private static String type;
    private static  String guideFirst;
    
    
    
    public Reservations(String type, int NumTick, String date, String guideFirst, double Total){this.type=type; this.numOfTickets=NumTick; this.date = date; this.guideFirst=guideFirst; this.totalCost=Total;}
    public Reservations(int resID, String date, int numOfTickets){this.resID = resID; this.date = date; this.numOfTickets = numOfTickets;}
    
    public static ArrayList<String> resDate(String type)
    {
        ArrayList<String> dates = new ArrayList<>();
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                PreparedStatement sta=con.prepareStatement("SELECT date FROM res_date WHERE packID = ?"); 
                sta.setString(1, type);
                ResultSet res = sta.executeQuery();
                while (res.next()){
                    dates.add(res.getString("date"));}
        }
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        
        return dates;
    }
    
    public static void uploadRes(Reservations r){
         try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
             //Get customerID from phoneNUmber
                PreparedStatement sta=con.prepareStatement("SELECT custID FROM customer WHERE phoneNumber = ?"); 
                sta.setString(1, phoneNum);
                ResultSet res = sta.executeQuery();
                while (res.next()){
                    custID = res.getInt("custID");}
                
                //Get guideID from guide first name
                  PreparedStatement getGuide = con.prepareStatement("SELECT guideID FROM guide WHERE fName = ?");
                  getGuide.setString(1, guideFirst);
                  res = getGuide.executeQuery();
                  while (res.next()){guideID = res.getInt("guideID");}
                  
               //Upload data to DB
                  PreparedStatement upload = con.prepareStatement("INSERT INTO reservations (pckg_Type, totalCost, res_date, num_of_tickets, cust_id, Guide_id) VALUES ( ? , ? , ?, ?, ?, ?)");
                  upload.setString(1, type); upload.setDouble(2, totalCost); upload.setString(3, date); upload.setInt(4, numOfTickets); 
                  upload.setInt(5, custID); upload.setInt(6, guideID);
                  upload.execute();       
        }          
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        
    
    }
    
    public static void drodres(){
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                String  q="SELECT @lastid := MAX(res_ID) FROM amusement.reservations";
                Statement sta=con.createStatement(); 
                sta.execute(q);
                sta.execute("DELETE FROM amusement.reservations WHERE res_ID =@lastid");
                
        }          
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database to delete.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
    }
    
    public static int getResCount(){
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                String Q="SELECT COUNT(*) AS resCount FROM reservations";
                Statement sta=con.createStatement(); 
                ResultSet rs = sta.executeQuery(Q);
                rs.next(); 
                numOfReservations = rs.getInt("resCount");
                Nov.closeDB(con, rs, sta);}
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database to get reservation count.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        return numOfReservations;
    }
    
    public static String checkResDate()throws ParseException {
        String datee = "";
        try{
         datee = JOptionPane.showInputDialog("Enter date");
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        if(datee.length()>8){throw new NullPointerException();}
        df.setLenient(false);
        Date date = df.parse(datee);}
        catch(NullPointerException | ParseException e){
            JOptionPane.showMessageDialog(null, "Invalid date!\nValid format is dd/MM/yy");
             throw new ParseException("Invalid input", 1);
        }
        return datee;
    }
    
     public static int check(String New) {
          String type=Admin.getType(username);
          String resdate="";
          int b=0;
          ResultSet res;
         try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);  )
         {
                String rd="SELECT date FROM amusement.res_date where packID='"+type+"'";
                PreparedStatement sta=con.prepareStatement(rd);
                res = sta.executeQuery();
             if (res.next())
             {resdate = res.getString("date"); 
             if(resdate.equals(New)){b=-1;}
             else{b= 1;}
             }
          }
          catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
         return b;
    }
    
    
    
    
    public static int getID(){
        try(    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);       
                ){
                String  q="SELECT MAX(res_ID) FROM amusement.reservations";
                Statement sta=con.createStatement();
                ResultSet rs = sta.executeQuery(q);
                rs.next(); 
                resID = rs.getInt("MAX(res_ID)");
        }          
        catch(SQLException e){ 
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Error occured while accessing the database to delete.","Warning Message ",JOptionPane.ERROR_MESSAGE);
              System.exit(1);}
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }
    
    public String getPackageType() {
        return type;
    }


    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }
    
}