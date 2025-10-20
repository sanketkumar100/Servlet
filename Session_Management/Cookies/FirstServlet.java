package org.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Get user input
        String username = req.getParameter("username");

        // Create a cookie with key-value
        Cookie ck = new Cookie("user", username);

        // Add cookie to response
        res.addCookie(ck);

        out.println("<html><body>");
        out.println("<h2>Welcome, " + username + "</h2>");

        out.println("<a href='second'>Go to Second Servlet</a>"); //accesing 2nd servlet using its name used for mapping
        out.println("</body></html>");

    }
}
