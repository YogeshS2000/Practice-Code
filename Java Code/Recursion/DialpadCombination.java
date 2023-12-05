public class DialpadCombination {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printcomb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printcomb(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String args[]) {
        String s = "234";
        printcomb(s, 0, "");
        // time complexity = o(4^n) n is length of s;
        // ex: s="6666" 6="pqrs" longest string
    }
}
