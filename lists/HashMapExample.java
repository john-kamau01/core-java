import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (country, city)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
