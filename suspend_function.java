package Multithreading;
//suspend function no more exists in the newer version of jdk compiler
public class suspend_function extends Thread{
    public void run(){
       for(int i = 0; i<5; i++){
         try{
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName());
        }catch(Exception e){};
        System.out.println(i);
       }
    }
    public void main(String args[]){
        suspend_function obj1 = new suspend_function();
        suspend_function obj2 = new suspend_function();
        suspend_function obj3 = new suspend_function();
        obj1.start();
        obj2.start();
        // obj2.suspend();
        obj3.start();
    }
}
