public class string_functions {
    public static void main(String args[]){
        
        // String str = "Hello World";
        // System.out.println("Length of string: " + str.length());//length of string
        // System.out.println(str.indexOf('o'));
        String str1 = "Apple";
        // String str2 = "Apple";
        String str2= new String("Apple");
        char ch[] = {'A', 'p', 'p', 'l', 'e'};
        // String str3 = new String(ch);
        String str3 = new String(ch).intern();
        System.out.println("Compare function:" + str1.compareTo(str2));
        System.out.println("Equals function:" + str1.equals(str2));
        System.out.println("== function:" + (str1 == str2));
        System.out.println("concatinate : " + str1.concat(str2));
        System.out.println("Uppercase : " + str1.toUpperCase());
        System.out.println("Equal_special :" + str1.equals(str3));
        System.out.println("== special :" + (str1 == str3));
        //note string is immutable in java so anywhere we can obtain the original string


    }
}
