package package1;

public class user {

    // access specifier 

    // private => accessible within the same class 
    // default => accessible within the same package
    // protected => accessible within the same package + subclasses (via inheritance)
    // public  => access anywhere in the code




    //             same class      same package    different package 
    // private         yes              No              No 
    // default         yes              Yes             No
    // protected       yes              yes             Yes(via inheritance)
    // public          Yes              yes             yes


   private  String name = "Padma";

   int rollno = 123;

   protected int salary = 50000;

   public String role = "Software developer";

   private void display(){
    System.out.println("hello there");
   }
   public void setName(String name){
    this.name  = name;
    display();

   }

   public String getName(){
    return name;
   }
    
}
