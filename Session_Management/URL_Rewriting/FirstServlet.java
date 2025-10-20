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

        // Get username from form
        String username = req.getParameter("username");

        out.println("<html><body>");
        out.println("<h2>Welcome, " + username + "</h2>");

        // Encode the URL (in case cookies are disabled)
        String encodedURL = res.encodeURL("second?username=" + username);

        // Send link with user data in URL
        out.println("<a href='" + encodedURL + "'>Go to Second Servlet</a>");
        out.println("</body></html>");
    }
}
