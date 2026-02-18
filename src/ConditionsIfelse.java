import java.util.*;
public class ConditionsIfelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks 0 to 100");
        int marks = sc.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println(marks +"%" + "A+ Grade");
        }else if(marks >= 70 && marks <= 89){
            System.out.println(marks +"% " + "B+ Garde");
        }
        else if(marks >= 60 && marks <= 69){
            System.out.println(marks +"% " + "First");
        }
        else if(marks >= 33 && marks <= 59){
            System.out.println(marks +"% " + "Just Pass");
        }
        else if(marks >= 0 && marks <= 32){
            System.out.println(marks +"% " + "Fail");
        }
        else{
            System.out.println("Invalid student marks");
        }
    }
}
