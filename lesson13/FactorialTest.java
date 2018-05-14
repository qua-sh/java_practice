public class FactorialTest {
    public static void main(String[] args){
        System.out.println(factorial(10));
    }
    public static int factorial(int n){
        for(int i = n - 1; i > 0; i--){
            n = n * i;
        }
        return n;
    }
}