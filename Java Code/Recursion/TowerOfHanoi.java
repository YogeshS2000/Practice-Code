public class TowerOfHanoi {
    static int c = 0;

    public static void TOH(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            c++;
            return;
        }
        TOH(n - 1, src, dest, helper);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        c++;
        TOH(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 2;
        TOH(n, "S", "H", "D");
        System.out.println(c);
        // TC = o(2^n)
    }
}
