
public class RelationalExample {
    public static void main(String[] args) {

        int a = 25;
        int b = 15;
        int c = 20;

        boolean result1 = a > b;
        boolean result2 = b < c;

        System.out.println("A is greater than B: " + result1);
        System.out.println("B is less than C: " + result2);
        System.out.println("Both conditions: " + (result1 && result2));
    }
}
