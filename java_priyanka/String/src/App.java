class Encapsulation{

    //class name = constructor method name
    Encapsulation(){
        System.out.println("Encapsulation constructor is called ");
    }
    // field 
    private String password = "1234";

    // methods get and set 

    public void getPassword(){
        System.out.println(password);
    }

    public void setPassword(String password){
        this.password = password;
    }

}

//this => current object 

public class App {
    public void display(){
        System.out.println("App class display method ");
    }
    public static void main(String[] args) {

        // constructor => it's also a method but special => it's call itself 
        // when object create 
        // method => call 

        // default constructor (no argument )
        // parametized constructor 
        // copy constructor 

        Encapsulation encap = new Encapsulation();
        // System.out.println(encap.password);
        // encap.setPassword("4567");
        // encap.getPassword();
        // encap.Encapsulation();





        System.out.println("hello there");

        // class => blueprint => don't create memory
        //object => instance of class => create in memory 

        // stack & heap 

        // classnmae objRefernce = new classname()
        App obj = new App();
        obj.display();
        

        // four pillars => Encapsulation, inheritance,abstraction, polymorphism
        // encapsulation => bind data with method 

    }
    
}
