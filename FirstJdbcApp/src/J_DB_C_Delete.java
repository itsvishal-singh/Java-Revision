
import java.sql.*;
import java.util.Scanner;

public class J_DB_C_Delete{
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = jdbcUtil.getConnection();
            // Creating Statement
            String delete= "delete from studentinfo where id=?";
            preparedStatement = connection.prepareStatement(delete);

            System.out.println("Please enter the Info that needs to be deleted");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Id : ");
            int id = scanner.nextInt();
            preparedStatement.setInt(1, id);
            int rowAffected = preparedStatement.executeUpdate();
            // process the result
            if(rowAffected==0){
                System.out.println("Unable to delete data");
            } else {
                System.out.println("Data Deleted Successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            jdbcUtil.closeConnection(connection, statement);
        }
    }
}
