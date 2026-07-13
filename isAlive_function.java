package Multithreading;

public class isAlive_function extends Thread {
    public void run(){
        
        System.out.println("while running is alive ? :" + Thread.currentThread().isAlive());
        
    }
    public void main(){
        isAlive_function obj1 = new isAlive_function();
        System.out.println("before starting thread :" + obj1.isAlive());
        obj1.start();
        System.out.println("after starting thread :" + obj1.isAlive());
        
    }
    
}
