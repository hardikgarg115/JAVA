package Multithreading;

public class join_function extends Thread{
    public void run(){
       for(int i = 0; i<5; i++){
         try{
            Thread.sleep(100);

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(i);
       }
    }
    public static void main(){
        join_function t1 = new join_function();
        join_function t2 = new join_function();
        join_function t3 = new join_function();

        t1.start();
        try{
            t1.join(300);//here it does waits to die it just waits at most 100ms
        }catch(Exception e){System.out.println(e);};
            
        t2.start();
        t3.start();
        
    }
}
