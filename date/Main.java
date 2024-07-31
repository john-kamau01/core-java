import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myObj);
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myFormatObj.format(myObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
