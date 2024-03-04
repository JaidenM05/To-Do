public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description)
    {

        this.description = description;
        isDone=false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setIsDone(Boolean value)
    {
        isDone = value;
    }

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field


}
