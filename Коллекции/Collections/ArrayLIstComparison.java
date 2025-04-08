package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstComparison {
    // 7 task
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        ArrayList<String> cars1=new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars1.add("BMW");
        cars1.add("Audi");
        cars1.add("Mercedes");
        StringBuilder carsList= new StringBuilder();
        StringBuilder carsList1= new StringBuilder();
        Iterator<String> iterator = cars.iterator();
        Iterator<String> iterator1 = cars1.iterator();
        while(iterator.hasNext()){
            String car = iterator.next();
            carsList.append(car);
        }
        while(iterator1.hasNext()){
            String car = iterator1.next();
            carsList1.append(car);
        }
        if (carsList.toString().equals(carsList1.toString())){
            System.out.println("Cars lists are equal");
        } else System.out.println("Cars lists are not equal");

    }
}
