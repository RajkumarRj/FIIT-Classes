import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        // System.out.println("Arrays");

        // array -> data structure , contingous memory 

        // primitive -> stack 
        // non-primitive -> heap , no-fixed size 

        // let arr =[1,2,4] // javascript 

        // int arr[] = {1,2,3,4,5,6}; // 1D 
 
        // int size = arr.length;

        // System.out.println(size);

        // System.out.println(arr[0]);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int i : arr){
        //     System.out.println(i);
        // }


        // multi-demensional array // 2D

        // int multi[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // row = 4, col = 2


        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(multi[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // int multi2[][]={
        //     {1,2},
        //     {3,4},
        //     {5,6},
        //     {7,8}
        // };

        // for(int i=0; i<4; i++){
        //     for(int j=0; j<2; j++){
        //         System.out.print(multi2[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // jagged array each row has different columns 


        // int jagged[][] = {
        //     {1,2,3},
        //     {4,5},
        //     {6}
        // };

        // System.out.println(jagged[1].length);


        //  for(int i=0; i<3; i++){
        //     for(int j=0; j<jagged[i].length; j++){
        //         System.out.print(jagged[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        Scanner inp = new Scanner(System.in);

        // int size = inp.nextInt();

        // System.out.println(size);

        // float value = inp.nextFloat();

        // System.out.println(value);

        // double mark = inp.nextDouble();

        // System.out.println(mark);

        // String name = inp.next();

        // String name = inp.nextLine();
        // System.out.println(name);

        // char grade = inp.next().charAt(1);

        // System.out.println(grade);


        System.out.print("Enter array siize: ");
        int size = inp.nextInt();

        int arr[] = new int[size];

        System.out.println(arr.length);

        for(int i=0; i<arr.length; i++){
            arr[i] = inp.nextInt();
        }


        for(int i :arr){
            System.out.println(i);
        }

    }
}
