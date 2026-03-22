

/*

LOOPS:

for-loop
while-loop
do-while loop



*/

import java.util.*;
    public class MenuWhileloops {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            char choice = ' ';
            int unit = 0, bill = 0;

            do {

                System.out.println("=========Grocery Item=========");
                System.out.println("ENTER 1: SALT");
                System.out.println("ENTER 2: HALDI POWDER");
                System.out.println("ENTER 3: WHEAT AATA");
                System.out.println("ENTER 4: SUGAR");
                System.out.println("ENTER 5: MAGGI");
                System.out.println("ENTER 6: PANEER");
                System.out.println("ENTER 7: TOOR DAL");
                int n = sc.nextInt();


                switch (n) {
                    case 1:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 50;
                        break;
                    case 2:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 250;
                        break;
                    case 3:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 30;
                        break;
                    case 4:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 48;
                        break;
                    case 5:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 14;
                        break;
                    case 6:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 350;
                        break;
                    case 7:
                        System.out.println("PLEASE ENTER THE UNITS YOU WANT : ");
                        unit = sc.nextInt();
                        bill = bill + unit * 160;
                        break;

                    default:
                        System.out.println("SORRY INVALID INPUT!!!!!");
                }

                System.out.println("Do you want to continue if Yes the press Y/N : ");
                choice = sc.next().charAt(0);


            } while (choice == 'Y'|| choice == 'y');


            System.out.println("Your total bill is: "+bill+"rs");
            System.out.println("======Thankyou: Visit Again======");

        }

    }

