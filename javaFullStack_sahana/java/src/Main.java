 class Car {

    private int speed =100 ;
    int mileage = 40;
    String name ="BMW";
    Car(){
        System.out.println("Car class has been called");
    }

    void display(){
        System.out.println(speed +" "+mileage +" "+name);
    }
    public void setName(int speed){
        this.speed = speed;
    }
    // getter
    public int getName(){
        return speed;
    }
    
}


class Vehicle{
    void start(){
        System.out.println("Bike Started");
    }
}
//single inheritance 
class Bike extends Vehicle {
    void twoWheel(){
        System.out.println("Two wheel");
    }
}
class Bus extends Vehicle{
    void fourWheel(){
        System.out.println("Four WHeel");
    }
}
class Auto extends Bike{
    void threeWheel(){
        System.out.println("Three wheel");
    }
}
public class Main {
    public static void main(String[] args) {
        //inheritance => parent -> child 
        // single inheritance => parent -> child
        // multilevel inheritance => parent ->child1-> child2
        // Hierarchical inheritance => parent -> child, parent ->child2
        
        Bus volvo = new Bus();
        volvo.fourWheel();
        volvo.start();
        
        Auto bajaj = new Auto();
        bajaj.threeWheel();
        bajaj.twoWheel();
        bajaj.start();
        
        Bike access = new Bike();
        access.twoWheel();
        access.start();
        

        Car obj = new Car();
        // System.out.println(obj.speed);
        // obj.speed = 10;
        obj.setName(30);
        // obj.mileage=10;
        // obj.name ="BENZ";
        obj.display();
        // int result = obj.getName();
        // System.out.println(result);
       System.out.println(obj.getName());
        

        //encapsulation -> binding data with method , data security 
        //public setter and public getter 

        // varialbe  => field 
        // function => method 
    }
}
