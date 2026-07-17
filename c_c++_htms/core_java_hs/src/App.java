
class Demo{

    int a;
    void display(){ // method
        System.out.println("hello");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        int a = 10; // 4

        double b = a; // 8 // implicit type  conversation

        // left variable should be high in size 

        double c = 10;

        String result = a > c ? "True" : "False";

        System.out.println(result);

        int d = (int) c; // explicit 

        System.out.println(d);
        System.out.println(b);

        

        System.out.println("Java application");
    }
}
