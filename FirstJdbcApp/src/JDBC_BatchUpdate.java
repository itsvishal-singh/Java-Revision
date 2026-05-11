import java.sql.*;
import java.util.Scanner;

public class JDBC_BatchUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            connection = jdbcUtil.getConnection();
            // Creating Statement
            String update = "update studentinfo set sage = ? where id=?";
            preparedStatement = connection.prepareStatement(update);

            preparedStatement.setInt(1, 44);
            preparedStatement.setInt(2, 1);
            preparedStatement.addBatch();
            preparedStatement.setInt(1, 55);
            preparedStatement.setInt(2, 2);
            preparedStatement.addBatch();

            preparedStatement.executeBatch();
            System.out.println("Check the DB to see the changes");
        } catch (SQLException e) {
            e.printStackTrace(); 
        } finally {
            // Close the resources
            jdbcUtil.closeConnection(connection, statement);
        }
    }
}

