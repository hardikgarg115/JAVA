
public class throw_exeption {
    public static void main(String args[]){
        int amount = -100;
        try{
            if (amount < 0){
                throw new NegativeException();// in brackets write "invalid amount"
            }
            System.out.println(amount);
        }
        catch(NegativeException e ){
            System.out.println("invalid amount");//method two - write e instead of invalid amount
        }
    }
}
class NegativeException extends Exception{
    String str;
    // public NegativeException (){
        
    // }
    // public String toString(){
    //     return str;
    // }

}