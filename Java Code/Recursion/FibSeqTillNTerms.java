class printnumber5 {
    public static void fib(int a, int b, int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);

    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int n = 8;
        System.out.println(a);
        System.out.println(b);
        fib(a, b, n - 2);

    }
}