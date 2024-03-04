public class isSorted {

    public static boolean Sorted(int arr[], int i){
        int n = arr.length;
        if(i == n - 1 ){
            return true;
        }
        if( arr[i] > arr[i+1]){
            return false;
        }

        return Sorted(arr, i+1);
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int i = 0;
        System.out.println(Sorted(arr,i)); // Time and space complextiy is O(n)
    }
}
