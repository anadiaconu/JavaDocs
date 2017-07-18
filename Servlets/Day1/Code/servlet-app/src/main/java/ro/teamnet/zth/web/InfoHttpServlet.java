package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by Ana.Diaconu on 18-Jul-17.
 */
public class InfoHttpServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Enumeration<String> htmlHeaders = req.getHeaderNames();
        Enumeration<String> htmlValues;
        String table = "<h1>The method is: "+ req.getMethod()+"</h1><br>";
                table += "<table>";

        while (htmlHeaders.hasMoreElements()){
            String current = htmlHeaders.nextElement();
            table+="<tr>";
            table+="<td>"+current+"</td>";
            htmlValues = req.getHeaders(current);
            while(htmlValues.hasMoreElements()){
                String val = htmlValues.nextElement();
                table+="<td>"+val+"</td>";
            }
            table+="</tr>";
        }
        table+="</table>";

        table +="<h1>First Name: "+req.getParameter("f1name")+"<br> Last Name: "
                +req.getParameter("l1name")+"</h1>";

//        Cookie [] cookies = req.getCookies();
//        if (cookies.length==0)
//            table+="<p>NO COOKIES!!!</p>";
//        else {
//            table += "<p>Cookies: ";
//            for (Cookie c : cookies)
//                table += "<p>" + c + "</p>";
//            table += "</p>";
//        }
        resp.getWriter().write(table);
    }
}
