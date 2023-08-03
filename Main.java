/*
 * Welcome to the Main class!
 * Here, i will demonstrate the To-Do list app by using some examples
 */
import java.util.List;

public class Main {
    public static void main (String[] args){
        TaskManager taskManager = new ToDoListManager(); //creating a new instance

        //Adding some tasks
        taskManager.addTask("Clean the house", "Office,guest room,master", 3);
        taskManager.addTask("Study for Finals", "Data structures, comp arch,swe1,systems", 1);
        taskManager.addTask("take Arya to vet", "Pack her things, get there on time", 4);
        taskManager.addTask("Call mama", "Discuss weekend plans", 2);

        //Marking specific tasks as complete
        taskManager.markTaskAsCompleted("Clean the house");
        taskManager.markTaskAsCompleted("Study for finals");

        //priority sorting of tasks in view
        List<Task> allTasksSortedList = taskManager.getAllTasksSortedByPriority();
        System.out.println("All Tasks in order: ");
        for(Task task : allTasksSortedList){
            System.out.println(task);
        }

        //completed tasks in view
        List<Task> completedTasks = taskManager.getCompletedTasks();
        System.out.println("\nCompleted Tasks:");
        for (Task task : completedTasks) {
            System.out.println(task.getTitle());
        }

        // Removing task
        taskManager.removeTask("Clean the house");

        // Viewing all tasks after removal
        List<Task> allTasksSortedAfterRemoval = taskManager.getAllTasksSortedByPriority();
        System.out.println("\nAll Tasks Sorted by Priority after Removal:");
        for (Task task : allTasksSortedAfterRemoval) {
            System.out.println(task);
        }


    }
}