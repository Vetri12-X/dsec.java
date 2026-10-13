public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 4567;
        int sum=1;
        sum=sum+a%10;
        a=a/10;
        sum=sum+a;
        System.out.println("Sum of last digit: " + sum);
    }
}
