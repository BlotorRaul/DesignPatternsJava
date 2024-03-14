package bazaDeDate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionThread {
    //o variabilă este marcată ca volatile, înseamnă că orice modificare făcută de un
    //fir de execuție la acea variabilă este imediat vizibilă și pentru celelalte fire de execuție.
    private static volatile DatabaseConnectionThread instance;
    private static final String URL = "jdbc:mysql://localhost:3306/baza_de_date";
    private static final String USERNAME = "utilizator";
    private static final String PASSWORD = "parola";

    private Connection connection;

    private DatabaseConnectionThread() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnectionThread getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionThread.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionThread();
                }
            }
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
