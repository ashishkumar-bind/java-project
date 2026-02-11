import java.util.ArrayList;
import java.util.*;

class Task{
    String title;

    Task(String title){
        this.title = title;
    }
}

public class TodoApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasklist = new ArrayList<>();

        while(true){
            System.out.println("\n===== TO-DO LIST MENU ===== ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("5. Option");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter task title");
                    String title = sc.nextLine();
                    tasklist.add(new Task(title));
                    System.out.println("Task Added Successfully!");
                    break;

                case 2:
                    if(tasklist.isEmpty()){
                        System.out.println("No tasks Available.");
                }
                    else{
                        System.out.println("\nYour Task:");
                        for(int i = 0;i<tasklist.size(); i++){
                            System.out.println((i + 1) + ". " + tasklist.get(i).title);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter task number to delete");
                    int taskNumber = sc.nextInt();
                    sc.nextLine();

                    if(taskNumber > 0 && taskNumber <= tasklist.size()){
                        tasklist.remove(taskNumber - 1);
                        System.out.println("Task delete successfully");
                    }
                    else{
                        System.out.println("Invalid task number");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
