// package input-output streans;
import java.io.FileOutputStream;
public class write_answer {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("answer.txt");
        String content = "Hello World";
        fout.write(content.getBytes());
        System.out.println(fout.getChannel());
        System.out.println(fout.getFD());
        fout.close();
        //append
        ;
        System.out.println("Data written Successfully");
    }
}
