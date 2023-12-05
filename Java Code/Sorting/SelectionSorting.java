public class SelectionSorting {

    public static void sortASC(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void sortDSC(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int large = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[large]) {
                    large = j;
                }
            }
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;
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
