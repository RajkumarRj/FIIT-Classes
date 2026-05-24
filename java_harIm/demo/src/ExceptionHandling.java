
enum LEVEL{
    HIGH,
    MID,
    LOW
}

public class ExceptionHandling {

    static  void display(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied");
        }
    }

    public static void main(String[] args) {

        int data = 10;
        LEVEL l = LEVEL.HIGH;
        System.out.println(l);

        // ExceptionHandling obj = new ExceptionHandling();
        // obj.display(10);
        
        display(20);
        System.out.println("Exception handling");
       
        try {
    
            String num = "abc";
            int resultNum = Integer.parseInt(num); 
            int arr[]= {1,2,3};
            System.out.println(arr[5]);
            
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("dlkafjsdlkfajflk");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        // finally{
        //     System.out.println("Exception is over");
        // }
        System.out.println("End of the program ");

    }
    
}

// operators => is a special symbol that tells compiler to do specific operation 

// unary operator => ++, -- => need only one operand 

// binary operator => need two operand 

// arithmetic => +, -, /, *, %
// , relational,  => > , <, >=, <=, == , !=
//  logical, => && , ||, !
// assignment, => += , -=, */, /=, %= 
//  bitwise  => & | >> <<  ^ 



// 4 & 5


// 0100
// 0101

// 0100 => 4


//    0100>>1

//    1000 

//    0100 <<1

//    0010




// control structures 

// conditional statement , loops 



int data = 10;

int a = 20;

int value; // declaration (default 0 )

value = 10;  // initiazliation 




int a = 10;
int b = 20;
 


// nested if

int age = 18;

boolean voterid = false;


if( age >= 18){

    if(voterid){

        System.err.println("You are eligible to vote");
    }else{
        System.out.println("You don't have voter id ");
    }

}else{
    System.out.println("you are less than 18");
}



// else if ladder or if-else-if

int marks = 100;


if( marks >= 90   &&    marks <=100  ){
    System.out.println("A");
}else if(marks >=80 ){
    System.out.println("B");
}else if(marks >=70){
    System.out.println("C");
}else if(marks < 35){
    System.out.println("You are fail");
}

// switch 
String name = "Nila";

switch(name){
    // marks == 90
    case "Nila":
        System.out.println("A");
        break;
    case 80:
        System.out.println("B");
        break;
}

























 


   














