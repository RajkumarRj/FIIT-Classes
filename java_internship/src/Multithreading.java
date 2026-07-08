//Thread -> predefined class

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class MyThread extends Thread{

    public void  run(){
            System.out.println("Mythread");
    }
}

public class Multithreading {

    public static void main(String[] args) throws IOException{

        File file = new File("sample.txt");

        file.createNewFile();


        FileWriter writer = new FileWriter("sample.txt");

        writer.write("Hello there");

        writer.close();

        Scanner reader = new Scanner(file);


        while(reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
        }

        

        
        // MyThread obj = new MyThread();
        
        // obj.start(); // Mythread
        
        // obj.join(); // main thread waits until obj thread is complete
        // System.out.println("Multithreading");

    }
    
}
