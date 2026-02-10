
class Employee{
    String name;
    double salary;

    void displayInfo(){
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}
class Manager extends Employee{
    String department;

    void showDepartment(){
        System.out.println("Department: " + department);
    }
}

public class OopInheritance {
    public static void main(String[] args){
        Manager m = new Manager();
        m.name = "Ashish";
        m.salary = 5000;
        m.department = "IT";

        m.displayInfo();
        m.showDepartment();
    }
}
