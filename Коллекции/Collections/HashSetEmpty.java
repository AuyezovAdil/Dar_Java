package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEmpty {
    // 12 task
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("A");
        Iterator<String> iterator = list.iterator();
        if (iterator.hasNext()) {
            System.out.println("This list is not empty");
        }
        else {
            System.out.println("This list is empty");
        }

    }
}
