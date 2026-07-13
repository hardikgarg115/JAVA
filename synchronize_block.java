package Multithreading.synchronization;

public class synchronize_block {
    public void main(){
        A a = new A();
        Thread t1 = new Thread(()-> {
            for(int i = 0; i<100; i++){
                a.inc();
            }
        });
         Thread t2 = new Thread(()-> {
            for(int i = 0; i<200; i++){
                a.inc();
            }
        });
        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();
        }catch(Exception e){};
        System.out.println(a.c);
    }
}
class A{
    int c = 0;
    public void inc(){
    synchronized(this){c++;}}

}