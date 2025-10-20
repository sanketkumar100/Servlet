package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Retrieve hidden field data
        String username = req.getParameter("username");

        out.println("<html><body>");
        out.println("<h2>Hello again, " + username + " (via hidden field)</h2>");
        out.println("</body></html>");
    }
}
