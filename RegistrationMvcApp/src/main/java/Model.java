import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String uname;
    private String upassword;
    private String email;
    private String ucity;
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    int rows;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUcity() {
        return ucity;
    }

    public void setUcity(String ucity) {
        this.ucity = ucity;
    }

    public int register() {
        try {
            connection = JdbcUtil.getDBConnection();
            String query = "insert into personalinfo (uname, email, upassword, ucity) values(?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,uname);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,upassword);
            preparedStatement.setString(4,ucity);
            rows = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.closeResource(connection,preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rows;
    }

}
