package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String username = req.getParameter("username");

        // Create or get an existing session
        HttpSession session = req.getSession();

        // Store data in session
        session.setAttribute("username", username);

        out.println("<html><body>");
        out.println("<h2>Welcome, " + username + "!</h2>");
        out.println("<p>Session created successfully.</p>");
        out.println("<form action='second' method='post'>");
        out.println("<input type='submit' value='Go to Next Page'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
