package Multithreading;

public class yield_function extends Thread{
    public void run(){
        for (int i = 0; i<3 ; i++){
            System.out.println(Thread.currentThread().getName() + "in control");
        }
    }
    public static void main(){
        yield_function obj1 = new yield_function();
        yield_function obj2 = new yield_function();
        obj1.start();
        obj2.start();
        for (int i =0; i<3; i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + "in control");

        }
    }
}
