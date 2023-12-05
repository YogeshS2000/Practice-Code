import java.util.HashSet;

public class UniqueSubSequence {
    public static void main(String args[]) {
        String s = "abbc";

        SubSequence(s, 0, "");
    }

    public static HashSet<String> set = new HashSet<>();

    private static void SubSequence(String s, int i, String newstring) {
        if (i == s.length()) {
            if (set.contains(newstring))
                return;
            else {
                set.add(newstring);
                System.out.println(newstring);
                return;
            }
        }
        // to add
        SubSequence(s, i + 1, newstring + s.charAt(i));
        // or not to add
        SubSequence(s, i + 1, newstring);
    }
}
