package Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetComparison {
    public static void main(String[] args) {
        // task 11
        HashSet<String> cars=new HashSet<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        HashSet<String> cars2 = new HashSet<>();
        cars2.add("Mercedes");
        cars2.add("Audi");
        cars2.add("BMW");
        Iterator<String> iterator = cars.iterator();
        Iterator<String> iterator2 = cars2.iterator();
        HashSet<String> sameCars = new HashSet<>();
        while(iterator.hasNext()){
            while(iterator2.hasNext()){
                if(iterator.next().equals(iterator2.next())){
                    sameCars.add(iterator.next());
                }
            }
        }
        System.out.println(sameCars);
    }
}
