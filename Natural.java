import java.util.*;
public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
               even+=i;
            }
        else{
            odd+=i;
        }
        
        sc.close();
    }
    System.out.println("The sum of even numbers is: " + even + " and the sum of odd numbers is: " + odd);
           }
        }
