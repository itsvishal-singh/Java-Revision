
import java.sql.*;
import java.util.Scanner;

public class J_DB_C_Retrieve {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            connection = jdbcUtil.getConnection();
            // Creating Statement
            String select = "select id, sname, sage, scity from studentinfo where id = ?";
            preparedStatement = connection.prepareStatement(select);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Id for which data to be retrieve : ");
            int id = scanner.nextInt();
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();
            // process the result
            if (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getString(4));
            } else System.out.println("There is no record with id " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            jdbcUtil.closeConnection(connection, statement);
        }
    }
}

