

// public class Main
// {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 		//string -> 
// // 		data types => primitive and non-primitive 

//         // primitive => fixed size eg : int -> 4 bytes 
//         // non-primitive => no fixed size eg: object ,array , string 
        
//         // memory => stack and heap 
        
//         // heap => garbage collector 
//         // String literal 
//         String name ="fiit";
//         String name1="FIIT";
        
//         System.out.println(name == name1);
        
//         String name2= new String("FIIT");
        
//         System.out.println(name == name2);
//         System.out.println(name.equals(name2));
        
//         // String is immutable => not changeable
        
        
//         //string methods 
//         System.out.println(name.length());
//         System.out.println(name.charAt(1));
        
//         System.out.println(name.indexOf("I"));
        
//         System.out.println(name.lastIndexOf('I'));
        
//         System.out.println(name.indexOf('I'));
        
//         System.out.println(name.toUpperCase());
        
//         String upperCase = name.toUpperCase();
        
//         System.out.println(upperCase);
        
//         System.out.println(name.toLowerCase());
        
//         String spaceTrim = "  Hello    World   ";
        
//         System.out.println(spaceTrim.trim());
        
//         System.out.println(name.equalsIgnoreCase(name1));
        
        
//         System.out.println(name.contains("fi"));
        
//         // substring (begin, end) => 0, 4
        
//         System.out.println(spaceTrim.substring(0,4));
        
//         System.out.println(spaceTrim.replace(' ', '@'));
        
//         System.out.println(name.startsWith("fi"));
//         System.out.println(name.endsWith("it"));
        
//         System.out.println(name.concat(" Academy"));
        
        
//         // StringBuilder and StringBuffer => mutable we can modify the value 
        
        
//         // StringBuilder => mutable, non-synchronized , single-threaded it performs faster 
        
//         StringBuilder sb = new StringBuilder("Hello");
        
//         sb.append(" World");
//         sb.insert(4 ,"@");
    
//         sb.delete(4, 6); 
//         sb.replace(4,6, "Jav");
        
//         // System.out.println(sb.reverse());
        
//         System.out.println(sb);
        
        
        
//         // stringbuffer => mutable , synchronized (thread safety) , multithreaded environment
//         StringBuffer sbb = new StringBuffer("String");
           
//         sbb.append(" World");
//         sbb.insert(4 ,"@");

//         sbb.delete(4, 6); 
//         sbb.replace(4,6, "Jav");
        
    
//         System.out.println(sbb);

		
// 	}
// }


 class App{
    
    int data = 10 ; // field in class
    
    //method in class 
    public void display(String name){
        System.out.println(name);
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//oops => object oriented programming
		
// 		it's a programming paradigm organizes software around object 
        
        // class  => blueprint  => doesn't create memory
        // object => instance of class => create memory for that object 
        
        
        App obj = new App();
        
        System.out.println(obj.data);
        
        obj.display("FIIT");
        


	}
}