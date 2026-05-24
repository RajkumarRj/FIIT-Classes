interface inter{
   public void display();
   void run();
}

interface outer{
    void data();
}
class demo{
    
}

//hybrid inheritance (combination of class and interfce )
class HybridInheritance extends demo implements outer{

    public void data(){
        System.out.println("Data method from outer interafce ");
    }
}

// multiple inheritance (one child -> multiple parent)
class multipleInheritance implements inter, outer{
    public  void display(){
        System.out.println("display method from multiple inheritance ");
    }

     public  void run(){
        System.out.println("run method from multiple inheritance ");
    }

    public void data(){
        System.out.println("data from outer interface");
    }
}

class abstractClass implements inter{

   public  void display(){
        System.out.println("display method from abstractClass");
    }

     public  void run(){
        System.out.println("run method from abstractClass");
    }

}

public class Interface {
    // in interface we can achieve full abstraction 
    public static void main(String[] args) {
        
        System.out.println("Interface");
        abstractClass obj =  new abstractClass();
        obj.display();
        obj.run();

    }
    
}
























// programming language =>set of instructions to do a specific task 


// program vs coding 


// variables and data types 

// int  data = 10;


// int 4 bytes =>  


//     don't start with 
//             number int 123 = 10;
//             space   int total mark = 100;
//                     int total_mark = 100;
//             symbols int @#+- = 100;


//     do's
//         int total = 100;
//         int total_marks_scored_by_sancia = 100;
//         int PI = 3.14


// // data types 

// int => negative , 0 , positive number ( 4 bytes)
// long => (8 bytes)
// float => 10.00, 10.34  ( 4 bytes )
// double => 10.45 , 1.45 (8 bytes)

// literal => represent text 
// char singl = 'S';
// String name  = "fiit";

// boolean 

// boolean isEligible = true;
// boolean isAvailabe = false








