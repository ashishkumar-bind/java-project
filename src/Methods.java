
import java.util.*;
class Methods {
    public static void findMax(int a, int b, int c){
        if(a>=b && a>=c){
            System.out.println("Max is: " +a);
        }
        else if(b >= a && b>=c){
            System.out.println("Max is: " +b);
        }
        else{
            System.out.println("Max is: " +c);
        }
    }
    public static void main(String[] args) {
        //int a = 20, b = 10, c = 25;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        findMax(a, b, c);
    }
}
