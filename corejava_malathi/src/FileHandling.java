import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException{
        
        File file = new File("template");
        file.mkdir();
        // file.createNewFile();
        File file1 = new File("template/malathi.txt");
        file1.createNewFile();

        // FileWriter wfile = new FileWriter("template/malathi.txt");

        // wfile.write("Hello malathi, how are you");

        // wfile.close();
        Scanner fsc  = new Scanner(file1);
        while(fsc.hasNextLine()){
            String data = fsc.nextLine();
            System.out.println(data);
            
        }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your int : ");
        // int a = sc.nextInt();
        // System.out.println(a);
        // System.out.print("Enter float: ");
        // float b= sc.nextFloat();
        // System.out.println(b);
        // System.out.print("enter string: ");
        // // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println(name);
        // System.out.print("Enter your grade:");
        // char grade = sc.next().charAt(0);
        // System.out.println(grade);


        // file.delete();
    

        
        ArrayList<Food> food = new ArrayList<>();

        food.add(new Food("malathi", 20));

        
        
        ArrayList<Integer> student = new ArrayList<>();

        student.add(10);
        student.add(20);

        student.add(30);
        student.add(40);  
        student.add(50);
        student.add(60);

        student.set(3, 80);

        System.out.println(student);
        System.out.println(student.get(1));
        student.remove(0);

        for(int d : student){
            System.out.println(d);
        }

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Malathi");
        ls.add("Vinitha");
        ls.addFirst("FIIT");
        ls.removeFirst();
        ls.removeLast();
        ls.remove(0);
        System.out.println(ls);

        // int -> Integer 


        System.out.println("File hanlding");
    }
}
