import java.util.Arrays;
public class tamil3 {
    public static void main(String[] args) {
        String s="silentt";
        String t="listens";
        
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
           arr[c-'a']++;
        }
        for(char c:t.toCharArray()){
            arr[c-'a']--;
        }
        System.out.println(Arrays.toString(arr));
    }
}