import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();

        taskList.add(new Task("Study Java"));
        taskList.add(new Task("Build To-Do List project"));

        taskList.get(0).complete();

        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}