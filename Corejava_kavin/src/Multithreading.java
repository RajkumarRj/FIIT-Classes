class Mythread extends Thread{

    public void run(){
        try {
            
            // Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Run method using Thread class");
        System.out.println(Thread.currentThread().getName());
    }

    public void nonRUn(){
        System.out.println("non RUN method ");
    }
}

// interface Demo{

//     public void run();
//     public void inter();
// }

class MyRunnable implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Run method inside Runnable interface");
    }

}



public class Multithreading {
    public static void main(String[] args) throws InterruptedException{


        MyRunnable obj1 = new MyRunnable();

        Thread obj2 = new Thread(obj1);

        obj2.start();
        obj2.setName("Runnable class");

        
        Mythread obj = new Mythread();
        
        obj.start();
        obj.setName("Thread class");

        // obj.join();
        obj.nonRUn();

        Thread.sleep(20000);
 
        // two ways => thread class , runnable interface 
        System.out.println("Multithreading");
    }
    
}
