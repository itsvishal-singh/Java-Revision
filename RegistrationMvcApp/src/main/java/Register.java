import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Register")
public class Register extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String upassword = request.getParameter("password");
        String ucity = request.getParameter("ucity");

        Model model = new Model();
        model.setUname(uname);
        model.setEmail(email);
        model.setUpassword(upassword);
        model.setUcity(ucity);

        int rows = model.register();

        HttpSession httpSession = request.getSession();

        httpSession.setAttribute("name", uname);
        if(rows == 0)
            response.sendRedirect("failure.jsp");
        else response.sendRedirect("success.jsp");
    }
}
