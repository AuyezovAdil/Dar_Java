package Exceptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        try {
            System.out.println(x / y);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }
}
