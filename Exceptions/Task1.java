package Exceptions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            double result = Math.sqrt(a);
            if (Double.isNaN(result)) {
                throw new ArithmeticException("");
            }
            System.out.println(result);

        }
        catch (Exception e) {
            System.out.println("Нельзя извлечь корень");
        }
    }
}
