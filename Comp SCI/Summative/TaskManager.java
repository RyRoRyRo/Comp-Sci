//January 17, 2023
//Summative 3: Task Manager
//Ryan KS
//Console program where you can create and manage tasks for you to do. Additional features included.

import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class Task { //task variables
    private String taskName;
    public boolean isCompleted;
    private Date date;

    public Task(String taskName, boolean isCompleted, Date date) { //task object
        this.taskName = taskName;
        this.isCompleted = isCompleted;
        this.date = date;
    }
    public boolean isCompleted() { //task completion check
        return isCompleted;
    }

    public void markAsComplete() { //mark task as completed
        this.isCompleted = true;
    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if (isCompleted){
            return "[Completed] " + taskName + ", Due Date: " + dateFormat.format(date); //proper formating for printing tasks
        }
        else {
            return "[Incomplete] " + taskName + ", Due Date: " + dateFormat.format(date);
        }
    }
}

public class Main {
    // Creating a map to store tasks
    private static HashMap<String, Task> taskMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //main menu
        System.out.println("Welcome to the Task Manager!\n");
        System.out.println("Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Mark Task as Completed");
        System.out.println("3. View Completed Tasks");
        System.out.println("4. View Pending Tasks");
        System.out.println("5. View All Tasks");
        System.out.println("6. Remove Task");
        System.out.println("7. Quit");

        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) { //switch case for difficulty/instructions
            case 1: //ADD TASKS
                System.out.println("Enter task name: ");
                String taskName = scanner.nextLine(); //get task name
                System.out.println("Enter task due date (dd-MM-yyyy): ");
                String dateString = scanner.nextLine(); //get task date
                Date taskDate = parseDate(dateString); //parse date into date format

                Task newTask = new Task(taskName, false, taskDate);//create hasmap for task
                taskMap.put(taskName, newTask);

                System.out.println("Task added: " + taskName);
                enterToContinue();
                main(args);
                break;
            case 2: //MARK TASKS AS COMPLETED
                System.out.println("Select a Task to Complete:");
                for (Task task : taskMap.values()) {
                    if (!task.isCompleted()) { //prints incomplete tasks
                        System.out.println(task);
                    }
                }
                String complete = selectTask();
                while (complete == null && taskMap.size() > 0) { //only take valid inputs
                    System.out.println("Select a Task to Complete:");
                    complete = selectTask();
                }
                Task selectedTask = taskMap.get(complete); //get selected task
                selectedTask.markAsComplete(); //set to complete
                System.out.println("Marked " + complete + " as completed.");
                enterToContinue();
                main(args);
                break;
            case 3: //SHOW COMPLETED TASKS
                System.out.println("Showing Completed Tasks:");
                for (Task task : taskMap.values()) {
                    if (task.isCompleted()) { //print completed tasks
                        System.out.println(task);
                    }
                }
                enterToContinue();
                main(args);
                break;
            case 4: //SHOW INCOMPLETE TASKS
                System.out.println("Showing Pending Tasks:");
                for (Task task : taskMap.values()) {
                    if (!task.isCompleted()) { //print incomplete tasks
                        System.out.println(task);
                    }
                }
                enterToContinue();
                main(args);
                break;
            case 5: //SHOW ALL TASKS
                System.out.println("Showing All Tasks:");
                for (Task task : taskMap.values()) {//print all tasks
                        System.out.println(task);
                }
                enterToContinue();
                main(args);
                break;
            case 6:
                System.out.println("Select a Task to Remove:");
                for (Task task : taskMap.values()) { //print all tasks
                    System.out.println(task);
                }
                String removed = selectTask();
                while (removed == null && taskMap.size() > 0) { //only take valid inputs
                    System.out.println("Select a Task to Remove:");
                    removed = selectTask();
                }
                taskMap.remove(removed); //remove the selected task
                System.out.println("Removed " + removed);
                enterToContinue();
                main(args);
                break;
            case 7:
                System.out.println("Quitting..."); //quit
                break;
            default:
                System.out.println("Invalid Input."); //error check
                enterToContinue();
                main(args);
                break;

        }

        // Accessing and printing task details from the map
    }
    public static void enterToContinue(){
        System.out.println("Press \"ENTER\" to continue..."); //wait for user to want to continue
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static String selectTask(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
            if (!taskMap.containsKey(input)) { //only gets valid tasks
                System.out.println("Task not found: " + input);
            }
            else {
                return input; //return the selected task if valid
            }
            return null; //returns null if invalid
    }
    private static Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); //convert string into simple date format
            return dateFormat.parse(dateString); //return
        } catch (Exception e) { //error exception
            System.out.println("Error parsing date. Using current date instead.");
            return new Date(); //return current date
        }
    }

}
