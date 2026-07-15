class Counter{
    int count = 0;

     synchronized void increment(){
        count++;
    }
}

public class Syncrhonized {
    public static void main(String[] args) throws InterruptedException {


        Counter obj = new Counter();
        Thread t1 = new Thread( ()->{
            for(int i=1; i<=30000; i++){
                obj.increment();

            }
        } );
        Thread t2 = new Thread( ()->{
            for(int i=1; i<=30000; i++){
                obj.increment();
            }
        } );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.count);

        
    }
    
}
