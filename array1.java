import java.util.Scanner;
public class array1 {
    public static void main(String args[]){
        int arr[] = {1, 2, 5, 6, 7};
        // arr = new int[5];
        System.out.println("Enter the key");
        Scanner obj = new Scanner(System.in);
        int key = obj.nextInt();
        for( int i = 0; i< 5; i++){
            if (arr[i]== key){
                System.out.println("Key found!!");
                System.out.println("index is " + i);
                break;
            }
            // else{
            //     System.out.println("Key not found!");
            // }
        }
    }
}
