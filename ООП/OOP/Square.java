package OOP;

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Area=" + a*a);
        System.out.println("Perimeter=" + a*4);
    }
}
