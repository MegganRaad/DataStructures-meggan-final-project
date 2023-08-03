
import java.util.*; //easier than importing individually
public class ToDoListManager implements TaskManager {
    private Set<String> taskTitles; // to keep track of task titles
    private List<Task> tasks; //to store all tasks
    private Map<String, Task> completedTasks; //to store completed tasks for quicker access

    //Constructor that will intitialize the data structures implemented here
    public ToDoListManager() {
        tasks = new ArrayList<>(); //our arraylist
        taskTitles = new HashSet<>(); //our hashset
        completedTasks = new HashMap<>(); //our hashmap
    }

    //we can now implement taskManager interface and methods
    @Override
    public void markTaskAsCompleted(String title) {
        Task task = findTaskByTitle(title);
        if (task != null && !task.isComplete()) {
            task.setComplete(true);
            completedTasks.put(title, task);
        }
    }

    @Override
    public void addTask(String title, String description, int priority) {
        // Check if the task title is not already in use before adding
        if (!taskTitles.contains(title)) {
            Task task = new Task(title, description, priority);
            tasks.add(task);
            taskTitles.add(title);
        }
    }

    @Override
    public List<Task> getAllTasksSortedByPriority() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(new TaskPriorityComparator());
        return sortedTasks;
    }

    @Override
    public List<Task> getCompletedTasks() {
        return new ArrayList<>(completedTasks.values());
    }

    @Override
    public void removeTask(String title) {
        Task task = findTaskByTitle(title);
        if (task != null) {
            tasks.remove(task);
            taskTitles.remove(title);
            completedTasks.remove(title);
        }
    }

    // Helper method to find a task by its title
    private Task findTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }
}

 

