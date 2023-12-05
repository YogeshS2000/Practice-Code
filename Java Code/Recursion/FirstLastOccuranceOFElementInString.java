public class FirstLastOccuranceOFElementInString {
    public static void main(String args[]) {
        int first = -1;
        int last = -1;
        int idx = 0;
        char c = 'a';
        String s = "abaaccstaabsj";
        occurance(s, first, last, idx, c);
    }

    private static void occurance(String s, int first, int last, int idx, char ele) {

        if (idx == s.length() - 1) {
            if (first == -1 && last == -1) {
                System.out.println("ELement Not found");
                return;
            }

            if (last == -1) {
                System.out.println("only one element that is present at" + first);
                return;
            } else {
                System.out.println("first occ at " + first + " Last occ at " + last);
                return;
            }

        }
        if (s.charAt(idx) == ele) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        occurance(s, first, last, idx + 1, ele);
    }
}
