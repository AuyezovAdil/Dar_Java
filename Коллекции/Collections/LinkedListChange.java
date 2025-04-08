package Collections;

import java.util.LinkedList;

public class LinkedListChange {
    // 10 task
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        numbers.remove(2);
        numbers.add(2, 10);
        numbers.remove(3);
        numbers.add(3, 20);


        System.out.println(numbers);
    }
}
