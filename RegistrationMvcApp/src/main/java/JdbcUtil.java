import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Driver is Registered");
    }
    public static Connection getDBConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String userName="root";
        String password ="";
        return DriverManager.getConnection(url, userName, password);
    }
    public static void closeResource(Connection connection, Statement statement) throws SQLException{
        if(connection!=null)
            connection.close();
        if(statement!=null)
            statement.close();
    }
}
