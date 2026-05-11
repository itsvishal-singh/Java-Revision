import java.sql.*;
import java.util.Scanner;

public class J_DB_C {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = jdbcUtil.getConnection();
            // Creating Statement

            String insert = "insert into studentinfo(id, sname, sage, scity) values (?,?,?,?)";
            preparedStatement = connection.prepareStatement(insert);
            System.out.println("Please enter the following details to be stored in DB");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Id : ");
            int id = scanner.nextInt();
            System.out.println("Enter your Name : ");
            String name = scanner.next();
            System.out.println("Enter your Age : ");
            Integer age = scanner.nextInt();
            System.out.println("Enter your City : ");
            String city = scanner.next();

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,age);
            preparedStatement.setString(4,city);

            int rowAffected = preparedStatement.executeUpdate();
            // process the result
            if(rowAffected==0){
                System.out.println("Unable to insert data");
            } else {
                System.out.println("Data Inserted Successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            jdbcUtil.closeConnection(connection, statement);
        }
    }
}
