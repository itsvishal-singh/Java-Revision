import java.sql.*;

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
    public static void closeConnection(Connection connection, Statement statement){
            // Close the resources
        try{
//            if(resultSet!= null)
//                resultSet.close();
            if(statement!= null)
                statement.close();
            if(connection!= null)
                connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }
}
