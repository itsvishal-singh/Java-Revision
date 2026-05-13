import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Control in the First Servlet...");
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("Name", name);
        httpSession.setMaxInactiveInterval(10000);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SecondServlet");

        requestDispatcher.forward(request, response);

//        requestDispatcher.include(request,response);

        PrintWriter writer = response.getWriter();

        writer.println("<h1>Response from first servlet</h1>");
        writer.close();
//        System.out.println("Control again in the First Servlet...");
    }
}
