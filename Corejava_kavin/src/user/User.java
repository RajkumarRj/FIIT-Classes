package user;

public class User {

     private int roll_no = 123; // within the same class 

     int marks = 85;
    //  default specifier  => access within same package 
    
    public int total = 500;

    protected int salary = 50000;

    



     void displayRollNo(){
        System.out.println(roll_no);
     }
    
}
