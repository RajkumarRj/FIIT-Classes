 class Car{

    // blueprint  
     String color = "blue";
    int speed;

    void start(){
        System.out.println("Car started" );
    }

    void accelerate(){
        System.out.println("accelerated");
    }
}


public class App {

    public void sayHello(){
        System.out.println("Hello sayHello method"); 
    }
   

    public static void main(String[] args) throws Exception { // thread 



        Car car = new Car();

        car.start();
        car.accelerate();
        System.out.println(car.color);

        // encapsulation  => binding data and methods together 
        // inheritance => parent -> child 
        // polymorphism => method overloading & method overriding
        // abstraction => hiding internal implementation  , coffee brewing machine  


        App obj = new App(); // object creation 

        obj.sayHello();
        //string => sequence of character , non-primitive

        // memory => stack , heap 

        // stack => primitive data types, method calls 

        // heap => non primitive data types 

        //using literal
        String s1 = "hello"; // string constant pool
        String s3 = "hello";
        //using new keyword
        String s2 = new String("hello");
        String s4 = new String("hello");

        // string methods 

        System.out.println(s2.length());

        System.out.println(s1.charAt(1));

        System.out.println(s1.indexOf('o'));

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1);
        System.out.println(s1.trim()); // trim the whitespace

        System.out.println(s1.equals(s2)); // only content (value)


        System.out.println(  s1 == s3 ); // == check for reference 

        System.out.println(s2==s4);

        System.out.println(s2.equalsIgnoreCase("Hello"));


        System.out.println(s2.contains("el"));

        System.out.println(s1.substring(1,4));


        System.out.println(s1.replace('l', 'i')); // hello => e -> i

        System.out.println(s1.startsWith("he"));

        System.out.println(s1.endsWith("lo"));


        System.out.println(s1.concat(" World"));
        System.out.println(String.valueOf(190));

        // string => immutable -> cannot modify

        // stringbuilder and string buffer => mutable 

        // string builder => not synchronized , no thread safety  , faster in single threaded

        StringBuilder sb = new StringBuilder("Hello"); // default size 16 

        sb.append(" World");

        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.delete(5, 7);
        System.out.println(sb);

        sb.replace(0, 4, "Fiit");
        System.out.println(sb);
        System.out.println(sb.reverse());

        System.out.println(sb.length());
        String str = sb.toString();
        System.out.println(str);
        StringBuffer sf = new StringBuffer(); // default size 16  , synchronized , thread -safe

        // newCapacity = (old *2) +2 =>  (16 *2) +2 => 34  => (34 * 2)+2 => 70
        System.out.println(sf.capacity());

        // 0 , 1 , 2 , 3 => fiit


        // h -> 0
        // e ->1
        // l-> 2
        // l -> 2
        // o->4 
        // , -> 5,
        // -> 6
    }
}
