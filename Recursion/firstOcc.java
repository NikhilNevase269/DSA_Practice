class firstOcc {
    public static int firstOcc(int arr[], int i, int k) {
        if (arr[i] == k) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }
        return firstOcc(arr, i + 1, k);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 6, 7 };
        int i = 0;
        int k = 4;
        System.out.println(firstOcc(arr, i, k));
    }
}