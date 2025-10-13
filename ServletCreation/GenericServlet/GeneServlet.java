package org.example;

import java.io.*;
import javax.servlet.*;

public class GeneServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Read a parameter, for example "username"
        String username = req.getParameter("username");

        out.println("<html><body>");
        if (username != null && !username.isEmpty()) {
            out.println("<h2>Hello, " + username + " from GenericServlet</h2>");
        } else
        {
            out.println("<h2>Hello without username from GenericServlet</h2>");
        }
        out.println("</body></html>");
    }
}
