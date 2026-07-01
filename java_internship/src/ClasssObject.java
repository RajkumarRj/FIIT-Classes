class Demo{

    int a;   // field 

    Demo(){ // default constructor
        a = 100;
        System.out.println("Constructor is called");
    }
    // parameterized constructor 
    Demo(int b){
        a = b;
        System.out.println("Parameterized constructor called");
    }

    void display(){ // method 
        System.out.println("Display method");
    }

    int sum(int a, int b){ // parameter
        int total = a+b;
        return total;
    }
}

public class ClasssObject {
    public static void main(String[] args) {

        Demo obj = new Demo();
        System.out.println(obj.a);

        Demo obj1 = new Demo(30);
        System.out.println(obj1.a);
        // Demo obj2 = new Demo();
        // Demo obj3 = new Demo();
        // Demo obj4 = new Demo();


        // System.out.println(obj.a);
        // obj.display();

        // int result = obj.sum(10,30); // argument 
        // System.out.println(result);

    }
    
}
