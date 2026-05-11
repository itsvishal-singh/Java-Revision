import java.sql.*;
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Established the Connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);

        // Creating Statement
        Statement statement = connection.createStatement();

        // Execute Query
        String sql = "insert into studentinfo(id, sname, sage, scity) values(2, 'Rohit', 30, 'Patna')";
        int rowAffected = statement.executeUpdate(sql);

        // Process the result
        if(rowAffected==0)
            System.out.println("Unable to insert data");
        else System.out.println("Data inserted successfully");


        // Close the resources
        statement.close();
        connection.close();
    }
}
