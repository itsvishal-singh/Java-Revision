
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Register")
public class Register extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) {
        System.out.println("Control in servlet");
        String uname = req.getParameter("uname");
        String email = req.getParameter("email");
        String upassword = req.getParameter("password");
        String ucity = req.getParameter("ucity");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String user = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into personalinfo (uname, email, upassword, ucity) values (?,?,?,?)");
            preparedStatement.setString(1, uname);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, upassword);
            preparedStatement.setString(4, ucity);

            int rowsAffected = preparedStatement.executeUpdate();
            PrintWriter printWriter = res.getWriter();
            if (rowsAffected != 0)
                printWriter.println("<h1>Registration success!!! </h1>");
            else printWriter.println("<h1>Registration failed... </h1>");

            preparedStatement.close();
            connection.close();
            printWriter.close();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
