public class lastOcc {
    public static int lastOcc(int arr[], int i, int k) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == k) {
            return i;
        }
        return lastOcc(arr, i - 1, k);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 4, 4, 5, 6, 7 };
        int i = arr.length;
        int k = 4;
        System.out.println(lastOcc(arr, i, k));
    }
}
