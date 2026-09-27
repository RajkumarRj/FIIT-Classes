import java.util.*;


public class Collection {

    public static void main(String[] args) {


        // ordered data, duplicate values, index based

        ArrayList<String> students = new ArrayList<>();


        students.add("Divya");
        students.add("Sahana");
        students.add("Padma");

        students.add("Sahana");
        students.add("Sahana");

        Collections.reverse(students);

        System.out.println( Collections.max(students));
        System.out.println( Collections.min(students));
        System.out.println( Collections.frequency(students, "Sahana"));


        // Collections.fill(students, "java");




        // System.out.println(students.get(3));

        // students.set(0, "FIIT");

        // students.remove(0);

        // System.out.println(students.contains("Sahana"));

        System.out.println(students);

        // System.out.println(students);

        // // students.addFirst("FIIT");
        // for (String stu : students) {
        //     System.out.println(stu);    
        // }


        // array -> continous memory 
        // Linkedlist 
        // LinkedList<Integer> rank = new LinkedList<>();

        // rank.add(1);
        // rank.add(2);

        // System.out.println(rank.get(0));

        // System.out.println(rank.contains(2));
        // System.out.println(rank);



        // Stack 
        // Stack<String> books = new Stack<>();

        // books.push("Java");
        // books.push("Python");
        // books.push("SQL");

        // books.pop();

        // System.out.println(books.peek());

        // System.out.println(books);




        // set interface -> no duplicated values, not index based 



        HashSet<String> skills = new HashSet<>();


        skills.add("Java");
        skills.add("Java");
        skills.add("Python");

        System.out.println(skills);



        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Bangalore");

        System.out.println(cities);



        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);


        // queue => FIFO (first in first out)



        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(3);
        queue.add(2);
        queue.add(1);

        System.out.println(queue);


        // Map interface 

        // what is map 
        
        // HashMap<Integer, String> students = new HashMap<>();


        // students.put(101, "Divya");
        // students.put(102,null);


        // System.out.println(students.get(101));
        // students.remove(102);

        // boolean result = students.containsKey(101);
        // System.out.println(result);

        // result = students.containsValue("FIIT");
        // System.out.println(result);

        // System.out.println(students);


        // LinkedHashMap<Integer, String> student1 = new LinkedHashMap<>();

        // TreeMap<Integer, String> students = new TreeMap<>();

        // students.put(10,"Divya");
        // students.put(1, "FIIT");
        // students.put(5,"Padma");

        // System.out.println(students);


       













        
        // collection is a framework used to store and manage 
        // multiple objects dynamically

        // int -> Integer  => (wrapper class)
        // float -> Float
        // String 
        // boolean -> Boolean
        // double -> Double


        // arrays -> fixed size 
        // collections -> dynamic size 


       
    }
    
}
