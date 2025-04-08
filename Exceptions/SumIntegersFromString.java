package Exceptions;

import java.util.Scanner;

public class SumIntegersFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] tokens = input.split("\\s+"); // Разделяем строку на лексемы по пробелам
        int sum = 0;

        for (String token : tokens) {
            try {
                // Преобразуем лексему в целое число
                int number = Integer.parseInt(token);
                sum += number;
            } catch (NumberFormatException e) {
                // Если лексема не является целым числом, игнорируем ее
                // и продолжаем анализировать следующие лексемы
            }
        }

        // Выводим результат
        System.out.println("Сумма целых чисел в строке равна " + sum);

        scanner.close();
    }
}
