package Multithreading.synchronization;

public class synchronization1 {
    public static void main(String[] args){
        
        // Shared resource
        Counter cnt = new Counter(); 

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        Thread t2 = new Thread(() -> {  //a way to write run function
            for (int i = 0; i < 100; i++)
                cnt.inc();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + cnt.get());
    }
}
class Counter{
    
    // Shared variable
    private int c = 0; 

    // Synchronized method to increment counter
    public synchronized void inc(){
        c++; 
        
    }

    // Synchronized method to get counter value
    public synchronized int get(){
        return c; 
        
    }
}
//this is code is equivalent to below 
// class Counter {

//     private int c = 0;

//     // Synchronized method
//     public synchronized void inc() {
//         c++;
//     }

//     // Synchronized method
//     public synchronized int get() {
//         return c;
//     }
// }


// class MyThread1 extends Thread {

//     Counter cnt;

//     MyThread1(Counter cnt) {
//         this.cnt = cnt;
//     }

//     public void run() {
//         for (int i = 0; i < 1000; i++) {
//             cnt.inc();
//         }
//     }
// }


// class MyThread2 extends Thread {

//     Counter cnt;

//     MyThread2(Counter cnt) {
//         this.cnt = cnt;
//     }

//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             cnt.inc();
//         }
//     }
// }

// public class Geeks {

//     public static void main(String[] args) {

//         Counter cnt = new Counter();

//         MyThread1 t1 = new MyThread1(cnt);
//         MyThread2 t2 = new MyThread2(cnt);

//         t1.start();
//         t2.start();

//         try {
//             t1.join();
//             t2.join();
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }

//         System.out.println("Counter = " + cnt.get());
//     }
// }


    
    
