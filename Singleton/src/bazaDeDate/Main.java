package bazaDeDate;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Obținem instanța Singleton a conexiunii la baza de date
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();

        // Obținem conexiunea la baza de date
        Connection connection = databaseConnection.getConnection();

        // Acum putem folosi conexiunea pentru a executa interogări SQL sau alte operațiuni cu baza de date


        //-----------------cu threads

        // Creăm și pornim două fire de execuție care vor utiliza conexiunea la baza de date
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}
