class Mythread extends  Thread{

    public void run(){
        System.out.println("MyThread is running"+ " "+Thread.currentThread().getName());
    }   
}


class MyRunnable implements  Runnable{
    
    public void run(){
        System.out.println("My runnable thread" + " "+Thread.currentThread().getName());
    }
}


public class Multithreading {

    public static void main(String[] args) throws  InterruptedException {


        

        Thread tobj = new Thread( new MyRunnable());
        tobj.setName("First thread");
        tobj.start();




        Mythread t1 = new  Mythread();
        t1.setName("Second thread");

        t1.start(); // create new thread

        // t1.join();

        System.out.println("Multithreading");





        // two ways 
        //     Thread 
        //     Runnable interface 
    }
    
}
