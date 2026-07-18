// package input-output streans;
import java.io.FileOutputStream;
public class append_answer {
    public static void main(String args[]){
        try{
            int a = 72;
        FileOutputStream fout2 = new FileOutputStream("answer.txt", true);
        // String append = " append this content ";
        fout2.write(a);//ascii value for a 

        fout2.close();}
        catch(Exception e){};
    }
}
