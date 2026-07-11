import java.util.Scanner;
public class vowel_countproblem {
    public static void main(String args[]){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter a String :");
        String str = obj.nextLine();
        int count = 0;
        for (int  i = 0; i<str.length() ; i++){
            if (str.charAt(i)== 'a'|| str.charAt(i)== 'e'|| str.charAt(i)== 'i'|| str.charAt(i)== 'o'|| str.charAt(i)== 'u'){
                count++;
            }
        }
        System.out.println("number of vowels is : " + count);
        obj.close();
    }
}
