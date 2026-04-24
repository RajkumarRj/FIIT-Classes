public class bitwise {
    public static void main(String[] args) {
        System.out.println("Hello bitwise");

        // bitwise operator  => AND, OR, XOR, ~, >>, <<

        int a= 3;
        int b= 5;

        System.out.println(a>>1);
        System.out.println(a<<2);
        // 0000 -> 0
        // 0010 -> 1
        // 0100 -> 2
        // 0110 -> 3
        // 1000 -> 4
        // 1010 -> 5
        // 1100 -> 6
        // 1110 -> 7
        System.out.println(a & b);
        System.out.println(a | b);
        // 0110
        // 1010
        // ----
        // 1110
        System.out.println(a ^ b); 
        // 0110
        // 1010
        // ----
        // 1100
        // strict or either true or false 
        System.out.println(~a);
        // 0110 -> 1001
        // 0111 -> 1000


        // ternary operator 

        boolean isEligible = false;

        String value = isEligible ? "Eligible to vote" : "not eligible to vote";

        System.out.println(value);

        // conditional statement 

        // controls flow of the program 

        // if, if else, else if , nested if, switch case 

        if(true){
            System.out.println("statement is true");
        }


        if(true){
            System.out.println("true");
        }else{
            System.out.println("False");
        }    

        // nested if 

        int age = 10;
        boolean voterId=true;

        if(age>=18){
            if(voterId){
                System.out.println("you are eligible for vote");
            }else{
                System.out.println("you don't have voter id ");
            }
        }else{
            System.out.println("you are not eligible to vote your age is less then 18 ");
        }

        // else if ladder 

        int mark = 80;


        if(mark >= 90){
            System.out.println("O");
        }else if (mark >=80){
            System.out.println("A");
        }else if(mark >= 70){
            System.out.println("B");
        }else if (mark >= 40){
            System.out.println("Just pass");
        }else{
            System.out.println("Fail");
        }

        // switch case 
        // String name ="fiit";

        switch(mark){
            // case "academy":System.out.println("academy");
            // break;

            // case "fiit":System.out.println("FIIT");
            // break;
            case 90: System.out.println("O");
            break;

            case 80:System.out.println("A");
            break;
    
            case 50: System.out.println("pass");
            break;

            default:System.out.println("Fail");
            break;
        }



        // loops

        // for , while, do-while 

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);

        // for loop 
        // for(initilization, condition, increment/decrement){
            // block of code 
        // }

        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }

        // task to print only even number from 1 to 100

        // for(int i=2; i<=100; i+=2){
        //     System.out.println(i);
        // }

        // while loop 
        

        // 1 <=10 => true;  

        // while(check <=10){
        //     System.out.println(check++);
        //     // check++;    
        // }

        //  while(mark>=90){
        //     System.out.println(mark); 
        // }

        // do {
        //     System.out.println("your grade is A");
        //     mark--;
            
        // } while (mark>=90);
        // 80 >= 90 -> false 
         
    }
    
}
