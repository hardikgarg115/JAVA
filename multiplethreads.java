package Multithreading;
public class multiplethreads{
    public static void main(){
    new A().start();
    new B().start();
    new C().start();
    }
}
class A extends Thread{
    public void run(){
        for (int i = 0; i<5; i++){
            // try{
            //     Thread.sleep(100);

            // }catch(Exception e){
            //     System.out.println(e);
            // }
            System.out.println("from thread a");
        }
        System.out.println("exit thread a");
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i<5; i++){
            //
            // try{
            //     Thread.sleep(120);

            // }catch(Exception e){
            //     System.out.println(e);
            //
        // }
            System.out.println("from thread b");
        }
        System.out.println("exit thread b");
    }
}
class C extends Thread{
    public void run(){
        for (int i = 0; i<5; i++){
            //
            // try{
            //     Thread.sleep(110);

            // }catch(Exception e){
            //     System.out.println(e);
            // }
            //
            System.out.println("from thread c");
        }
        System.out.println("exit thread c");
    }
}
// this will give different outputs