import java.util.*;
import java.io.*;

class A extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Thread A");
            try {
                Thread.sleep(500); // pause for 500 ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Thread B");
            try {
                Thread.sleep(500); // pause for 500 ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Sleep {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}