public class Calculator {
    static int myCalc(int x, int y){
        return x * y;
    }

    public static void main(String[] args){
        int result = myCalc(100, 23);
        System.out.println("The product is, " + result);
    }
}
