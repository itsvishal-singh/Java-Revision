import java.sql.*;
public class JdbcCrud{
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
//        String insert = "insert into studentinfo(id, sname, sage, scity) values(2, 'Rohit', 30, 'Patna')";
//        int rowInserted = statement.executeUpdate(insert);

//        String read = "select * from studentinfo";
//        ResultSet resultSet = statement.executeQuery(read);

//        String update = "update studentinfo set sage = 24 where id=1";
//        int rowUpdated = statement.executeUpdate(update);

        String delete = "delete from studentinfo where id = 2";
        int rowsDeleted = statement.executeUpdate(delete);

        // Process the result
//        if(rowInserted==0)
//            System.out.println("Unable to insert data");
//        else System.out.println("Data inserted successfully");

//        while(resultSet.next()){
//            System.out.println(resultSet.getInt(1) + " : " + resultSet.getString(2));
//            System.out.println(resultSet.getInt("id") + " : " + resultSet.getString("sname"));
//        }

//        if(rowUpdated==0)
//            System.out.println("Unable to Update data");
//        else System.out.println("Data Updated successfully");

        if(rowsDeleted==0)
            System.out.println("Unable to Delete data");
        else System.out.println("Data Deleted successfully");

        // Close the resources
//        resultSet.close();
        statement.close();
        connection.close();
    }
}
