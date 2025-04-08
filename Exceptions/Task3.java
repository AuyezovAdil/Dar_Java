package Exceptions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] numbers = str.split("\\s+");
        int sum = 0;
        for (String number : numbers) {
            try {
                sum += Integer.parseInt(number);
            }
            catch (Exception e) {
                System.out.println("В строке есть буквы");
            }

        }
        System.out.println("Сумма чисел в строке="+sum);

    }
}
