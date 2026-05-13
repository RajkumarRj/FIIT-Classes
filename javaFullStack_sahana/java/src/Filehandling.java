import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {

    public static void main(String[] args) throws IOException {
        
        System.out.println("File handling");

        // volatile vs non-volatile memory 
        // Ram vs hard drive

        // File file = new File("E:\\Fiiit\\javaFullStack_sahana\\java\\src\\demo");

        // file.mkdir(); // folder 


        File file1 = new File("E:\\Fiiit\\javaFullStack_sahana\\java\\src\\demo\\file1\\file2");

        file1.mkdirs();


        File file2 = new File("E:\\Fiiit\\javaFullStack_sahana\\java\\src\\demo\\demo.txt");

        file2.createNewFile();

        File file3 = new File("example.txt");

        file3.createNewFile();



        if(file3.exists()){
            System.out.println(file3.getName());
            System.out.println(file3.getAbsolutePath());
            System.out.println(file3.canWrite());
            System.out.println(file3.canRead());
            System.out.println(file3.length());
        }else{
            System.out.println("File does not exist");
        }


        try {
            FileWriter writer = new FileWriter("example.txt", true );

            writer.write("\n Hello, this is sample file ");
            writer.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        try {
            Scanner sc = new Scanner(file3);

            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("End");





    }
    
}
