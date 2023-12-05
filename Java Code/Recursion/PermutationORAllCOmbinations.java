public class PermutationORAllCOmbinations {

    public static void AllCombinations(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char currelement = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);

            AllCombinations(newString, permutation + currelement);
        }
    }

    public static void main(String args[]) {
        AllCombinations("abc", "");
    }
}
