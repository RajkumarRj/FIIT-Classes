class Malathi{
    
    int data ; //=> //field  (variable)

    Malathi(){
        data = 10;
        System.out.println("Malathi constructor");
    }
    // parametrized constructor 
    Malathi(int b){
        data = b;
    }
    // without argument and without return type
    void display(){
        System.out.println("Hello oops");
    }
    // with argument and with return type
    int add(int a , int b ){ // receive parameter
        int sum = a+b;
        return sum;
    }
    // without argument and with return type 
    double circlePI(){
        return 3.14;
    }
    // with argument and without return type 
    void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }
}





public class Ooops {

    public static void main(String[] args) {
        System.out.println("OOPS -> object oriented programming");

        // classname variable = new classname();
        int a = 50;
        int b = 40;

        Malathi obj = new Malathi(100);
        System.out.println(obj.data);
        obj.display();



        int total = obj.add(a, b); // argument 

        
        System.out.println("add function value :" + total);
        System.out.println(obj.circlePI());



        obj.multiply(30, 40, 10);
        









        Malathi obj1 = new Malathi(200);
        System.out.println(obj1.data);
        obj1.display();


          Malathi obj2 = new Malathi(350);
        System.out.println(obj2.data);
        obj2.display();
        // class  => blueprint 
        // object 
        // 4 pillars => 
        // inheritance,
        //  encapsulation, 
        // abstraction, 
        // polymorphism
    }
    
}
