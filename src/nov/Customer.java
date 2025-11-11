package nov;
import java.sql.*;

    public class Customer extends User {
    
    private String firstName;
    private String lastName;
    private String bDate;
    private String phoneNum;
    private char sex;
    private int points;
    private int rating;
    private String password;
    Guide guide;
    private int id;
    
    public Customer(String phone){ this.phone = phone;}
    public Customer(String fName, String lName, char sex, String pass, int id){
        
        this.firstName = fName;
        this.lastName =lName;
        this.sex = sex;
        this.password = pass;
        this.id = id;
    }
    
    
    public void setPassword(String password ){
        this.password = password;
    }
    public void setPhoneNumber(String phoneNum){
        this.phoneNum = phoneNum;  
    }

    public String getPassword(){
        return password;
    }
    public String getPhone(){
        return phoneNum;
        
    }

    }