public class oops {
    private int data;
    String name;
    oops(){
        System.out.println("constructor called");
    }
    oops(int value , String name){
        data = value;
        this.name = name;
    }
    oops(oops original){
        this.data = original.data;
        this.name = original.name;
    }

    void setName(String name){
        this.name = name;
    }

    void setData(int data){
        this.data = data;
    }
    // class => blueprint 
    // object => instance of a class 
    // variable ( fields) 
    // function (method)  
    void displayInfo(){
        System.out.println(data + " updated value "+name );
    }
    public static void main(String[] args) {
        
        // oops obj = new oops();
        // obj.data = 60;
        // obj.displayInfo();
       
        // oops obj1 = new oops(100 , "FIIT");
        // // obj1.data = 20;
        // obj1.displayInfo();
        // oops copyObj = new oops(obj1); // copy constructor
        // copyObj.displayInfo();

        // encapsulation => setter and getter

        oops encap = new oops();
        encap.setData(40);
        encap.setName("FIIT");
        encap.displayInfo();

        // constructor => special method or function 
        // call itself => when object created 
        // (){

        // }
        // default constructor (no  argument constructor)
        // parameterized constructor 
        // copy constructor 
    }

}
// cd => change directory 
// ls => list

// javac oops.java => oops.class 