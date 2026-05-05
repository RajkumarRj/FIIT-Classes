import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) throws IOException {

        File folder = new File("E:\\Fiiit\\fileDemo");

        folder.mkdir();

        File file = new File("E:\\Fiiit\\fileDemo\\Demo1\\Demo2\\Demo3");

        file.mkdirs();

        File files = new File("E:\\Fiiit\\fileDemo\\Demo1\\Demo2\\Demo3\\demo.txt");

        files.createNewFile();

        File files1 = new File("E:\\Fiiit\\fileDemo\\Demo1\\Demo2\\Demo3\\demo.pdf");

        files1.createNewFile();


        File files2 = new File("E:\\Fiiit\\fileDemo\\Demo1\\Demo2\\Demo3\\demo.doc");


        files2.createNewFile();

        File files3 = new File("E:\\Fiiit\\fileDemo\\Demo1\\Demo2\\Demo3\\demo.ppt");

        files3.createNewFile();

       

        System.out.println(files2.getName());

        System.out.println(files2.getAbsolutePath());

        System.out.println(files2.length());

        files2.delete();


         if(files2.exists()){
            System.out.println("demo.doc file is exist");
        }

        file.createNewFile();


        FileWriter writer = new FileWriter("E:\\Fiiit\\fileDemo\\Demo1\\Demo2\\Demo3\\demo.txt", true);

        // writer.write("Hello, This is sample file.. \n Hello, this is sample file ");

        writer.write("this is second line ");

        writer.close();


        Scanner sc = new Scanner(files);

        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);

        }

        sc.close();

    }
    
}
