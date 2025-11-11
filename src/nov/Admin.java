package nov;

import java.sql.*;
import javax.swing.*;
import static nov.ViewPack.url;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Admin extends User {
    
    static  String username;
    String fname;
    double salary;
    String Packtype;
    
    public Admin(){}
    public Admin(String username, String fname){this.username = username; this.fname = fname;}
    public Admin(String fName, String lName, char sex, String pass, int id,String username,double salary)
    
    {
        super();
        this.username=username;
        this.salary=salary;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    public static String getType(String username){
        String type = "";
        try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement", "root", Nov.DBPassword);
                String query = "Select packageType from admin join gamespackages  on adminID = admin_id where username = ?";
                PreparedStatement pstatement = connection.prepareStatement(query);
                pstatement.setString(1,username );
                ResultSet rs = pstatement.executeQuery();
                if (rs.next()) type = rs.getString("packageType");
                Nov.closeDB(connection,rs, pstatement);
                }
         catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error.");
                System.exit(1);
            }
       return type;
    }
     
    public static void view (String viewOp,JTable view){
        
        Connection con;
        Statement st;
        ResultSet rs = null;
        String query=" ";
        String url="jdbc:mysql://localhost:3306/amusement";
        int count;
       try{
            con = DriverManager.getConnection(url,"root",Nov.DBPassword);
            st = con.createStatement();

            
            if("Genral package info".equals(viewOp)){
                rs = st.executeQuery("select packageType as package_Name ,price,minAge as minimum_age,admin_id from gamespackages");
            }
            else if("Avaliable reservation dates".equals(viewOp)){
                rs = st.executeQuery("select packID as package_Name, date from res_date");
            }
            else if("Avaliable games".equals(viewOp)){

                rs = st.executeQuery("select pckgType as package_Name,gameName as game_Name from gamesnames");
            }
            
            view.setModel(DbUtils.resultSetToTableModel(rs));
            Nov.closeDB(con,rs, st);
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error.in view");
            System.exit(1);
        }}
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
       public static void Updateview (String viewOp,JTable view){
        
        Connection con;
        Statement st;
        ResultSet rs = null;
        String query=" ";
       String type=getType(username);
        String url="jdbc:mysql://localhost:3306/amusement";
        
        int count;
       try{
            con = DriverManager.getConnection(url,"root",Nov.DBPassword);
            st = con.createStatement();

            
            if("Genral package info".equals(viewOp)){
                rs = st.executeQuery("select packageType as package_Name ,price,minAge as minimum_age from gamespackages where packageType='"+ type +"' ");
            }
            else if("Avaliable reservation dates".equals(viewOp)){
                rs = st.executeQuery("select packID as package_Name, date from res_date where packID='"+ type +"'");
            }
            else if("Avaliable games".equals(viewOp)){
                rs = st.executeQuery("select pckgType as package_Name,gameName as game_Name from gamesnames where pckgType= '" +type+"'");
            }
            
            view.setModel(DbUtils.resultSetToTableModel(rs));
            Nov.closeDB(con,rs, st);
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error.in view");
            System.exit(1);
        }
    }
    
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
    
    
    
    
    
    
    
    
    
    
    
    
    

