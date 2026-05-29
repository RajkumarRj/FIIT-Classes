import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {

    public static void main(String[] args) throws IOException {
        
        File file = new File("demo/src/example.txt");

        file.createNewFile();


        File folder = new File("demo/security/authorization");

        // folder.mkdir();
        folder.mkdirs();

        File pdf = new File("demo/lib/example.pdf");

        pdf.createNewFile();

        File word = new File("demo/lib/example.docx");

        word.createNewFile();

        File ppt = new File("demo/lib/example.ppt");

        ppt.createNewFile();

        File excel = new File("demo/lib/example.xlsx");

        excel.createNewFile();


        if(file.exists()){

            System.out.println(file.getName());
            System.out.println(file.length());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getAbsolutePath());
        }

        FileWriter fileWrite = new FileWriter("demo/src/example.txt");

        fileWrite.write("Hello Java");

        fileWrite.close();

        FileWriter appendWrite = new FileWriter("demo/src/example.txt",true);

        appendWrite.write("\nHello fiit");
        appendWrite.close();


        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }

        sc.close();


        // file.delete();

        








    }
    
}
