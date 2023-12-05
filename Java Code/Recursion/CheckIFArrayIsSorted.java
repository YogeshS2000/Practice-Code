public class CheckIFArrayIsSorted {

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 5 };
        System.out.println(check(arr, 0));
    }

    private static boolean check(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return check(arr, i + 1);
    }
}
