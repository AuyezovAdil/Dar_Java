package Collections;

import java.util.HashMap;

public class HashMapValue {
    // 14 task
    public static void main(String[] args) {

        HashMap<Integer, String> list = new HashMap <Integer, String> ();
        list.put(1, "Almaty");
        list.put(2, "Astana");
        list.put(3, "Aktau");
        list.put(4, "Semey");
        String value = "Semey";
        String answer = "";
        for (Integer key : list.keySet()) {
            if (list.get(key).equals(value)) {
                answer = "Yes";
            }
            else {
                answer = "No";
            }
        }
        System.out.println(answer);

    }
}
