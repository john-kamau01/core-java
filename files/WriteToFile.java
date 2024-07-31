import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Hello World!");
            myWriter.close();
            System.out.println("Success!");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ann error occured!");
            e.printStackTrace();
        }
    }
}
