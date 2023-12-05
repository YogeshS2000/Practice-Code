public class PrintSumOfNumbers {
    public static void print(int sum, int n, int i) {
        if (i == n + 1) {
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        print(sum, n, i + 1);
        // System.out.println(i + " " + sum);
        // return sum;
    }

    public static void main(String args[]) {
        int i = 1;
        int n = 5;
        int sum = 0;
        print(sum, n, i);
    }
}
