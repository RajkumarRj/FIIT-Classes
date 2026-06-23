import java.util.ArrayList;

public class Collections {
    
    public static void main(String[] args) {
        System.out.println("Collections");

        ArrayList<String> lt = new ArrayList<>();

        lt.add("FIIT");
        lt.add("FIIT");
        lt.add("1");
        lt.add("2");
        lt.add("3");

        lt.remove("FIIT");

        lt.set(3, "Academy");
        System.out.println(lt.contains("dfasd"));

        System.out.println(lt);

        System.out.println(lt.get(0));

        System.out.println(lt.size());



        // ArrayList<Integer> ltt = new ArrayList<>();

        // wrapper class => primitive to non primitive 



        // list interface 
            // allow duplicates 
            // maintains insertion order 

        // arraylist 
            // manipulation is slow 
            // accessing element is fast (because index)





    }
}
