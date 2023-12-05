import java.util.*;

class Hashing {

    public static void main(String args[]) {
        // HashSet set = new HashSet<>();
        LinkedHashSet set = new LinkedHashSet<>();
        // TreeSet set = new TreeSet<>();
        set.add(100);
        set.add(6);
        set.add(10);
        set.add(4);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.size());
        // set.remove(1);
        // System.out.println(set);

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //
        // set.removeAll(set);

        System.out.println(set);
    }
}