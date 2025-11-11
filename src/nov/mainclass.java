/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author emana
 */
public class mainclass {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emana
 */

    
    public void main(String[]args){
        try{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amusement","root", "123456");
        Statement st=con.createStatement();
        //PreparedStatement s=con.prepareStatement();
        String query="select * from admin";
        
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            int id=rs.getInt("adminID");
            System.out.println("id of admin is"+ id);
        }
        
        rs.close();
        st.close();
        con.close();}
        catch(SQLException e)
        
        {
            e.printStackTrace();
        }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

    

