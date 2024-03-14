package bazaDeDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Informații pentru conexiune la baza de date
    private static final String URL = "jdbc:mysql://localhost:3306/baza_de_date";
    private static final String USERNAME = "utilizator";
    private static final String PASSWORD = "parola";

    // Instanța Singleton pentru conexiunea la baza de date
    private static DatabaseConnection instance;

    // Conexiunea la baza de date
    private Connection connection;

    // Constructor privat pentru a preveni instanțierea directă
    private DatabaseConnection() {
        try {
            // Crearea conexiunii la baza de date
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodă statică pentru a obține instanța Singleton a conexiunii la baza de date
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            // Dacă instanța nu a fost încă creată, o creăm acum
            instance = new DatabaseConnection();
        }
        // Returnăm instanța Singleton a conexiunii la baza de date
        return instance;
    }

    // Metodă pentru a obține conexiunea la baza de date
    public Connection getConnection() {
        return connection;
    }
}
