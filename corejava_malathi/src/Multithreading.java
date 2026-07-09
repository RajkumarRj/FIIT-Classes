class Mythread extends Thread {
    public void run(){ // constant
        System.out.println("Run method");
    }
}
// Thread class
public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Mythread obj = new Mythread();
        obj.start();
        obj.join();
        System.out.println("Multithreading");
    }
    
}
