public class MoveAllXToEndOfString {

    public static void main(String args[]) {
        String s = "axbxcxdx";
        int c = 0;
        move(s, c, 0, 'x');
    }

    public static String s1 = "";

    private static void move(String s, int c, int i, char ele) {

        if (i == s.length()) {
            for (int j = 0; j < c; j++)
                s1 = s1 + ele;
            System.out.println(s1);
            return;
        }

        if (s.charAt(i) == ele) {
            c++;
            move(s, c, i + 1, ele);
        } else {
            s1 = s1 + s.charAt(i);
            move(s, c, i + 1, ele);
        }

    }
}
