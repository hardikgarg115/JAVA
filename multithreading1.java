package Multithreading; //if i uncomment this then i have to run this in terminal with java Multithreading.multithreading
public class multithreading1 extends Thread{
    public void run(){
        for (int i =0; i<5 ; i++){
            try{
                Thread.sleep(1500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        multithreading1 obj1 = new multithreading1();
        multithreading1 obj2 = new multithreading1();
        multithreading1 obj3 = new multithreading1();
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
