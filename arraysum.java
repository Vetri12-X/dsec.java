public class arraysum {
    public static void main(String[] args) {
        int arr[] = {15, 20, 25, 30, 45, 90};
        int small = arr[0];
        int secondsmall = Integer.MAX_VALUE;
        for (int i =1; i <arr.length; i++) {
            if (arr[i] < small) {
                secondsmall = small;
                small = arr[i];
            } else if (arr[i] > secondsmall && arr[i] < small) {
                secondsmall = arr[i];
            }
        }
        System.out.println("Smallest number is: " + small);
        System.out.println("Second smallest number is: " + secondsmall);
    }
}