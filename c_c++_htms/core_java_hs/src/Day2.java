import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        
        // int a=10;
        // int b = 20;

        // String result = (a>b) ? "A is greater" : "B is greater";

        // System.out.println(result);
        // System.out.println(result);


        Scanner inp = new Scanner(System.in);

        // System.out.print("Enter your number:");
        // int c = inp.nextInt();

        // System.out.println(c);

        // System.out.print("Enter your Float:");

        // float marks = inp.nextFloat();

        // System.out.println(marks);

        // System.out.print("Double :");

        // double PI = inp.nextDouble();

        // System.out.println(PI);

        // System.out.print("Enter your name:");

        // // String name = inp.next();
        // String name = inp.nextLine();
        // System.out.println(name);

        // System.out.print("Enter Grade: ");
        // char grade = inp.next().charAt(0);
        // System.out.println(grade);


        // boolean isEligible = inp.nextBoolean();

        // System.out.println(isEligible);

        int arr[] ={70,45,67,89,30,90};

        int max =0;
        for(int i=0; i<arr.length;  i++ ){

            if(arr[i] > max ){
                max = arr[i];
            }

            // System.out.println(arr[i]);
        }

        System.out.println(max);



        int arr2d[][] = { {1,2,3,4}, {4,5,6,4}, {7,8,9,4} };


        for(int i=0; i<arr2d.length; i++){


            // column 

            for(int j=0; j<arr2d[0].length; j++){

                System.out.print(arr2d[i][j] + " " );
            }
            System.out.println();
        }

        // jagged array 
        int jagged[][] = { {1,2,3}, {4,4}, {7,8,9,4, 8, 9} };


         for(int i=0; i<jagged.length; i++){

            // column 
            for(int j=0; j<jagged[i].length; j++){

                System.out.print(jagged[i][j] + " " );
            }
            System.out.println();
        }




    }
    
}
