class loop implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class App extends Thread{

    public void run(){
        for(int i=0; i<10; i ++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws Exception {
        Thread.sleep(10000);
        
        App obj = new App();

        obj.start();
        
        
        loop obj2 = new loop();
        
        Thread runnableThread = new Thread(obj2);

        
        
        runnableThread.start();

        obj.join();

        runnableThread.join();

        
        System.out.println("After thread ");

    }
}
