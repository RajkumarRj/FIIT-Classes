import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        // System.out.println("Array");

        // array => data structure , non primitive , continous memory location , using index
        // 1000 records => index value store arr[999];

        // single dimensional
        // int arr[] = {1,2,3,4,5};
        // System.out.println(arr.length);
        // arr[0] = 10;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // i =0 ,i<5, i++
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = i+10;
        //     System.out.println(arr[i]);
        // }

        // int data;

        Scanner inp = new Scanner(System.in);
        // System.out.print("Enter array size: ");
        // data = inp.nextInt();


        // int userArray[] = new int[data];

        // for(int i=0; i<data; i++){
        //     System.out.print("Enter " + i + "th element");
        //     userArray[i] = inp.nextInt();
        // }

        // for(int i=0; i<userArray.length; i++){
        //     System.out.print(userArray[i]+" ");
        // }

        // two dimensional array => row and column 

        // int [][] arr = {{1,2}, {3,4},{5,6}};
        // int row , col;
        // row = inp.nextInt();
        // col = inp.nextInt();

        // int [][] userArray = new int[row][col];

        // for(int i=0; i<row; i++){

        //     for(int j=0; j<col; j++){
        //         System.out.print("Enter "+ i+" row and "+j+" column: ");
        //         userArray[i][j] = inp.nextInt();
        //     }
        // }


        // arr[0][0] = 18;
        // System.out.println(arr[0][0]);
        // System.out.println(arr[0][1]);
        // System.out.println(arr[1][0]);
        // arr[1][1]=7;
        // System.out.println(arr[1][1]);

        // System.out.println(arr.length);
        // System.out.println(arr[0].length);

        // for(int i=0; i<userArray.length; i++){

        //     for(int j=0; j<userArray[0].length; j++){
        //         System.out.print(userArray[i][j] +" ");
        //     }
        //     System.out.println();

        // }


        //jagged array => row fixed but column different
        
        int [][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        // for(int i=0; i<jagged.length; i++){
        //     for(int j=0; j<jagged[i].length; j++){

        //         System.out.print("Enter "+i+" row and "+j+" column: ");
        //         jagged[i][j] = inp.nextInt();
        //     }
        // }
         for(int i=0; i<jagged.length; i++){

            for(int j=0; j<jagged[i].length; j++){
                System.out.print(jagged[i][j]+" ");

            }
            System.out.println();
        }


        int arr[] = {1,2,3,10,40,60,10,20};

        int max = arr[0];
        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);

        // string => non- primitive , java=> class 

        // string literal => stores in string constant pool
        String name ="Priyanka";
        String userName ="Priyanka";

        System.out.println(name.equals(userName));
        System.out.println(name == userName);

        String difName = new String("Priyanka");


        System.out.println(name.equals(difName)); // check only value 
        System.out.println(name == difName); //check for reference 

        // two dimensional
        // jagged array 

    }

}
