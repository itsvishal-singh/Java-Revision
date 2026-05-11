
import java.sql.*;
import java.util.Scanner;

public class J_DB_C_Update {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = jdbcUtil.getConnection();
            // Creating Statement
            String update = "update studentinfo set sage = ? where id=?";
            preparedStatement = connection.prepareStatement(update);

            System.out.println("Please enter the Info that needs to be updated");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Id : ");
            int id = scanner.nextInt();
            System.out.println("Enter your Age to be updated : ");
            int age = scanner.nextInt();
            preparedStatement.setInt(1, age);
            preparedStatement.setInt(2, id);




            int rowAffected = preparedStatement.executeUpdate();
            // process the result
            if(rowAffected==0){
                System.out.println("Unable to update data");
            } else {
                System.out.println("Data updated Successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            jdbcUtil.closeConnection(connection, statement);
        }
    }
}
