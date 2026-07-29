import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lambda {

    public static void main(String[] args) throws IOException {

        File file1 = new File("component/file1/file2/file3");
        // file1.mkdir();
        file1.mkdirs();



        File file = new File("example.txt");

        file.createNewFile();


        FileWriter writer = new FileWriter("example.txt");


        writer.write("Subhiksha \n");
        writer.write("Harini \n");

        writer.close();

        Scanner sc = new Scanner(file);


        while (sc.hasNextLine()  ) {
            
            String content = sc.nextLine();
            System.out.println(content);
        }


        // fiit academy => fiit (next())
        // nextLine()



        

    //     Thread obj = new Thread(  ()-> {

    //         for(int i=0; i<=1000; i++){
    //             System.out.println(i);
    //         }
    //     }   );
    

    // obj.start();

    System.out.println("Program end");



    }

    
}


