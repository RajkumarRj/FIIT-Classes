import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        

        File fs = new File("src/example.txt");
        File fs2= new File("src/files/files1/files2/files3/pdfFile.pdf");
        fs2.createNewFile();

        File fs3= new File("src/files/files1/files2/docFile.docx");
        fs3.createNewFile();

         File fs4= new File("src/files/files1/pptFile.pptx");
        fs4.createNewFile();


        fs.createNewFile();

        if(fs.exists()){
            System.out.println("File is created successfully");

            System.out.println(fs.getName());

            System.out.println(fs.canWrite());

            System.out.println(fs.canRead());

            System.out.println(fs.getAbsolutePath());
            System.out.println(fs.length());
            // fs.delete();
        }else{
            System.out.println("file is not found");
        }

        File fs1 = new File("src/files/files1/files2/files3");

        // fs1.mkdir();

        fs1.mkdirs();


        try {
            FileWriter write = new FileWriter("src/example.txt");

            write.write("THis is demo file ");

            write.close();


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }


        // read a file 

        try {
            Scanner sc = new Scanner(fs);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }


        // append 
        try {

            FileWriter fileAppend = new FileWriter("src/example.txt", true);

            fileAppend.write("\n Appended file");

            fileAppend.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }






    }
    
}
