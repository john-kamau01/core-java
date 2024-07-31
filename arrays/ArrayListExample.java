import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Subaru");
        cars.add("Volkswagen");

        Collections.sort(cars);
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
