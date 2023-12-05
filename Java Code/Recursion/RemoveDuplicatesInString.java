public class RemoveDuplicatesInString {

    public static void main(String args[]) {
        String s = "abbccccdef";
        String s1 = "";
        boolean arr[] = new boolean[26];
        // for (int i = 0; i < 26; i++) {
        // arr[i] = false;
        // }
        // int arr1[] = new int[26];
        remove(s, s1, arr, 0);
    }

    private static void remove(String s, String s1, boolean[] arr, int idx) {

        if (idx == s.length()) {
            System.out.println(s1);
            return;
        }

        char map = s.charAt(idx);

        int id = map - 'a';

        if (arr[id] == false) {
            s1 += map;
            arr[id] = true;
            remove(s, s1, arr, idx + 1);
        } else {
            remove(s, s1, arr, idx + 1);
        }
    }
}
