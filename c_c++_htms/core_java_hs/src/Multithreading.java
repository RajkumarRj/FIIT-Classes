class Mythread extends Thread{
    public void run(){
            System.out.println("Run method");
    }


    public void display(){
        System.out.println("Display method");
    }
}

// class FIIT extends Thread{

//     public void run(){
//         System.out.println("run method inside FIIT");
//     }
// }

class MyRunnable implements Runnable{


    public void run(){
        System.out.println("Run method inside Interface");
    }

}

public class Multithreading {

    public static void main(String[] args)  throws InterruptedException {
        
        Thread obj1 = new Thread(new MyRunnable());

        obj1.start();
        obj1.join();
        // FIIT obj1 = new FIIT();

        // obj1.start();

        System.out.println("Start");
        Mythread obj = new Mythread();
        obj.display();
        obj.start(); // it createe thread 
        obj.join();
              // two way => Thread class, Runnable Interface 
        System.out.println("End");
    }
    
}
