package Collections;

import java.util.ArrayList;

public class ArrayListSecondObject {
    // task 8
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.set(1, 5);
        System.out.println(numbers);
    }
}
