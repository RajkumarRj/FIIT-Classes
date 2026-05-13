class Car{
    String color;
    int speed;

    Car(){ //constructor 
        color ="Red";
        speed =40;
        System.out.println("Car constructor is called");
    }
    // types of constructor -> default/non-parameterized , parameterized 

    Car(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    void start(){
        System.out.println("Car started");
    }

    void accelerate(){
        speed += 10;
    }
}



public class oops {


    public static void main(String[] args) {

        // Car obj = new Car();
        Car obj = new Car("Blue", 60);


        System.out.println(obj.color);
        obj.start();
        obj.accelerate();
        System.out.println(obj.speed);
        // constructor -> special type of method 
        Car obj1 = new Car("Green", 100);

        System.out.println(obj1.color);
        System.out.println(obj1.speed);







        
        System.out.println("OOPS");
        // object oriented programming 
        // programming paradigm that organizes software design 
        // around objects rather than functions 

        // class & objects 
        // four pillar -> inheritance, polymorphism, abstraction, encapsulation



    }
    
}
