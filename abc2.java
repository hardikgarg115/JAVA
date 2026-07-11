class abc2{   
    public static void main2(String ags[]){
        int a = 10, b = 20;
        System.out.print(a);
        System.out.println();
        System.out.print(b);
        System.out.println();
        System.out.print(ags[0]);
    }
    public static void main(String ags[]){
        hello obj = new hello();
        obj.func();
        int a = 30, b = 40;
        System.out.print(a);
        System.out.println();;
        System.out.print(b);
        String c[] = {"hello", "hi"} ;
        main2(c);
    }
    static {
        System.out.print("hello there");
        System.out.println();
    }
} 
class hello{
    public  void func(){
        System.out.print("hello");
    }
}
    

