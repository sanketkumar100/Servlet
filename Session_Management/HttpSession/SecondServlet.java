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

        // Retrieve existing session (do not create new)
        HttpSession session = req.getSession(false);

        out.println("<html><body>");
        if (session != null) {
            String username = (String) session.getAttribute("username");
            out.println("<h2>Welcome back, " + username + "!</h2>");
            out.println("<p>Session ID: " + session.getId() + "</p>");
        } else {
            out.println("<h2>No active session found. Please start again.</h2>");
        }
        out.println("</body></html>");
    }
}
