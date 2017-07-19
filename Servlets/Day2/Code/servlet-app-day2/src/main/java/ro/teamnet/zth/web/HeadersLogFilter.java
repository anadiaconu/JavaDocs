package ro.teamnet.zth.web;

import ro.teamnet.zth.file.LogFileWriter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Ana.Diaconu on 19-Jul-17.
 */
public class HeadersLogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req,resp);
        LogFileWriter lfw = new LogFileWriter();
        lfw.logHeader("header","value");

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
