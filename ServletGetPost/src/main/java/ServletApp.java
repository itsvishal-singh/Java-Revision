import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        if(name.equals("Rohan") && city.equals("Pune"))
            System.out.println("Success!!!! ");
        else
            System.out.println("Different Person... ");

    }
}
