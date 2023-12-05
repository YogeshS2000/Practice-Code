public class PowerOfX {
    public static int powerx(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;

        int powernm1 = powerx(x, n - 1);
        c1++;
        int power = x * powernm1;
        return power;
    }

    public static int c = 0;
    public static int c1 = 0;

    public static int powerx1(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;

        if (n % 2 == 0) {
            c++;
            return powerx1(x, n / 2) * powerx1(x, n / 2);
        } else {
            c++;
            return powerx1(x, n / 2) * powerx1(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 4;
        System.out.println(powerx(x, n));
        System.out.println(powerx1(x, n));
        System.out.println(c1);
        System.out.println(c);
    }
}
