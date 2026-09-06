public class Day2 {

    public static void main(String[] args) {
        
        System.out.println("String methods");

        // string literal => SCP (String consant pool)

        String name = "Divya";


        // imumutable => unchangeable

        System.out.println(name.length());

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf('D'));

        System.out.println(name.lastIndexOf('D'));

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.trim());

        System.out.println(name.replace("ya", "apple"));

        System.out.println(name.contains("i"));

        System.out.println(name.startsWith("Diva"));

        System.out.println(name.endsWith("vya"));

        // substring  
        // start index , end index -1
        // 0 - 2
        String fiit = "Fiit academy java course";
        System.out.println(fiit.substring(5, 12));


        String first = "Hello";
        System.out.println(first.concat(" World"));
        System.out.println(first + " world");

        String empty = "";

        System.out.println(empty.isEmpty());


        String text = "Java,Python,C++";

        System.out.println(text);

        String  languages[] = text.split(",");

        for(String i : languages){
            System.out.println(i + " ");
        }



        String result = String.join("", "Divya", "1stRank", "VIT");

        System.out.println(result);


        // string equal => 0 
        // first string is greater > positive 
        // second string is greater  > negative
        // dictioniary based (Lexicographically )

        System.out.println("A".compareTo("a"));

        // ASCII code  a = 97 A =65, 
        // compareToIgnorCase 


        System.out.println("FIIT".compareToIgnoreCase("a"));



        // convert any primitive values to string 

        int age = 22;
        String s = String.valueOf(age);

        System.out.println(s);

        System.out.println();


        // StringBuilder vs StringBuffer 

        // mutable objects 

        String ss ="Java";

        ss = ss + " Programming";

        ss = ss + " Language";

        System.out.println(ss);

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.capacity()); // 16 +string length

        sb.append(" programming");
        sb.append(" Full stack");

        sb.insert(4, " Core");

        sb.delete(10, 21);

        sb.replace(0, 4, "Python");

        // System.out.println(sb.reverse());


        System.out.println(sb.capacity());

        // System.out.println(sb.length());

        sb.setCharAt(2, 'y');
        System.out.println(sb.charAt(2));


        System.out.println(sb);



        // String buffer => thread safe

        // wrapper class 
        // int , float 
        // autoboxing 
        // automatic conversation of a primitive to wrapper object 

        int number = 100;

        Integer valueee = number;


        System.out.println(valueee);


        // unboxing 
        Integer num = 100;
        int value = num;

        System.out.println(value);


        String agee = "2";

        // number vs parseint 

        int numberrr = Integer.parseInt(agee);

        // float -> Float 
        // double -> Double 
        // boolean -> Boolean 
        // char -> Character 
        

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.compare(20,20));

        System.out.println(Integer.sum(10, 20));
        System.out.println(Integer.max(10, 20));
        System.out.println(Integer.min(10, 20));

        System.out.println(Character.isDigit('t'));
        System.out.println(Character.isLetter('5'));

        // palindrome 
        // madam   => madam
        // divya => ayvid 

        String firstt = "madam";
        String reverse = new StringBuilder("madam").reverse().toString();


       
        StringBuilder sbb = new StringBuilder("DFSD");
        System.out.println(firstt.equals(reverse) ? "Palindrome":"Not plaindrome");




        // oop  => object oriented programming 
        // class, object , inheritance, polymorphism, abstraction, encapsulation 

        // programing => set of instructions 

    }
    
}
