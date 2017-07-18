package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ana.Diaconu on 18-Jul-17.
 */
public class ZeroToHeroServlet extends HttpServlet{
    private String handleRequest (HttpServletRequest req){

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String response = "Hello <b>"+fname+" "+lname+"</b>! Enjoy Zero To Hero!!!";
        return response;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writerUser = resp.getWriter();
        writerUser.write(handleRequest(req));

    }
}
