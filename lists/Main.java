import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Subaru");
        Collections.sort(cars, Collections.reverseOrder());
        
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
