public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("10th fibonacci number is "+fibonacciNumber(10));
    }
    public static int fibonacciNumber(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
}
