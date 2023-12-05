public class InsertionSoting {

    public static void sortASC(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void sortDSC(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            int j = i - 1;
            while (j >= 0 && curr > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        sortASC(arr);
        System.out.println();
        sortDSC(arr);
    }
}
