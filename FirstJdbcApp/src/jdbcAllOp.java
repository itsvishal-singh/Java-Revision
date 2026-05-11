import java.sql.*;

public class jdbcAllOp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Established the Connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);

        // Creating Statement
        Statement statement = connection.createStatement();
        String read = "select * from studentinfo";
        String update = "update studentinfo set sage = 24 where id=1";


        // Execute Query

        boolean status = statement.execute(update);

        // Process the result
        if(status){
            System.out.println("If Block");
            // select
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " : " + resultSet.getString(2));

            }
        } else{
            System.out.println("Else Block");
            // insert, update, delete
            int rows = statement.getUpdateCount();
            if(rows==0)
                System.out.println("Operation failed");
            else System.out.println("Operation Successful");
        }


        // Close the resources
        statement.close();
        connection.close();
    }
}
