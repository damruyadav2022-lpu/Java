import java.io.*;


class A extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Thread A");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Thread B");
        }
    }
}

public class priority {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();

        // Set priority BEFORE starting
        a.setPriority(Thread.MIN_PRIORITY);   // 1
        b.setPriority(Thread.MAX_PRIORITY);   // 10

        a.start();
        b.start();
    }
} 
