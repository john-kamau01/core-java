public class RecursionMethod {
    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int i){
        if(i > 0){
            int sum = i + sum(i - 1);
            return sum;
        } else {
            return 0;
        }
    }
}
