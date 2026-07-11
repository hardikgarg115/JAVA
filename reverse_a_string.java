public class reverse_a_string {
    public static void main(String args[]){
        String str = "Hello world";
        int n = str.length();
        String rev = "";
        for (int i = n-1; i>=0; i-- ){
            rev = rev + str.charAt(i);// this does modify the existing string it rather creates a 
            // new string object in every iteration and makes rev to point to that object
        }
        System.out.println("original String :" + str);
        System.out.println("reversed string :" + rev);
    }
}
