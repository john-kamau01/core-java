import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Subaru");
        cars.add("Ford");

        System.out.println(cars.contains("Mazda"));
    }
}
