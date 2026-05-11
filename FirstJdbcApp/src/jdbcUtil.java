import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {
    static {
        try{
            // Load and Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        // Established the Connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);

    }
    public static void closeConnection(Connection connection, Statement statement) throws SQLException{
            // Close the resources
            statement.close();
            connection.close();

    }
}
