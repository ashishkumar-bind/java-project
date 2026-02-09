import java.util.*;

public class Calculators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("choose operator: +, -, *, /, %  ");
        char operator = sc.next().charAt(0);
        /**
         *1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */

        switch (operator) {
            case '+':
                System.out.println("= " +(a + b));
                break;
            case '-':
                System.out.println( "= " +(a - b));
                break;
            case '*':
                System.out.println("= " +(a * b));
                break;
            case '/':
                System.out.println("= " +(a / b));
                break;
            case '%':
                System.out.println("= " +(a % b));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}


