package Collections;

import java.util.ArrayList;
import java.util.Iterator;
// 4 task
public class Student {

    private int grade;


    public static void main(String[] args) {
        ArrayList<Integer> students= new ArrayList<Integer>();
        students.add(2);
        students.add(3);
        students.add(7);

        for (int s: students) {
            System.out.print(s + " " );
        }
        System.out.println();

        Iterator<Integer> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }
    }
}

