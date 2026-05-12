import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
    static {
        System.out.println("Servlet is Loaded!!");
    }

    public ServletLife() {
        System.out.println("Servlet Object is Created!!!");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet Initialized!!");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Service method to handle Http request and to response back");
    }

    public void destroy() {

    }
}
