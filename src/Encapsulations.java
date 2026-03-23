import java.util.*;
class Employe {
    private String name;
    private double salary;

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        if(salary<0){
            System.out.println("Salary cannot be negative");
        }
        else{
            this.salary = salary;
        }
    }
    public double getSalary(){
        return salary;
    }
}
public class Encapsulations {
    public static void main(String[] args) {
        Employe emp = new Employe();
        emp.setName("Ashish");
        emp.setSalary(25000);
        System.out.println("Name: "+emp.getName());
        System.out.println("Salary: "+emp.getSalary());
    }
}
