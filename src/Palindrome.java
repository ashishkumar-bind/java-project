import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int orig = n;
         int rev = 0;
         for(; n>0; n = n/10) {
             int rem = n % 10;
             rev = rev * 10 + rem;
         }
        if(orig == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Sorry Friend: This is not Palindrome");
        }
    }
}
