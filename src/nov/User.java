
    package nov;

    public class User {
    
    
    String firstName;
    String lastName;
    char sex;
    String pass;
    int id;
   public static String phone = "";
    
    public User(){}

    public User(String fName, String lName, char sex, String pass, int id, String phone){
        
        this.firstName=fName;
        this.lastName=lName;
        this.sex=sex;
        this.pass=pass;
        this.id=id;
        this.phone = phone;
        
        
    }
    
    public void setPassword(String password ){
        this.pass=password;
        
        
    }
    
    public static User getUser(User user){ return user;}
   

    }