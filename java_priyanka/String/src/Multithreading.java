//thread class
class myThread extends Thread{
    public void run(){ //override
        System.out.println("Thread running");
        // System.out.println(Thread.currentThread().getName());
    }
}

// 2. runnable interafce 

class myTask implements Runnable{
    public void run(){
        System.out.println("Runnable running");
        // System.out.println(Thread.currentThread().getName());
        
    }
}


public class Multithreading {
    public static void main(String[] args) throws InterruptedException {

        myThread t1 = new myThread();
        t1.setName("First thread");
        t1.start(); // thread running 

        System.out.println(t1.isAlive());


        myTask interThread = new myTask();
        Thread t2 = new Thread(interThread);
        t2.setName("Second thread");
        t2.start();

        t2.setPriority(Thread.MAX_PRIORITY);

        // Thread.sleep(10000);

        t1.join();
        t2.join();

        System.out.println("Multithreading");

        System.out.println(t2.isAlive()); //return false 

        // multitasking -> chrome, whatsapp , microsoft word 

        // chrome -> single process has multiple threads 

        // smallest unit inside process 

        // how to create threads -> two ways -> thread class, runnable interface 


    }
    
}
