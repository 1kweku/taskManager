import java.util.*;

import javax.sql.rowset.CachedRowSet;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> tasks = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        boolean addMoreTasks = true;

        while (addMoreTasks) {
            System.out.println("Task Manager here! What would you like to do?");
            System.out.println("1. View tasks");
            System.out.println("2. Add a task");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit Task Manager");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (tasks.size() > 0) {
                        System.out.println(tasks);
                    } else {
                        System.out.println("No tasks added");
                    }
                    ;

                    break;
                case 2:
                    System.out.println("What task would you like to add?");
                    String taskOne = scanner.next();
                    tasks.add(taskOne);

                    break;
                case 3:
                    System.out.println(tasks);
                    System.out.println("What is the index of the task you want to remove?");
                    int removeTask = scanner.nextInt();

                    tasks.remove(removeTask);

                    break;
                case 4:
                    System.out.println("Bye!");
                    addMoreTasks = false;
                    break;

                default:
                    break;
            }
        }

    }
}
