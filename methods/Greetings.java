public class Greetings{
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age + " years old!");
    }

    public static void main(String[] args){
        myMethod("John", 31);
    }
}