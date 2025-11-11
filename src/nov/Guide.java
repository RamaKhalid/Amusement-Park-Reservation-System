package nov;

public class Guide extends User {
    int guideId;
    String fullName;
   public String username;
    String shift;
    double salary;
    
   public Guide(){}
   Guide(int guideId, String fullName)
   {
      this.guideId = guideId;
      this.fullName = fullName; 
   }
   public Guide(String firstName,String lastName,char sex,String pass,int id,String username,double salary,String shift)
   {
        this.firstName=firstName;
        this.lastName=lastName;
        this.sex=sex;
        this.pass=pass;
        this.id=id;
        this.username=username;
        this.salary= salary;
        this.shift= shift;
   } 
   
    public double getSalary(){
        return this.salary;
    }
    
    public String getShift(){
        return this.shift;
    }
    
    public String getUsername(){
        
        return this.username;
    }
    
    public void setUsername(String username){
        this.username=username;
        
    }
    
    public void setShift(String shift){
        this.shift=shift;
    }
    
   
}