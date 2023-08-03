/*
 * This class is an interface that will serve to define methods
 * implemented by our task manager
 * it is very simple and straight forward so no additional comments necessary
 */
import java.util.List;
public interface TaskManager {
    void markTaskAsCompleted(String title);
    void addTask(String title, String description, int priority);

    List<Task> getAllTasksSortedByPriority();
    List<Task> getCompletedTasks();

    void removeTask(String title);
    
}
