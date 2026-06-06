import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection {

    public static void main(String[] args) {
        
        System.out.println("Hello there");

        ArrayList<String> list = new ArrayList<>();

        list.add("Harini");
        list.add("Imaya");
        list.add("Maha");
        list.add("Kaviya");

        System.out.println(list);

        list.set(1, "Dhoni");
        list.remove(0);

        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println(list.indexOf("Harini"));

        System.out.println(list.contains("Harini"));


        LinkedList<String> ll = new LinkedList<>();

        
        ll.add("HTML");
        ll.addFirst("DOM");
        ll.addLast("NEXT JS");

        System.out.println(ll.peek());
        ll.remove(0);
        
        System.out.println(ll);


        HashSet<String> hs = new HashSet<>();

        hs.add("Harini");
        hs.add("Harini");

        System.out.println(hs);


        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);

        ts.add(1);

        System.out.println(ts);

    }
    
}
