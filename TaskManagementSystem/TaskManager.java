import java.util.*;

public class TaskManager {

    Map<Integer, Task> taskMap = new HashMap<>();
    public void addTask(int id, String title, String desc, int priority) {
        if (taskMap.containsKey(id)) {
            System.out.println("Task ID already exists");
            return;
        }
        taskMap.put(id, new Task(id, title, desc, priority));
        System.out.println("Task added");
    }
    public void markTaskDone(int id) {
        Task task = taskMap.get(id);
        if (task == null) {
            System.out.println("Task not found");
            return;
        }
        task.status = "DONE";
    }
    public void deleteTask(int id) {
        taskMap.remove(id);
        System.out.println("Task deleted");
    }
    public void searchTask(int id) {
        Task task = taskMap.get(id);
        if (task != null) {
            System.out.println(task.title + " | " + task.status);
        } else {
            System.out.println("Task not found");
        }
    }
    public void listTasksByPriority() {
        List<Task> list = new ArrayList<>(taskMap.values());
        list.sort(Comparator.comparingInt(t -> t.priority));

        for (Task t : list) {
            System.out.println(t.id + " " + t.title + " " + t.priority);
        }
    }
}