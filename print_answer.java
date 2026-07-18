// package input-output streans;
import java.io.FileInputStream;
public class print_answer {
    public static void main(String args[]) throws Exception{
        FileInputStream fin = new FileInputStream("answer.txt");
        int i ;
        while ((i = fin.read()) != -1){
            System.out.print((char)i);
        }
        fin.close();
    }
}
