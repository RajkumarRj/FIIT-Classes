public class twoDArray {

    public static void main(String[] args) {
        

        System.out.println("Two D Array ");

        int arr[][] = {  {1,2,3} , {4,5,6}, {7,8,9}    };


        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);


        int sum =0 ;


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];    
            }
            System.out.println();
        }


        System.out.println(sum);

        // 1 2 3 
        // 4 5 6 
        // 7 8 9 

        // String is not a primitive data type
        // String is non primitive data type 

        // java string is class 

        String name = "Malathi Core Java";
        String name1 = "Malathi";

        System.out.println(name == name1);

        System.out.println(name);


        String name2 = new String("Malathi");

        System.out.println(name == name2);

        System.out.println(name.equals(name2));

        // mutable => changeable 

        // immutable => unchangeable 

        // String methods 

        System.out.println(name.length());

        System.out.println(name.charAt(5));

        System.out.println(name.indexOf('a'));

        System.out.println(name.lastIndexOf('a'));

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.contains("thi"));

        System.out.println(name.substring(8, 12)); // n-1 => 7-1 -> 6
        
        System.out.println(name.endsWith("i"));

        System.out.println(name.startsWith("Cor"));

    }
    
}
