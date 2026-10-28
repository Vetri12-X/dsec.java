public class search3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,20};
        int target = 20;
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }   
        System.out.println("The first occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("The last occurrence of " + target + " is at index: " + lastOccurrence);
    }
}
