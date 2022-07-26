import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Todo_Manager
{
    public static void main(String[] args)
    {
        System.out.println("Welcome");
        System.out.println("Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello " + name);

        int choice;

        TreeMap<Integer, String> taskmap = new TreeMap<Integer, String>();

        do {
            //Display the menu
            System.out.println("Please select an option");
            System.out.println("1. Enter a task: ");
            System.out.println("2. Remove a task");
            System.out.println("3. Update a task");
            System.out.println("4. List all tasks");
            System.out.println("5. Exit");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number of the task ");
                    Integer taskNumber = Integer.valueOf(in.nextInt());
                    in.nextLine();
                    System.out.println("Enter the task");
                    String task = in.nextLine();
                    taskmap.put(taskNumber, task);
                    break;

                case 2:
                    System.out.println("Remove a task ");
                    System.out.println("Enter number of the task");
                    Integer taskNumberToRemove = Integer.valueOf(in.nextInt());
                    taskNumberToRemove = taskNumber;
                    // if tasknumber is in taskmap, remove it
                    // if not then say there's no task corresponding to that number
                    // or the other way round which seems to be how it's done in java
                    break;
                case 3:
                    System.out.println("Update a task");
                    // TODO implement it
                    break;
                case 4:
                    System.out.println("List all tasks: ");
                    list_all(taskmap);
                    break;
                default:
                    // do nothing
            }
        } while (choice != 5);

    }
    public static void list_all(TreeMap<Integer, String> tm)
    {
        for (Map.Entry<Integer, String> item : tm.entrySet())
        {
            System.out.println(item.getKey()); System.out.println(" "); System.out.println(item.getValue());
        }
    }

}

