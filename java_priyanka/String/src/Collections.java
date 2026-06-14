import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

    public static void main(String[] args) {
        System.out.println("Collections");

        // array => collection of same data types 

        // int arr[10]; 
        // int arr[] ={1,2,3,4,5};
        // System.out.println(arr[0]);

        // ArrayList<String> name  = new ArrayList<>();

        // name.add("FIIT");
        
        // name.add("1");
        // name.add("2");
        // name.add("FIIT");
        // name.add("3");

        
        // // name.remove(0);
        // System.out.println(name.get(0));
        // System.out.println(name.get(2));


        // // ArrayList => 
        // //     1. allows duplicate 
        // //     2. maintain insertion order 
        // //     3. manipulation is slow 
        // //     4. random access of element is fast (using index)

        // System.out.println(name.size());
        // // name.clear();
        // System.out.println("index of  1: " +name.indexOf("FIIT"));

        // name.set(0, "Entrykode");
        // System.out.println("index of  1: " +name.lastIndexOf("FIIT"));

        // System.out.println(name.contains("Entrykodoe"));



        // System.out.println(name);

        LinkedList<Integer> marks = new LinkedList<>();

        marks.add(50);
        marks.add(50);

        marks.add(80);
        marks.add(90);

        System.out.println(marks);

        marks.remove(1);
        System.out.println(marks.size());
        System.out.println(marks.get(2));

         // Linkedlist => 
        //     1. allows duplicate 
        //     2. maintain insertion order 
        //     3. manipulation is fast 
        //     4. random access of element is fast (using index)

        
        
    }
    
}
