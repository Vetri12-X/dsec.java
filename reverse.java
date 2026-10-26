public class reverse {
    public static void main(String[] args) {
        int n = 12345;
        int reversed = 0;

       for (int i = 0; n != 0; i++) {   
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
