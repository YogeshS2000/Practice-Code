import java.util.ArrayList;

public class Subset {
    public static void countSubset(int n, ArrayList<Integer> s) {
        if (n == 0) {
            for (int i = 0; i < s.size(); i++) {
                System.out.print(s.get(i));
            }
            System.out.println();
            return;
        }
        s.add(n);
        countSubset(n - 1, s);

        s.remove(s.size() - 1);
        countSubset(n - 1, s);

    }

    public static void main(String args[]) {
        ArrayList<Integer> s = new ArrayList<>();
        countSubset(3, s);
    }
}
