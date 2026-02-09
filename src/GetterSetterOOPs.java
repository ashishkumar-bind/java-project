
class Student{
    private String name;
    private int age;

    // Getter for name

    public String getName(){
        return name;
    }

    // setter for name
    public void setName(String name){
        this.name = name;
    }

    // getter for age

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

    // Display method

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class GetterSetterOOPs {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ashish");
        s1.setAge(23);
        s1.display();
    }
}
