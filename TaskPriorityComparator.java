/*
 * this class implements our Comparator interface 
 * to compare tasks based on their priority
 */
import java.util.Comparator;
public class TaskPriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2){ //comapring task1 task2
        return Integer.compare(task1.getPriority(), task2.getPriority()); //getters
    }
}
