class MyRunnable implements Runnable{

     public void run(){
        System.out.println("Runnable  is running");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }

}

class example{
   static  int priority =10;

   int data = 30;
}

class MyThead extends Thread{
    public void run(){
        System.out.println("Thread is running");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {

        // example prior = new example();

        // System.out.println(example.priority);
        


        MyRunnable obj1 = new MyRunnable();

        Thread obj2 = new Thread(obj1);
        obj2.setName("Runnable thread");
        System.out.println(obj2.getName());
        obj2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread priority for runnable " +obj2.getPriority());


        obj2.start();
        System.out.println(obj2.isAlive());
        obj2.join();



        MyThead obj = new MyThead();
        obj.setName("Thread class");
        obj.setPriority(9); // ranges 1- 10

        System.out.println("Thread priority for classs " +obj.getPriority());

        System.out.println(obj.getName());


        obj.start(); //main thread ignore

        obj.join(); // main thread waits for this thread to complete 


        System.out.println("Multithreading");


        // process vs thread 

        // process -> separate execution (separate memory)

        // thread ->unit of execution (shared memory)

        // thread lifecycle 
        // new
        // runnable
        // running
        // non-runnable
        // terminated 

        // how to create thread  

        // thread class, runnable interface 










    }
    
}
