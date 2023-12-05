public class ReverseString {
    public static void reverse(String s, int idx) {
        if (idx == 0) {
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        reverse(s, idx - 1);
    }

    public static void main(String args[]) {
        String s = "abcd";
        reverse(s, s.length() - 1);
        // TC = o(n)
    }
}
