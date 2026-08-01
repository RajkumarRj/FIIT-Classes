import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {
        // System.out.println("Collections");

        // framework  => predefined structures 

        ArrayList<Integer> names = new ArrayList<>();

        names.add(1);
        names.add(3);
        names.add(2);
        names.add(3);
        // // names.remove(0);
        // names.set(0, 100);

        // System.out.println(names.get(0));

        // System.out.println(names.contains(1000));

        // int arr[] = {1,2,3,4,5};

        // arr[2]  = 40;


        HashSet<String> hs = new HashSet<>();

        hs.add("Ravi");

        hs.add("Ravi");
        System.out.println(hs);

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(5);
        ts.add(1);
        ts.add(100);

        System.out.println(ts);

        HashMap<Integer , String> hm = new HashMap<>();


        // hm.put(1, "Harini");
        // hm.put(2, "Subhiksha");
        // hm.put(3, "manisha");

        // System.out.println(hm.values());



        // harini => 
        //     h - 1
        //     a - 1
        //     r - 1
        //     i - 2
        //     n - 1

        HashMap<Character , Integer> freq = new HashMap<>();

        String name = "harini";

        // h a r i n i 
        
        for(char c : name.toCharArray()){

            freq.put(c, freq.getOrDefault(c, 0 ) + 1); 
            
            System.out.println(c);
            
        }

    


        

        // System.out.println(arr.length);


        // names.remove(2);
        // // names.clear();
        // System.out.println(names);
        // System.out.println(names.size());

        // System.out.println(names.lastIndexOf(3));

        // LinkedList<String> ll = new LinkedList<>();

        // ll.offer("Subhiksha");
        // ll.addFirst("Harini");
        // ll.add("Manisha");



        // System.out.println(ll.peek());
        
        // System.out.println(ll.poll());
    //    String linked = ll.pop();

    //    System.out.println(linked);

        
        
    //     System.out.println(ll);
        



        // int -> primitive 
        // Integer -> non-primitive 

        // arraylist
        // linkedlist
    }
    
}
