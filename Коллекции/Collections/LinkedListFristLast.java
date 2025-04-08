package Collections;

import java.util.LinkedList;

public class LinkedListFristLast {
    // 9 task
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Car");
        list.add("Bag");
        list.add("Sun");
        System.out.println(list.getFirst()+" "+list.getLast());
    }
}
