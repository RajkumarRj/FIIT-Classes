class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable is running");
    }

}

class MyThread extends Thread{

    public void run(){
        System.out.println("Thread is running");
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {


        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        MyRunnable obj1 = new MyRunnable();

        Thread t2 = new Thread(obj1);

        MyThread t1 = new MyThread();

        t2.start();
        t1.start();

        // Thread.sleep(10000);

        System.out.println(t2.isAlive());

        t1.join();
        t2.join();

        t1.setName("MyThread");
        t2.setName("MyRunnable");

       System.out.println(t2.getName());
       System.out.println(t1.getName());

       t2.setPriority(7);
       System.out.println(t2.getPriority());

        System.out.println("Hello there");

        System.out.println("End of the program");


        // it is one of the ways to achieve multi-tasking 

        // Thread => it is the light weight sub process

        // threads shares the common memory area 


        // thread lifecycle 

        // new,
        // runnable 
        // running,
        // non-runnable,
        // terminated

        // createing thread => Extending Thread class 





    }
    
}
