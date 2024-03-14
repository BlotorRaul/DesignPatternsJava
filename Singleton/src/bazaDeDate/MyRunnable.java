package bazaDeDate;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // Obținem instanța Singleton a conexiunii la baza de date
        DatabaseConnectionThread databaseConnection = DatabaseConnectionThread.getInstance();

        // Obținem conexiunea la baza de date
        Connection connection = databaseConnection.getConnection();

        // Aici putem efectua operații cu conexiunea, de exemplu, să afișăm informații despre conexiune
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println("Versiunea bazei de date: " + metaData.getDatabaseProductVersion());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // După ce am terminat de utilizat conexiunea, este recomandat să o închidem
        databaseConnection.closeConnection();
    }
}
