package Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Phonebook {
    // 5 task


    public static void main(String[] args) {
        HashMap<String, Integer> list = new HashMap<>();
        while (true) {
            System.out.println("Press 1 to add new contact");
            System.out.println("Press 2 to see all contacts");
            System.out.println("Press 3 to change contact");
            System.out.println("Press 4 to search for contact");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter the name");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    System.out.println("Enter the number");
                    Scanner numberScanner = new Scanner(System.in);
                    int number = numberScanner.nextInt();
                    list.put(name, number);
                    break;

                case 2:
                    for (String p : list.keySet()) {
                        System.out.println("Name: " + p + " Number: " + list.get(p));
                    }
                    break;
                case 3:
                    System.out.println("Enter contact name");
                    Scanner scanner1= new Scanner(System.in);
                    String name1 = scanner1.nextLine();
                    for (String p : list.keySet()) {
                        if (p.equals(name1)) {
                            System.out.println("Enter new number");
                            Scanner scanner2 = new Scanner(System.in);
                            int number1 = scanner2.nextInt();
                            list.put(name1, number1);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter name to see the number");
                    Scanner scanner3 = new Scanner(System.in);
                    String name2 = scanner3.nextLine();
                    for (String p : list.keySet()) {
                        if (p.equals(name2)) {
                            System.out.println(list.get(name2));
                        }
                    }
                    break;
            }
        }


    }
}
