class Counter{
    int count =0;

    synchronized void increment(){
        count++;
    }
}


public class Synchronized {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Multithreading synchronized");

        Counter obj = new Counter();

        // obj.increment();
        // obj.increment();

        
        // lambda expression 
        Thread t1 = new Thread( ()->{
            
            for(int i=1; i<=20000; i++){
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

        // let func = ()=>{
        //     console.log("hello there")
        // }

        // func();
    }
    
}
