class Employee{
    int salary = 50000; // field 

    void display(){
        System.out.println("Employee display method");
    }
}


public class StringOops {

    public static void main(String[] args) {

        
        Employee obj = new Employee();
        Employee obj1 = new Employee();


        System.out.println(obj.salary);
        obj.display();

        System.out.println(obj1.salary);
        obj1.display();

        
        // System.out.println("Hello there");

        // // string -> sequence of character 

        // String name = "FIIT"; // non-primitive (heap)

        // String name1 = "FIIT"; //string literal (scp)

        // System.out.println(name==name1); // == checks for reference


        // String name2 = new String("fiit"); //create new object

        // System.out.println(name2);

        // System.out.println(name ==  name2); //

        // System.out.println(name.equals(name2)); // checks only for value 


        // // string -> immutable (unchangeable)

        // // string methods 
        // System.out.println(name.length());
        // System.out.println(name.charAt(3));
        // System.out.println(name.indexOf('I'));

        // System.out.println(name.lastIndexOf('I'));

        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.trim());
        
        // System.out.println(name.equals(name2));

        // System.out.println(name.equalsIgnoreCase(name2));
        // System.out.println(name.contains("FI"));

        // System.out.println(name.substring(0,3));
        // // substring -> n-1 -> 3-1 -> 2 
       
        // System.out.println(name.replace("II", "AA"));
        // System.out.println(name); // FIIT OR FAAT

        // System.out.println(name.startsWith("F"));
        // System.out.println(name.endsWith("IIT"));

        // System.out.println(name.concat(name2));



        // 8608826745 
        // string builder vs string buffer 

        // string builder -> mutable , non-synchronized 

        StringBuilder sb = new StringBuilder("Academy");
        sb.append("FIIT");
        sb.insert(7, " ");
        sb.delete(0, 7);

    
        System.out.println(sb);

        // string buffer -> mutable , synchronized 

        StringBuffer sf = new StringBuffer("Coursee");
        sf.append("FIIT");
        sf.insert(7, " ");
        sf.delete(0, 7);
        System.out.println(sf);
        // javascript -> single-threaded 
        // process vs thread 


        // class and object  
    
        

    }
    
}
