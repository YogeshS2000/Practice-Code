class printnumber4 {
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        int m = factorial(n - 1);
        int sum = n * m;
        return sum;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(factorial(n));
    }
}