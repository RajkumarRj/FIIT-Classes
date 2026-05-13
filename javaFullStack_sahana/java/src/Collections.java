// interface CollectionArray{
//     void add();
//     int data =10;
// }

// class Arraylistss implements CollectionArray{

//     public void add(){
//         System.out.println("Add method added");
//     }
// }

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        System.out.println("Collections");
        // arraylist -> allow duplicate elements, maintain insertion order 
        // non-synchronized , manipulation is very slow , access element is fast (index)
    

        ArrayList<Integer> list = new ArrayList<>();


        list.add(2);
        list.add(1);
        list.add(6);
        list.add(10);
        list.add(3);
        list.add(2);

        // System.out.println(list[0]); X 
        System.out.println(list.get(0));

        System.out.println(list.size());
        list.remove(2);
        list.sort(null);

        list.set(2, 20);

        System.out.println(list.contains(21));
        // list.clear();
    
        System.out.println(list);

        // System.out.println(list.get(0));
        // int -> integer object 

        // List interface -> class ( arraylist, linkedlist)


        LinkedList<String> li = new LinkedList<>();

        li.add("Apple");
        li.add("Banana");
        li.add("Carrot");

        
        li.addFirst("First");
        li.addLast("Last");
        
        
        System.out.println(li.peek());
        
        System.out.println(li.remove());
        
        
        System.out.println(li);
    }
    
}
