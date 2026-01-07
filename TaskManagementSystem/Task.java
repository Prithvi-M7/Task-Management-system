public class Task {
    int id;
    String title;
    String description;
    int priority;
    String status;

    public Task(int id, String title, String description, int priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = "PENDING";
    }
}
