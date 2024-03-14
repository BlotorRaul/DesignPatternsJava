package task;

import java.util.List;

// Observatorul care afișează lista de sarcini
public class TaskListDisplay implements  TaskObserver{
    @Override
    public void update(List<String> tasks) {
        System.out.println("Lista de sarcini actualizată:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
        System.out.println();
    }
}
