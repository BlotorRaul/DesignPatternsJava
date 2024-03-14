package task;

import java.util.ArrayList;
import java.util.List;

// Subiectul (Subject) care gestionează lista de sarcini
class TaskList {
    private List<String> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    // Metoda pentru adăugarea unui observator
    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    // Metoda pentru eliminarea unui observator
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    // Metoda pentru adăugarea unei noi sarcini
    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    // Metoda pentru eliminarea unei sarcini
    public void removeTask(String task) {
        tasks.remove(task);
        notifyObservers();
    }

    // Metoda care notifică toți observatorii despre modificări în lista de sarcini
    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(tasks);
        }
    }
}