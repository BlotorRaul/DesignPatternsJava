package task;

public class Main {
    public static void main(String[] args) {
        // Creăm un subiect (lista de sarcini)
        TaskList taskList = new TaskList();

        // Creăm un observator (afișajul listei de sarcini)
        TaskListDisplay taskListDisplay = new TaskListDisplay();

        // Adăugăm observatorul la lista de observatori ai listei de sarcini
        taskList.addObserver(taskListDisplay);

        // Adăugăm și eliminăm sarcini pentru a vedea notificările
        taskList.addTask("Curățenie în casă");
        taskList.addTask("Cumpărături la supermarket");
        taskList.removeTask("Cumpărături la supermarket");
    }
}
