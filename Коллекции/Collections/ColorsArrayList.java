package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorsArrayList {
    // 6 task


    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        while (true) {
            System.out.println("Press 1 to add color");
            System.out.println("Press 2 to see all colors");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter color: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String color1 = scanner1.nextLine();
                    colors.add(color1);
                    break;
                case 2:
                    for (String c : colors) {
                        System.out.println(c);
                    }
                    break;
            }

        }


    }

}
