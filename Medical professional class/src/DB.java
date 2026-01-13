import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/healthcare_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "isla2013";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
