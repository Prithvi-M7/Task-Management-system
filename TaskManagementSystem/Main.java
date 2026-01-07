import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        manager.addTask(1, "Learn DSA", "Practice arrays", 1);
        manager.addTask(2, "Resume", "Prepare resume", 2);
        manager.listTasksByPriority();
    }
}
