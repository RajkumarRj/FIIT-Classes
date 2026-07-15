class Mythread extends Thread {
    public void run(){ // constant
        System.out.println("Run method " + Thread.currentThread().getName());
    }
   
}

// runnable interface 

class RunnableThread implements Runnable{

    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println( "Current thread " + 
            Thread.currentThread().getName() + " "+ i);
        }
    }
}

// Thread class
public class Multithreading {
    public static void main(String[] args) throws InterruptedException {

        Thread t2 = new Thread( ()->{


            for(int i=1; i<=100; i++){
                System.out.println(i);
            }

            
        }  );

        t2.start();

        



        // RunnableThread runnable = new RunnableThread();

        Thread t1 = new Thread(new RunnableThread());

        t1.setName("Malathi");
        t1.start(); // thread-0

        Mythread obj = new Mythread();
        obj.setName("Vinitha");
        obj.start(); // thread -1
        obj.join();
        System.out.println("Multithreading");
    }
}
