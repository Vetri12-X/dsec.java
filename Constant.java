
import java.util.Scanner;
public class Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine().toLowerCase();
        int vowels = 0;
        int Constant = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch>='a'&& ch<='z'){
                if(ch =='a'|| ch =='e'|| ch == 'i'|| ch =='o'||ch =='u'){
                    vowels++;
                }else{
                    Constant++;
                }
            }
        }
System.out.println("Vowels: "+vowels);
System.out.println("Constant: "+Constant);
sc.close();
    }
}
