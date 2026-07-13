public class ExceptionHandling {
    public static void main(){
    int a = 10, b= 5, c = 5;
    int x,y;
    try{
        x = a/(b-c);
        System.out.println(x);
    }
    catch(Exception e){
        System.out.println(e);
    }
    y = a/b+c;
    System.out.println(y);
    
}
}
