public class search {
    public static void main(String[] args) {
        int arr[] = {10,20,10,40,20,20,10};
        int target = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
    
    System.out.println("The number " + target + " occurs " + count + " times in the array.");
    }
    }