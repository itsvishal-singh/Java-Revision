import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {
    public FirstServletApp() {
        System.out.println("Servlet obj is created internally by the container");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");
        PrintWriter writer = response.getWriter();
//        writer.println("Hello!!! " +name);
//        writer.println("You are from " + city);
        writer.println("<html><head><title>Dynamic Web App</title></head>");
        writer.println("<body>\n" +
                "<h1>Welcome to our Dynamic Web Application </h1>");
        writer.println("<table>\n" +
                "<tr><th>User Name</th><th>User City</th></tr>\n" +
                "<tr><td> "+name+" </td><td> "+city+" </td>");
        writer.println("</table></body></html>");

        writer.close();
    }
}
