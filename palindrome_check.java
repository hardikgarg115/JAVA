public class palindrome_check {
    public static void main(String args[]){
        String str = "racecar";
        int n = str.length();
        
        for (int i = 0; i< n/2; i++){
            if (str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("not a pallindrome");
                break;
            }
            System.out.println("it is a pallindrome");
        }
        
    }
}
