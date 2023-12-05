public class SubSequence {
    public static void main(String args[]) {
        String s = "abc";
        SubSequence(s, 0, "");
    }

    private static void SubSequence(String s, int i, String newstring) {
        if (i == s.length()) {
            System.out.println(newstring);
            return;
        }
        // to add
        SubSequence(s, i + 1, newstring + s.charAt(i));
        // or not to add
        SubSequence(s, i + 1, newstring);
    }
}
