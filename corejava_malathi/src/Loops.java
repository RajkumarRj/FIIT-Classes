public class Loops {
    
    public static void main(String[] args) {
        
        System.out.println("Hello");


        // for , while, do while loop 



        for( int i=1; i<=10;  i ++ ){

            if(i % 2 != 0){
                // System.out.println("Even numbers: " + i);
                System.out.println("Odd numbers: "+ i);
            }
            // System.out.println(i);
        }
        // while loop 
        int j=10;
        
        while(j>=1){

            System.out.println(j);
            j--;
        }

        // do-while loop 
        int k=1;

        do {
            System.out.println("Do-While loop "+k);
            k++;
        } while (k==0);

        // jump statements

        // break , continue 

        for(int i=1; i<=10; i++){

            if(i == 5){
                // break; stops the iteration
                continue; // skips the current iteration
            }

            System.out.println(i);
        }


        //arrays 

        int marks = 90 ;


        int arr[] = {10,20,30,40,50};


        System.out.println(arr);

        arr[3] = 90;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for(int i=0; i<arr.length; i++){
            System.out.println("For loop: "+arr[i]);
        }





        
    }
}
