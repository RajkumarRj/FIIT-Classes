class MyThread extends Thread{

     public void run(){
        System.out.println("Run method from MyThread class");
    
    }
}

class MyRunnable implements Runnable{

    public void run(){
        System.out.println("Run method from MyRunnable class");
    }

}

public class Multithreading {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Multithreading");


        MyThread obj = new MyThread();
        obj.setPriority(7);
        System.out.println("MyThread class priority :" + obj.getPriority());
        obj.setName("Mythread");
        System.out.println("Mythread class thread name :"+obj.getName());

        Thread.sleep(2000);

        Thread runnable = new Thread(new MyRunnable());
        System.out.println("Current thread:"+Thread.currentThread());

        runnable.start();
        System.out.println(runnable.isAlive());

        runnable.setPriority(Thread.MAX_PRIORITY);
        System.out.println("MyRunnable  class priority :" + runnable.getPriority());
        runnable.setName("MyRunnable");
        System.out.println("MyRunnable class thread name :"+runnable.getName());

        
        obj.start();

        System.out.println(obj.isAlive());

        
        
        // main thread waits until this thread executes
        obj.join();
        runnable.join();

        

        System.out.println("End of the program ");

        // thread vs process 
    }
}
