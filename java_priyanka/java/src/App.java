import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //conditional statement
        // if , if else, else if, nested if, switch statement

        int count =10;
        if(count > 10){
            System.out.println("Statement is true");    
        }else{
            System.out.println("count is not greater than 10");
        }


        // if(condition){

        // }else if (condition2){

        // }else if(conditon3){

        // }else if(conditon4){

        // }
        int marks = 85;

        if(marks > 90){
            System.out.println("Grade O");
        }else if(marks>80){
            System.out.println("Grade A+");
        }else if(marks>70){
            System.out.println("Grade B");
        }

        // nested if => if inside another if 

        int age = 18;
        boolean voterId = true;

        if(age >=18){
            if(voterId){
                System.out.println("you are eligible for voting");
            }

        }else{
            System.out.println("age is less than 18");
        }


        //switch statement

        int a =1;

        switch(a){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            default:
                System.out.println("no matching value");
        }     
        
        //loops for, while, do while 

        // => we know the iteration count
        for(int i=1; i<=10; i++){
            if(i==5) continue;
            System.out.println(i);
        }


        // while 
        // we don't know the iteration count but we know condition

        // boolean isActive = true;
        // int i=1; // intialization
        // while(isActive){
        //     System.out.println(isActive);
        //     if(i== 30){
        //         isActive = false;
        //     }
        //     i++;
        // }



       //do-while loop

    //    int i = 30;

    //    do{
    //     System.out.println(i);
    //     i--;
    //    }while(i<=5);  

    Scanner obj = new Scanner(System.in);

    // int num = obj.nextInt();
    // String str = obj.nextLine();
    // float num2 = obj.nextFloat();
    // boolean isEligible = obj.nextBoolean();
    // char single = obj.next().charAt(0);

    

    // System.out.println(num);
    // System.out.println(num2);
    // System.out.println(isEligible);
    // System.out.println(single);
    // System.out.println(str);

    //array => contiguous memory location 

    int arr[] = {10,20,30};

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    // System.out.println(arr[3]);



   







        
   
      









    }
}
