/*
 * This class will represent single tasks
 * properties: title, description, priority, completion status
 */

 //set our properties
public class Task {
    private String description;
    private int priority;
    private String title;
    private boolean isComplete;

    //our constructors
    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isComplete = false;
    }

    //our getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // our twoString
    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description + ", Priority: " + priority;
    }
    
}