public class Task {
    String title;
    boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public void markCompleted() {
        completed = true;
    }

    public String toString() {
        return title + " - " + (completed ? "Completed" : "Pending");
    }
}
