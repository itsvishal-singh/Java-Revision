import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Control in the second Servlet");
        HttpSession httpSession = request.getSession(false);
        String name =(String) httpSession.getAttribute("Name");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Response from Second servlet</h1>" + "<h1>" + name + "</h1>");
        writer.close();
    }
}