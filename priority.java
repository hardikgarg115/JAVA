package Multithreading;

public class priority extends Thread {
    public void run(){
        System.out.println("Thread Name : " + Thread.currentThread().getName() + " priority " + Thread.currentThread().getPriority());
    }
    public static void main(){
        priority obj1 = new priority();
        priority obj2 = new priority();
        priority obj3 = new priority();
        obj1.start();
        obj2.start();
        obj3.start();
        obj1.setPriority(MIN_PRIORITY);
        obj2.setPriority(3);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        System.out.println(obj3.getPriority());
    }
}

