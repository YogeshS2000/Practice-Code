import java.util.*;

class Hashing {

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("china", 120);
        map.put("india", 100);
        map.put("usa", 80);

        System.out.println(map);

        if (map.containsKey("china")) {
            System.out.println("yes it contains chaina key");
        }

        System.out.println(map.get("china"));

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("china");
        System.out.println(map);
    }
}