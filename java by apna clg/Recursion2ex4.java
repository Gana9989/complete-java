// This code is useful to calculate isShorted
public class Recursion2ex4 {

    public static boolean isSorted(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            // array is shorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        System.out.println(isSorted(arr, 0));
    }

}
