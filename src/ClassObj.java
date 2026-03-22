

// We are using in this code class and object at here

public class ClassObj {
    int id;
    String name;
    String address;
    public void Read(){
        System.out.println("Student is reading");
        System.out.println("--------------------------");
    }
    public void Walk(){
        System.out.println("Student is walking");
        System.out.println("--------------------------");
    }
    public void Playing(){
        System.out.println("Student is playing in the ground");
        System.out.println("--------------------------");
    }

    // Using short method for print------
    public void print(){
        System.out.println("Student Id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Student address: "+address);
    }

    public static void main(String[] args) {
        // 1- new object as a memory allocation...
        ClassObj ashish = new ClassObj();

        // 2 - initialization, put the value.......
        ashish.id = 13940;
        ashish.name = "Ashish";
        ashish.address = "Noida";

        // 3 - call method.............
        ashish.Read();
        ashish.Walk();
        ashish.Playing();
        ashish.print();
        System.out.println("==============================");

        // multiple memory allocation
        ClassObj rohan = new ClassObj();
        rohan.id = 45366;
        rohan.name = "Rohan";
        rohan.address = "Noida";

        rohan.Read();
        rohan.Walk();
        rohan.Playing();
        rohan.print();

        // print all initial value.........

//        System.out.println("Student Id is: "+ashish.id);
//        System.out.println("Student name is: "+ashish.name);
//        System.out.println("Student address is: "+ashish.address);
   }
}

