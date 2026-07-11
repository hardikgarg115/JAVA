public class bubblesort {
    public static void main(String args[]){
        int arr[]= {1,4,2,5,3};
        int n = 5;
        for( int i = 0; i< arr.length; i++){
            for (int j = 0; j<arr.length-1; j++){
                if (arr[j]> arr[j+1]){
                    swap(arr[j], arr[j+1]);
                }
            }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public  static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
