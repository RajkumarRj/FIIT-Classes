
// class Final => cannot extend that class
// method Final  => cannot override the method to subclass
// variable final  => cannot change the values 



final class Bank{

    final int salary = 10000;

    final void greet(){
        System.out.println("Greeting method");
    }
    
}


// class Branch extends  Bank{
//     void greet(){
//         System.out.println("Welcome to TVM branch");
//     }
// }

public class Final {
    public static void main(String[] args) {
        

        Bank obj = new Bank();

        // obj.salary = 20000;

        obj.greet();
        System.out.println(obj.salary);
        
    }
}
