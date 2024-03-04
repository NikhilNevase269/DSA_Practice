public class checkOccurence {

    public static int checkFirstOccurence(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        if ( arr[i] == key){
            return i;
        }
        return checkFirstOccurence(arr, key, i+1);
    }

    public static int checkLastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = checkLastOccurence(arr, key, i+1);
        if(isFound == -1 && key == arr[i]){
            return i;
        }
        return isFound;
    }
    public static void main(String []args){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int i = 0;
        System.out.println(checkFirstOccurence(arr, key, i));  // Time and Space complexity O(n)
        System.out.println(checkLastOccurence(arr, key, i)); 
    }
}
