package ro.teamnet.zth.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ana.Diaconu on 19-Jul-17.
 */
public class HttpSessionLogin extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");
        if(user.equals("admin")&pass.equals("admin")) {
            resp.getWriter().write("Welcome back " + user + "!");
            resp.getWriter().write("/n The session ID is: " + req.getSession().getId());
        }
       else{
            req.getSession().setAttribute("user",user);
            req.getSession().setAttribute("session", req.getSession());
            RequestDispatcher rd = req.getRequestDispatcher("/views/loginFail.jsp");
            rd.forward(req, resp);
        }

    }
}
