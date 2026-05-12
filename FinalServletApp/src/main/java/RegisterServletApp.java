import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Register")
public class RegisterServletApp extends HttpServlet {
    public RegisterServletApp() {
        System.out.println("Servlet obj is created internally by the container");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");
        System.out.println("Name : " + name + "\nCity : " + city);
        response.sendRedirect("RegisterSuccess.jsp");
    }
}
