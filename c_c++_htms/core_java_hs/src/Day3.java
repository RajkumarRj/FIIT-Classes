public class Day3 {

    public static void main(String[] args) {
        

        // System.out.println("Linear search");

        String name = "FIIT"; // string literal 
        // SCP => String constant pool 
        String name1 = "fiit";
        
        // String name1 = new String("FIIT"); 
        // System.out.println(name == name1); 

        // System.out.println(name.equals(name1));

        // string method 

        


        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("I"));
        System.out.println(name.lastIndexOf("I"));

        System.out.println(name);
        System.out.println(name.trim());

        System.out.println(name.equalsIgnoreCase(name1));

        System.out.println(name.contains("Tuu")); // returns true or false 

        System.out.println(name.substring(0, 2)); // endindex n-1 -> 2-1 = 1

        System.out.println(name.replace("F", "f"));

        System.out.println(name.startsWith("TFI"));
        System.out.println(name.endsWith("T"));

        System.out.println(name.concat(" Academy"));
        // int arr[] = {10,40,30,56,79,98,100,340};


        // int max =0 ;
        // for(int i=0; i<arr.length; i++){

        //     if(arr[i] > max){
        //         // 10 > 0
        //         max = arr[i];
        //     }

        // }


        // System.out.println(max);


    }
    
}
