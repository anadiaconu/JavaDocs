package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ana.Diaconu on 19-Jul-17.
 */
public class HelloWorldServletForward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("Hello <b>"+req.getParameter("user")+" "+"</b> from the Forward Servlet! "+  req.getAttribute("testAttribute"));
    }
}
