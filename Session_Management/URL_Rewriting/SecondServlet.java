package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Retrieve the username from the URL
        String username = req.getParameter("username");

        out.println("<html><body>");
        if (username != null && !username.isEmpty()) {
            out.println("<h2>Welcome back, " + username + " (via URL rewriting)</h2>");
        } else {
            out.println("<h2>No username found in URL</h2>");
        }
        out.println("</body></html>");
    }
}
