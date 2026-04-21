class Counter {
    int count = 0;

   
    synchronized  void increment() {
        count++;
    }
}

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {

        Counter c1 = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    c1.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    c1.increment();
                }
            }
        });

       
        t1.start();
        t2.start();

       
        t1.join();
        t2.join();

        
        System.out.println("Final Count: " + c1.count);
    }
}